package base;

abstract public class Person {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected Person partner;
    protected String previousLastName;

    protected Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = null;
        this.previousLastName = null;
    }

    public boolean isRetired(int age) {
        return false;
    }

    public void registerPartnership(Person partner) {
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }
    public String getPreviousLastName() {
        return previousLastName;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }
}