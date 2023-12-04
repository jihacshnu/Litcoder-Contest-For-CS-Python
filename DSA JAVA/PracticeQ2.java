//Take an array of names as input from the user and print them on the screen.
import java.util.*;

public class PracticeQ2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the Size of the Array: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        //Input of the Array
        System.out.println("Write elements of the Array:");
        for (int i=0; i<size; i++){
            names[i] = sc.next();
        }

        //Output of the Array
        System.out.println("Elements of the Arrays are:");
        for (int j=0; j<size; j++){
            System.out.println(names[j]);
        }
        sc.close();
    }
}
