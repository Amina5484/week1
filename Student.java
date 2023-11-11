class Student extends Person {
    private String classroom;
//here is student class
    public Student( String name, int age, boolean parent_permission,String classroom) {
        super( name, age,parent_permission);
        this.classroom = classroom;
    }
}
