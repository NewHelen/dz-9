import base.Person;

public class Woman extends Person {

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired(int age) {
        return (age > 60) ? true : false;
    }

    @Override
    public void registerPartnership(Person man) {
        if (partner == null && man.getPartner() == null) {
            this.previousLastName = this.lastName;
            man.setPartner(this);
            this.partner = man;
            this.lastName = man.getLastName();
        }
    }

    @Override
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (partner != null) {
            // Повертаємо попереднє прізвище
            if (returnToPreviousLastName) {
                this.lastName = this.previousLastName;
                // Знімаємо партнерство
                this.partner = null;
            }
        }
    }
}
