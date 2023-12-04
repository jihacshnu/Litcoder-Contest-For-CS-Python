import java.util.*;

public class Intialisation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the Size of the Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Write the Elements of the Array: ");
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("The output of the Array: ");
        for (int i=0; i<size; i++){
            System.out.println(numbers[i]);

        }
        sc.close();
    }
}