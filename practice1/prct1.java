import java.util.Arrays;
import java.util.Random;

public class prct1{

    public static int get_factorial(int factorial_base){
        int factorial_result = 1;
        for (int i = 1; i <= factorial_base; i++) {
            factorial_result *= i;
        }
        return factorial_result;
    }

    public static void main (String args[]) {

        int[] array1 = { 2, 3, 4 };
        System.out.println("Array sum = " + Arrays.stream(array1).sum());

        System.out.println("Arguments = " + Arrays.toString(args));

        int num = 7; // amount of numbers
        double result = 0.0;
        System.out.print("Garmonic row: ");
        while (num > 0) {
            result = result + (double)1 / num;
            num--;
            System.out.printf("%f, ", result);// formatted output
        }

        int[] array = new int[(int) (Math.random() * 15)];
        for (int i =0; i < array.length; i++){
            array[i] = (int) (Math.random() * 1000);
        }

        Random random = new Random();
        int[] arrayR = new int[(int) (random.nextInt(15))];
        for (int i =0; i < arrayR.length; i++){
            arrayR[i] = (int) (random.nextInt(1000));
        }

        System.out.println("\nRandomized with Random: " + Arrays.toString(arrayR));
        Arrays.sort(arrayR);
        System.out.println("Sorted Random: " + Arrays.toString(arrayR));

        System.out.println("Randomized with Math.random: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Math.random: " + Arrays.toString(array));

        java.util.Scanner in = new java.util.Scanner(System.in, "ibm866");
        System.out.print("Type a number for factorial: ");
        int factorial_base = in.nextInt();
        in.close();

        System.out.println("Factorial result: " + get_factorial(factorial_base));
    }
}