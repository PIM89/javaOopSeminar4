package Task2;

class Human {
    private String surname; // Фамилия
    private String name;    // Имя


    public Human(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ' ';
    }
}
