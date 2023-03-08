package Problem3;

public interface  Component {
    public void hierarchy(int space);
    public void details();
    public void addProject(Component manager);
    public void removeProject(Component manager);
    public void addDeveloper(Component dev);
    public void removeDeveloper(Component developer);
    public int getChildSize();
    public Component getChild(String name);
    public String getName();
    public String getProjectName();
}
