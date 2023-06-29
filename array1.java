import java .util.*;
public class array1 {
    
    public static void main(String[] args) {
        
        int arr [] ={11,34,5,7,500,88,4};
         int largest = 0;
          int min=arr[0];
        for( int i =0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
                // min=largest;
            }

            if(min>arr[i])
            {
             min =arr[i];

            }

            
        }
        
        System.out.print(" the lagest number is :" +largest);
        System.out.print(" the lagest number is :" +min);
}
}
