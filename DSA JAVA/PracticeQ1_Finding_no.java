import java.util.*;

public class PracticeQ1_Finding_no {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            //defining the size of the array
            System.out.print("Write the size of the array: ");
            int size = sc.nextInt();
            int[] numbers = new int[size];

            //defining the Array
            System.out.print("Write the elements of the array: ");
            for (int i=0; i<size; i++){
                numbers[i] = sc.nextInt();
            }

            //Finding the elements of the array
            System.out.print("Write the element of the array, you want to find: ");
            int find = sc.nextInt();
            for (int j=0; j<size;j++){
                if (find==numbers[j]){
                    System.out.println("The number you want to find is: "+numbers[j]+"\nThe index of the array is: "+j);
                }
                else{
                    System.out.println("Not Found in the Array");
                };

            };
            sc.close();
        };
}
