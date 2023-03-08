package Problem3;

import java.util.ArrayList;
import java.util.List;

public class Company implements Component {
    String name;
    List<Component> projects;


    public Company(String name) {
        this.name = name;
        projects = new ArrayList<Component>();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProjectName() {
        return null;
    }

    @Override
    public void hierarchy(int space) {
        System.out.println("\t- "+name);
        for (Component project: projects)
            project.hierarchy(2);
    }

    @Override
    public void details() {
        //nothing composite class
    }

    @Override
    public void addProject(Component manager){
        projects.add(manager);
    }

    @Override
    public void removeProject(Component manager) {
        if(manager!=null){
            if(manager.getChildSize()==0){
                projects.remove(manager);
                System.out.println("Manager removed successfully");
            }
            else
                System.out.println("Cannot delete. Delete his/her supervision developer first");
        }
        else
            System.out.println("Manager not found");
    }

    @Override
    public void addDeveloper(Component dev) {

    }

    @Override
    public void removeDeveloper(Component developer) {

    }


    @Override
    public int getChildSize() {
        return projects.size();
    }

    @Override
    public Component getChild(String name) {
        Component manager = null;
        for(Component projectM: projects){
            if(projectM.getName().equalsIgnoreCase(name)){
                manager = projectM;
            }
        }
        return manager;
    }

    public String toString(){
        return "Name: "+name+" Num of running project: "+projects.size();
    }
}
