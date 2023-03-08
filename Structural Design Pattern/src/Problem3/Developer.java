package Problem3;

public class Developer extends Employee{

    public Developer(String name, Component manager) {
        super(name, manager.getProjectName(),"Developer");
        manager.addDeveloper(this);
    }

    @Override
    public void hierarchy(int space) {
        if(space==1)
            System.out.println("\t- "+name);
        else  if(space==2)
            System.out.println("\t\t- "+name);
        else
            System.out.println("\t\t\t- "+name);
    }

    @Override
    public void details() {
        System.out.println("Name: "+name);
        System.out.println("Role: "+role);
        System.out.println("Current Project: "+projectName);
    }

    @Override
    public void addDeveloper(Component dev) {

    }

    @Override
    public void removeDeveloper(Component developer) {

    }


    @Override
    public int getChildSize() {
        return 0;
    }

    @Override
    public Component getChild(String name) {
        return null;
    }
}
