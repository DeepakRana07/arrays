import java.util.*;
public class duplicate {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
       int arr[]= {12,34,12,34,67,89};
          
       int c=0;
       for( int i=0;i<arr.length;i++)
       {
         for( int j=i+1;j<arr.length;j++)
         {
            if(arr[i]==arr[j])
            {
              
               System.out.println("#");

            }
            //   int c=0;

            else {

                if(c!=arr[j])
                
                {
                    c=arr[j];


                System.out.println(c);

                 }
         }
       }

    }
    }
}
