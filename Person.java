public class Person {
    private int id;
    private String name="unkown";
    private int age;
    private boolean parent_Permission=true;


    public Person( String name, int age, boolean parent_Permission) {
        this.name = name;
        this.age = age;
        this.parent_Permission = parent_Permission;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isOf_Age() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return isOf_Age() || parent_Permission;
    }
}
