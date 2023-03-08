package Problem3;

public abstract class Employee implements Component {
    String name, projectName, role;

    public Employee(String name, String projectName, String role) {
        this.name = name;
        this.projectName = projectName;
        this.role = role;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProjectName() {
        return projectName;
    }

    @Override
    public void addProject(Component manager) {

    }

    @Override
    public void removeProject(Component manager) {

    }

    public String toString(){
        return "Employee Name: "+name+" Project Name: "+projectName+" Role: "+role;
    }
}
