package Task1;

import java.util.ArrayList;

class Human implements InterfaceTree {
    private String lastName;    // Фамилия
    private String firstName;   // Имя
    private String secondName;  // Отчество
    private int yearOfBirth;    // Год рождения
    private boolean gender;     // true - мужской пол; false - женский пол;
    private Human mother;       // Мать
    private Human father;       // Отец
    private ArrayList<Human> siblings = new ArrayList<>();      // Братья и Сестры
    private ArrayList<Human> children = new ArrayList<>();      // Дети
    private static ArrayList<Human> humanArrayList = new ArrayList<>(); // Список экземпляров класса

    public Human(String lastName, String firstName, String secondName, int yearOfBirth, boolean gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        humanArrayList.add(this);
    }

    public Human(String lastName, String firstName, String secondName, int yearOfBirth, boolean gender,
                 Human mother, Human father) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        humanArrayList.add(this);
    }

    public Human(String lastName, String firstName, String secondName, int yearOfBirth, boolean gender,
                 Human mother, Human father, ArrayList<Human> siblings) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        this.siblings = siblings;
        humanArrayList.add(this);
    }

    public Human(String lastName, String firstName, String secondName, int yearOfBirth, boolean gender,
                 Human mother, Human father, ArrayList<Human> siblings, ArrayList<Human> children) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        this.siblings = siblings;
        this.children = children;
        humanArrayList.add(this);
    }

    @Override
    public StringBuilder getSiblings() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.siblings.size(); i++) {
            int k = 1;
            int j = 1;
            if (this.siblings.get(i).gender) {
                sb.append(k + "й" + " брат: " + this.siblings.get(i));
            } else {
                sb.append(j + "я" + " сестра: " + this.siblings.get(i));
            }
        }
        return sb;
    }

    @Override
    public void setSiblings(Human... siblings) {
        for (Human sibling : siblings) {
            this.siblings.add(sibling);
            sibling.siblings.add(this);
        }
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    /**
     * Метод возвращает список экземпляров класса
     */
    public static ArrayList<Human> getHumanArrayList() {
        return humanArrayList;
    }

    @Override
    public StringBuilder getChildren() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.children.size(); i++) {
            sb.append(i + 1 + " ребенок: " + this.children.get(i));
        }
        return sb;
    }

    @Override
    public void setChildren(Human... children) {
        for (Human ch : children) {
            this.children.add(ch);
            if (!this.gender) {
                ch.setMother(this);
            }
            if (this.gender) {
                ch.setFather(this);
            }
        }
    }

    @Override
    public String toString() {
        return lastName + ' ' + firstName + ' ' + secondName + ' ' + yearOfBirth + " г.р.\n";
    }
}
