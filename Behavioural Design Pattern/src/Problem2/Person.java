package Problem2;

public abstract class Person {
    protected ExamController examController;
    protected String name;
    protected int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
