public class NegativeDominance {
   public static void main(String args[]){

    int[] num = {-1,2,5,7,-6};
    int count_positive = 0 , count_negative = 0 ;
    for (int i =0; i<num.length; i++){
        if (num[i]<0){
            count_negative += 1;
        }
        else {
            count_positive +=1;
        }
   } 
   if (count_negative >= count_positive){
    System.out.println("Negatively dominant array");
   }
   else {
    System.out.println("Positively dominant array");
   };
}
}
