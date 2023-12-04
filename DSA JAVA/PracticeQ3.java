import java.util.Scanner;

public class PracticeQ3 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Write the size of the Array: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Write the elements of the Array: ");
        for(int j=0; j<number.length; j++){
            number[j] = sc.nextInt();
        }
         //Logic = we gave "min" the highest value possible in the Java, 
         // vice versa for "max"
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        //Now, we are decrement the min value and increment max value
        // According the Array, we made
        
        System.out.println("The maximum and minimum of the array are: ");
        for (int i=0; i<number.length; i++){
            if (number[i] < min ){
                min = number[i];
            }
            if (number[i] > max){
                max = number[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
        sc.close();
    }
}
