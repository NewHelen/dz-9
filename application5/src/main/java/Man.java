import base.Person;

public class Man extends Person {

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired(int age) {return (age > 65) ? true : false;}

    @Override
    public void registerPartnership(Person woman) {
        if (partner == null && woman.getPartner() == null){
            woman.setPreviousLastName(woman.getLastName());
            woman.setPartner(this);
            this.partner = woman;
            woman.setLastName(this.lastName);
        }
    }

    @Override
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (partner != null){
            if (returnToPreviousLastName){
                // Знімаємо партнерство
                this.partner = null;
            }
        }
    }
}