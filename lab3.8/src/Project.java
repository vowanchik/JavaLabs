class Project {
    private TechnicalTask task;
    private Constructor assignedConstructor;

    public Project(TechnicalTask task, Constructor assignedConstructor) {
        this.task = task;
        this.assignedConstructor = assignedConstructor;
    }

    public void calculateCost() {
        double cost = 10000.0; // Пример расчета стоимости проектирования и строительства
        System.out.println("Стоимость проектирования и строительства: $" + cost);
    }
}