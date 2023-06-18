public class Main {
    public static void main(String[] args) {

        DesignOffice designOffice = new DesignOffice();

        TechnicalTask task1 = new TechnicalTask(1, "Проектирование многоэтажного дома");
        TechnicalTask task2 = new TechnicalTask(2, "Проектирование здания офисного комплекса");

        Constructor constructor1 = new Constructor(1, "Иванов");
        Constructor constructor2 = new Constructor(2, "Петров");

        designOffice.registerTechnicalTask(task1);
        designOffice.registerTechnicalTask(task2);

        designOffice.assignConstructor(constructor1);
        designOffice.assignConstructor(constructor2);

        designOffice.createProject(task1, constructor1);
        designOffice.createProject(task2, constructor2);
    }
}