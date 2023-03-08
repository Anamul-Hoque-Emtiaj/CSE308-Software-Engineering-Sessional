package Problem2;

public class ExamController implements Mediator{
    private int sNo,count;
    private Student[] students;
    private Examiner examiner;
    private double[] marks;

    public ExamController(int sNo) {
        this.sNo = sNo;
        students = new Student[sNo];
        marks = new double[sNo];
        count = 0;
    }

    @Override
    public void send(Person sender, String msg) {
        if(sender==examiner){
            double[] mrks = examiner.getMarks();
            System.out.println("\nExamController:");
            System.out.println("Received Scripts and marks-");
            System.out.println("SID --- Mark");
            for (int i=0; i<sNo; i++){
                System.out.println((i+1)+" --- "+mrks[i]);
            }
            System.out.println(" --Scrutinization started-- ");
            System.out.println("SID -- Previous Mark -- Corrected Mark");
            for (int i=0; i<sNo; i++){
                double tmp = Math.random();
                if(tmp<0.25){
                    marks[i] = mrks[i]-(tmp*100);
                    System.out.println((i+1)+" -- "+mrks[i]+" -- "+marks[i]);
                }
                else if(tmp>=0.25 && tmp<0.75){
                    marks[i] = mrks[i];
                }
                else{
                    marks[i] = mrks[i]+((tmp*100)-75);
                    System.out.println((i+1)+" -- "+mrks[i]+" -- "+marks[i]);
                }
            }
            System.out.println(" --Scrutinization ended-- ");
            System.out.println("Marks sent to individual students");
            for (int i=0; i<sNo; i++){
                students[i].notify(marks[i],true);
            }
        }
        else {
            int id = sender.getId();
            System.out.println("\nExamController:");
            System.out.println("Re-examine request got from student id "+id);
            System.out.println("Re-examine request sent to examiner");
            double tmp = examiner.notify(id);
            if(tmp!=marks[id-1]){
                System.out.println("\nExamController:");
                System.out.println("Updated mark got from examiner");
                System.out.println("Updated mark sent to student id "+id);
                students[id-1].notify(tmp,false);
            }
            else {
                System.out.println("\nExamController:");
                System.out.println("Result received from examiner. Result unchanged");
                System.out.println("Result sent to student id "+id);
                students[id-1].notify(tmp,false);
            }
        }
    }

    public void addStudent(Student student){
        students[count] = student;
        students[count].setId(count+1);
        count++;
    }

    public void setExaminer(Examiner examiner){
        this.examiner = examiner;
        examiner.setId(0);
    }

}
