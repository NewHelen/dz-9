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

    abstract public boolean isRetired(int age);

    abstract public void registerPartnership(Person partner);

    abstract public void deregisterPartnership(boolean returnToPreviousLastName);

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public int getAge() {return age;}

    public Person getPartner() {return partner;}

    public void setPartner(Person partner) {this.partner = partner;}

    public String getPreviousLastName() {
        return previousLastName;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }
}