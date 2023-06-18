class Constructor {
    private int constructorId;
    private String name;

    public Constructor(int constructorId, String name) {
        this.constructorId = constructorId;
        this.name = name;
    }

    public int getConstructorId() {
        return constructorId;
    }

    public String getName() {
        return name;
    }

    public void createProject(TechnicalTask task) {
        Project project = new Project(task, this);
        project.calculateCost();
    }
}