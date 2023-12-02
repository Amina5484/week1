class Teacher extends Person {

    private String specialization;
    

     

    public Teacher( String name, int age,int id, boolean parent_permission,String specialization) {
        super( name, age,id, parent_permission);
        this.specialization = specialization;
    }

    @Override
    public boolean canUseServices() {
        return true;
    }
}
