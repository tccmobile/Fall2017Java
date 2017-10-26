public class child {

    private String name;
    private int age;
    private boolean happy;

    public child() {
        name = "Bob";
        age = 8;
        happy = false;
    }

    public child(String name, int age, boolean happy) {
        this.name = name;
        this.age = age;
        this.happy = happy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public void plays(){
        if (isHappy()){
            setHappy(false);
        } else {
            setHappy(true);
        }
    }
}
