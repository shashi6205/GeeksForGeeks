import java.util.*;

public class Leaders{

     public static void main(String []args){
        System.out.println("Leaders are ");
        leaders(new int[]{16, 17, 4, 3, 5, 2});
     }
     
     public static void leaders(int []arr){
         List<Integer> res = new ArrayList<Integer>();
         int leader = arr[arr.length-1];
         res.add(leader);
         for(int i=arr.length-1; i>=0; i--){
             if(arr[i] > leader){
                res.add(arr[i]);
                leader = arr[i];
             }
         }
         for(int j=0; j< res.size(); j++){
             System.out.print(res.get(j) + ", ");
         }
     }
}
