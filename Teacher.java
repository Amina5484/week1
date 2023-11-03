class Teacher extends Person {
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    private String specialization;

    public Teacher( String name, int age, boolean parent_permission,String specialization) {
        super( name, age, parent_permission);
        this.specialization = specialization;
    }

    @Override
    public boolean canUseServices() {
        return true;
    }
}