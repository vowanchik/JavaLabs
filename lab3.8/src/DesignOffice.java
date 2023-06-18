import java.util.ArrayList;
import java.util.List;
class DesignOffice {
    private List<TechnicalTask> technicalTasks;
    private List<Project> projects;
    private ConstructionTeam constructionTeam;

    public DesignOffice() {
        technicalTasks = new ArrayList<>();
        projects = new ArrayList<>();
        constructionTeam = new ConstructionTeam();
    }

    public void registerTechnicalTask(TechnicalTask task) {
        technicalTasks.add(task);
    }

    public void assignConstructor(Constructor constructor) {
        constructionTeam.addConstructor(constructor);
    }

    public void createProject(TechnicalTask task, Constructor constructor) {
        if (technicalTasks.contains(task) && constructionTeam.getConstructors().contains(constructor)) {
            Project project = new Project(task, constructor);
            projects.add(project);
        } else {
            System.out.println("Невозможно создать проект. ТЗ или конструктор не найдены.");
        }
    }
}
