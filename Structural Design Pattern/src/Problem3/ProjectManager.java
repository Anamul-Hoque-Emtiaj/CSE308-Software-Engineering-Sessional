package Problem3;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager extends Employee{

    List<Component> developers;

    public ProjectManager(String name, String pname,Component company) {
        super(name, pname, "Project Manager");
        developers = new ArrayList<Component>();
        company.addProject(this);
    }

    @Override
    public void hierarchy(int space) {
        if(space==1){
            System.out.println("\t- "+name+" ("+projectName+")");
            for (Component dev: developers){
                dev.hierarchy(2);
            }
        }
        else{
            System.out.println("\t\t- "+name+" ("+projectName+")");
            for (Component dev: developers){
                dev.hierarchy(3);
            }
        }
    }

    @Override
    public void details() {
        System.out.println("Name: "+name);
        System.out.println("Role: "+role);
        System.out.println("Current Project: "+projectName);
        System.out.println("Number of Supervisees: "+developers.size());
    }

    @Override
    public void addDeveloper(Component dev) {
        developers.add(dev);
    }

    @Override
    public void removeDeveloper(Component developer) {
        if(developer!=null){
            developers.remove(developer);
            System.out.println("Developer removed successfully");
        }
        else
            System.out.println("Developer not found");
    }

    @Override
    public int getChildSize() {
        return developers.size();
    }

    @Override
    public Component getChild(String name) {
        Component developer = null;
        for(Component dev: developers){
            if(dev.getName().equalsIgnoreCase(name)){
                developer = dev;
            }
        }
        return developer;
    }
}
