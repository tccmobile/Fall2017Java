interface MyInterface {
    default void defaultMethod(){
        System.out.println("Default");
    }

    static void staticMethod(){
        System.out.println("Static");
    }
}

public class MyClass implements MyInterface {

    public static void main(String[] args) {

        MyClass.staticMethod(); //not valid - static method may be invoked on containing interface class only
        MyInterface.staticMethod(); //valid
    }
}