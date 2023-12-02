class Student extends Person {
    private String classroom;

    //here is student class
    public Student(String name, int age,  int id,boolean parent_permission,String classroom) {
        super(name, age, id,parent_permission);

    }
    public String  getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
