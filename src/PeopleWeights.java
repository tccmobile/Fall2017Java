import java.util.Scanner;

public class PeopleWeights {


    public static void main(String arg[]){

        double [] weight = new double[5];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<weight.length; i++){
            System.out.println("Enter weight "+(i+1)+":");
            weight[i] = scanner.nextDouble();
        }

        double sumOfWeights = 0.0;
        double averageOfWeights = 0.0;
        double maxOfWeights = 0.0;
        System.out.print("You entered: ");
        for (int i=0; i<weight.length; i++){
            sumOfWeights += weight[i];
            if (weight[i]>maxOfWeights){
                maxOfWeights =weight[i];
            }
            System.out.print(weight[i]+" ");
        }

        System.out.println();
        System.out.println("Total weight: "+sumOfWeights);
        System.out.println("Average weight: "+(sumOfWeights/weight.length));
        System.out.println("Max weight: "+maxOfWeights);

    }
}
