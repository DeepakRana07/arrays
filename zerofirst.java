import java.util.*;
public class zerofirst {
    /**
     * 
     */
    public static void main(String[] args) {
        
        int arr[]={12,3,0,9,8,0,1,0};
        int count=0;

        for( int i =0;i<arr.length; i++)
        {
            
            if(arr[i]==0)
            {
                System.out.print("0");
                count++; 
            
            }


        }

        for( int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                System.out.print(arr[i]);
            }
        }
    }
}
