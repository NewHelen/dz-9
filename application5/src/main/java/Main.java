public class Main {
    public static void main(String[] args) {
        Woman woman1 = new Woman("Ella","Evans",45);
        Woman woman2 = new Woman("Olivia","Bailey",61);
        Man man1 = new Man("Tom","Anderson",67);
        Man man2 = new Man("Daniel","James",48);

        System.out.println("Вік більше пенсійного порогу 60 років - " + woman1.isRetired(woman1.getAge()));
        System.out.println("Вік більше пенсійного порогу 65 років - " + man1.isRetired(man1.getAge()));

        woman1.registerPartnership(man1);
        System.out.println("Нове прізвище - " + woman1.getLastName());

        woman1.deregisterPartnership(true);
        System.out.println("Попередне прізвище - " + woman1.getLastName());

        man2.registerPartnership(woman2);
        System.out.println("Нове прізвище - " + woman2.getLastName());
        man2.deregisterPartnership(true);
        System.out.println("Знімаємо партнерство - " + man2.getPartner());
    }
}