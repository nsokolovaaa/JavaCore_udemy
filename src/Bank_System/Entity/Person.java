package Entity;

public class Person {
    private String name;
    private String lastName;
    private int number;

    public Person(String name, String lastName, int number) {
        this.name = name;
        this.lastName = lastName;
        this.number = number;
    }

    public Person() {

    }


    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber(int number) {
        return number;
    }

    public void setPhoneNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                '}';
    }
}
