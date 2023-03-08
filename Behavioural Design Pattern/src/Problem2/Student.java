package Problem2;

public class Student extends Person{
    private double mark;

    public Student(ExamController mediator,String str) {
        examController = mediator;
        examController.addStudent(this);
        name = str;
    }

    public void notify(double mark, boolean flag) {
        System.out.println("\n"+name+":");
        if(flag){
            System.out.println("Received mark SID-"+id+" mark-"+mark);
            this.mark = mark;
        }
        else{
            if(this.mark!=mark)
                System.out.println("Received updated mark SID-"+id+" previous mark-"+this.mark+" updated mark-"+mark);
            else
                System.out.println("Result received from exam controller. Mark unchanged");
            this.mark = mark;
        }

    }
    public void sendReExamineReq(){
        System.out.println("\n"+name+":");
        System.out.println("Re-examine request sent from student id "+id);
        examController.send(this,"re-examine request sent");
    }
}
