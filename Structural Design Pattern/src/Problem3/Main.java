package Problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Component> companies = new ArrayList<>();

        /*Company company = new Company("Manhattan Company");
        Employee manager1 = new ProjectManager("Alan Turing" ,"CSE308",company);
        Employee dev1 = new Developer("Robert Oppenheimer", manager1);
        Employee dev2 = new Developer("John von Neumann",manager1);
        company.hierarchy(1);
        manager1.details();*/

        while (true){
            System.out.println("---------------");
            System.out.println("1. Create Company");
            System.out.println("2. Remove Company");
            System.out.println("3. Create project and project manager");
            System.out.println("4. Remove project and project manager");
            System.out.println("5. Create Developer");
            System.out.println("6. Remove Developer");
            System.out.println("7. Manager Details");
            System.out.println("8. Company hierarchy");
            System.out.println("9. All Company hierarchy");
            System.out.println("10. Exit");
            System.out.println("Choose your option.");

            String option = scn.nextLine();
            if(option.equalsIgnoreCase("1")){
                System.out.println("Enter company name to create ");
                String cname = scn.nextLine();
                companies.add(new Company(cname));
                System.out.println("Company added successfully");
            }
            else if(option.equalsIgnoreCase("2")){
                System.out.println("Enter company name to remove");
                String cname = scn.nextLine();
                Component com = null;
                for(Component comp: companies){
                    if(comp.getName().equalsIgnoreCase(cname)){
                        com = comp;
                        break;
                    }
                }
                if(com != null){
                    if(com.getChildSize()==0){
                        companies.remove(com);
                        System.out.println("Company removed successfully");
                    }
                    else
                        System.out.println("Cannot delete. Delete all projects and project manager first");
                }
                else
                    System.out.println("Company not found");
            }
            else if(option.equalsIgnoreCase("3")){
                System.out.println("Enter company name where you want to add project manager");
                String cname = scn.nextLine();
                Component com = null;
                for(Component comp: companies){
                    if(comp.getName().equalsIgnoreCase(cname)){
                        com = comp;
                        break;
                    }
                }
                if(com != null){
                    System.out.println("Enter project name");
                    String pname = scn.nextLine();
                    System.out.println("Enter project manager name");
                    String mname = scn.nextLine();
                    Component  manager = new ProjectManager(mname,pname,com);
                    System.out.println("Project manager and project added successfully");
                }
                else
                    System.out.println("Company not found");
            }
            else if(option.equalsIgnoreCase("4")){
                System.out.println("Enter company name from which you want to remove project");
                String cname = scn.nextLine();
                Component com = null;
                for(Component comp: companies){
                    if(comp.getName().equalsIgnoreCase(cname)){
                        com = comp;
                        break;
                    }
                }
                if(com != null){
                    System.out.println("Enter project manager name to remove");
                    String mname = scn.nextLine();
                    com.removeProject(com.getChild(mname));
                }
                else
                    System.out.println("Company not found");
            }
            else if(option.equalsIgnoreCase("5")){
                System.out.println("Enter company name where you want to add Developer");
                String cname = scn.nextLine();
                Component com = null;
                for(Component comp: companies){
                    if(comp.getName().equalsIgnoreCase(cname)){
                        com = comp;
                        break;
                    }
                }
                if(com != null){
                    System.out.println("Enter developer's project manager name");
                    String mname = scn.nextLine();
                    Component manager = com.getChild(mname);
                    if(manager!=null){
                        System.out.println("Enter developer name");
                        String dname = scn.nextLine();
                        Employee dev = new Developer(dname,manager);
                        System.out.println("Developer Added successfully");
                    }
                    else
                        System.out.println("Manager not found");
                }
                else
                    System.out.println("Company not found");
            }
            else if(option.equalsIgnoreCase("6")){
                System.out.println("Enter company name from which you want to remove Developer");
                String cname = scn.nextLine();
                Component com = null;
                for(Component comp: companies){
                    if(comp.getName().equalsIgnoreCase(cname)){
                        com = comp;
                        break;
                    }
                }
                if(com != null){
                    System.out.println("Enter developer's project manager name");
                    String mname = scn.nextLine();
                    Component manager = com.getChild(mname);
                    if(manager!=null){
                        System.out.println("Enter developer name");
                        String dname = scn.nextLine();
                        manager.removeDeveloper(manager.getChild(dname));
                    }
                    else
                        System.out.println("Manager not found");
                }
                else
                    System.out.println("Company not found");
            }
            else if(option.equalsIgnoreCase("7")){
                System.out.println("Enter manager's company name");
                String cname = scn.nextLine();
                Component com = null;
                for(Component comp: companies){
                    if(comp.getName().equalsIgnoreCase(cname)){
                        com = comp;
                        break;
                    }
                }
                if(com != null){
                    System.out.println("Enter manager name");
                    String mname = scn.nextLine();
                    Component manager = com.getChild(mname);
                    if(manager!=null){
                        manager.details();
                    }
                    else
                        System.out.println("Manager not found");
                }
                else
                    System.out.println("Company not found");
            }
            else if(option.equalsIgnoreCase("8")){
                System.out.println("Enter company name");
                String cname = scn.nextLine();
                Component com = null;
                for(Component comp: companies){
                    if(comp.getName().equalsIgnoreCase(cname)){
                        com = comp;
                        break;
                    }
                }
                if(com != null){
                    com.hierarchy(1);
                }
                else
                    System.out.println("Company not found");
            }
            else if(option.equalsIgnoreCase("9")){
                for(Component comp: companies){
                    comp.hierarchy(1);
                }
            }
            else if(option.equalsIgnoreCase("10"))
                break;
            else
                System.out.println("wrong input given");
        }
    }
}
