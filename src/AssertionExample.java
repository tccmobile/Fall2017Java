class AssertionExample{
    public static void main( String args[] ){

       MyNum one = new MyNum();

       int valToTest = 42;

        assert one.isEven(valToTest)==false:one.isEven(valToTest)+" is not even";

        System.out.println("Reality works!");
    }
}
