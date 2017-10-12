public class ParameterExample {

    public static void myfunc(int myVal){

        System.out.println("Inside function");
        System.out.println("myVal = " + myVal);
        myVal += 42;
        System.out.println("myVal = " + myVal);
    }

    public static String myOtherFunc(String name){
        System.out.println("Inside function");
        System.out.println("name = " + name);
        name = name.toUpperCase();
        System.out.println("name = " + name);
        return name;

    }

    public static void stillAnotherFunc(String[] names){
        System.out.println("Inside function");
        System.out.println("names = " + names);
        names[0] = "Carl";
        System.out.println("names = " + names);

    }
    public static void main(String arg[]){

        int myVal = 17;
        String name = "bob";
        String[] names = new String[5];


   /*     System.out.println("myVal = " + myVal);
        myfunc(myVal);
        System.out.println("Back in main");
        System.out.println("myVal = " + myVal);

*/
        System.out.println("name = " + name);
        name = myOtherFunc(name);
        System.out.println("Back in main");
        System.out.println("name = " + name);

/*
        names[0]= name;
        System.out.println("names = " + names);
        stillAnotherFunc(names);
        System.out.println("names = " + names);
        */
    }
}
