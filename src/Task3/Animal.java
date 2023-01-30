package Task3;

public class Animal {
    private String type = "животное";    // вид животного
    private String name;    // имя
    private String colour;  // цвет
    private int weight;  // вес
    private int height;  // рост
    private boolean gender; // пол (true - мужской, false - женский)

    public Animal(String name, String colour, int weight, int height, boolean gender) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return type + ' ' + name + ' ';
    }
}
