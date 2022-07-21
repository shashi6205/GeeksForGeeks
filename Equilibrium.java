import java.util.*;

public class Equilibrium{

     public static void main(String []args){
        System.out.println("Equilibrium index ");
        equilibrium(new int[]{2, 3, 4, 1, 4, 5});
     }
     
     public static void equilibrium(int []arr){
         int size = arr.length;
         int sum = 0;
         int left = arr[0], right = 0;
         if(size <= 0){
             System.out.print("is " + -1);
         }else if(size == 1){
             System.out.print("is " + arr[0]);
         }else{
             for(int j=0; j< size; j++){
                 sum += arr[j];
             }
             for(int i=1; i< size; i++){
                 right = sum - left - arr[i];
                 if (left == right){
                     System.out.print("is " + i);
                     break;
                 }
                 left += arr[i];
             }
         }
     }
}
