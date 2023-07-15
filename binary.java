public class binary {
    
    public static int binary(int arr[], int element)
    {
        int s= 0;
        int l= 5;
    
        while(s<=l)
        {
            int m=(l+s)/2;

            if(arr[m]==element)
            {
                return m;
            }

            else if(arr[m]<element)
            {
                s=m+1;

            }
            else{
                l=m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[]={1,22,33,45,58,89};

        int element=66;

        int res=binary(arr,element);

        if(res==-1)
        {
            System.out.print(" element not found");
        }

        else{
            System.out.print(" element found at index ="+res);
        }


        
    }
}
