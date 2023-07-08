import java.util.*;
public class seperatezero {
    public static void main(String[] args) {
         int arr[]={12,0,4,0,7,8,0,0};

         int count=0;

         for( int i=0;i<arr.length;i++)
         {
            if(arr[i]!=0)
            {
                count++;
                System.out.print(arr[i]);

                // 12 4 7 8
                // 4
            }

         }

         while(count<arr.length)
         {
            
            
                System.out.print("0");
            
            count++;
         }

    }
}
