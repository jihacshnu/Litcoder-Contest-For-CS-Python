import java.util.*;

public class Alt_signs {
    public static void main(String args[]){
        int[] num = {1,-2,3,-4,5};  
        
    for (int i=0 ; i<num.length; i++){
        if (((num[i+1]<0) && (num[i]<0))||((num[i+1]>0)&& (num[i]>0))){
            System.out.println("The array doesn't alternate between positive and negitive");
            return;
        }
        else if  (((num[i+1]>0) && (num[i]<0))||((num[i+1]>0)&& (num[i]<0))){
            System.out.println("The Array does alternate between Positive and Negative");
            return;}
    }
    
    }
}
