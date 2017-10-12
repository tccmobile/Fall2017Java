public class testPerson {

    public static void main(String arg[]){
        Person one = new Person();
        Person two = new Person();
        Person three = new Person("Jane Doe", 35);

        one.setAge(17);
        System.out.println("one = " + one);

        two.setAge(42);
        System.out.println("two = " + two);
        System.out.println("three = " + three);


        three.setAge(85);
        System.out.println("three = " + three);

    }
}
