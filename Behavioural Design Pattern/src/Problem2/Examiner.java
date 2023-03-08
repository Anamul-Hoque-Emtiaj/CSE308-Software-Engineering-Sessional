package Problem2;

public class Examiner extends Person{
    private int sNo;
    private double[] marks;

    public Examiner(ExamController mediator, String str, int sNo) {
        this.sNo = sNo;
        marks = new double[sNo];
        examController = mediator;
        mediator.setExaminer(this);
        name = str;
    }

    public double[] getMarks() {
        return marks;
    }

    public void sendMarks(){
        for (int i=0; i<sNo; i++){
            marks[i] = Math.random()*100;
        }
        System.out.println("\n"+name+":");
        System.out.println("Scripts and marks of students sent to exam controller office");
        examController.send(this,"marks sent");
    }

    public double notify(int id){
        System.out.println("\n"+name+":");
        System.out.println("Re-examine request got from examController for SID "+id);

        double tmp = Math.random();
        id--;
        if(tmp<0.25){
            System.out.println("Updated mark sent to exam controller");
            marks[id] = marks[id]-(tmp*100);
        }
        else if(tmp>0.25 && tmp<0.75){
            System.out.println("Mark not changed");
            marks[id] = marks[id];
        }
        else{
            System.out.println("Updated mark sent to exam controller");
            marks[id] = marks[id]+((tmp*100)-75);
        }
        return marks[id];
    }
}
