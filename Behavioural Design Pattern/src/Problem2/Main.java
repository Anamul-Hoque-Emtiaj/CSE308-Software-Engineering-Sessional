package Problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberOfStudents = 5;
        ExamController examController = new ExamController(numberOfStudents);

        Examiner examiner = new Examiner(examController,"Examiner",numberOfStudents);

        Student student1 = new Student(examController,"Student1");
        Student student2 = new Student(examController,"Student2");
        Student student3 = new Student(examController,"Student3");
        Student student4 = new Student(examController,"Student4");
        Student student5 = new Student(examController,"Student5");

        examiner.sendMarks();

        while (true){
            System.out.println("\nProvide your student id to re-examine");
            int inp = scn.nextInt();
            if(inp==1)
                student1.sendReExamineReq();
            else if (inp==2)
                student2.sendReExamineReq();
            else if (inp==3)
                student3.sendReExamineReq();
            else if (inp==4)
                student4.sendReExamineReq();
            else if (inp==5)
                student5.sendReExamineReq();
            else
                System.out.println("Wrong input given");
        }
    }
}
