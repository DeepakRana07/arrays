public class intersection {
    
    public static void main(String[] args) {
        
        int arr []={11,12,4,51,88};
        int arr2 []={10,2,12,5,11};

        // for( int i=0;i<5;i++)
        // {
        //     if(arr[i]==arr2[i])
        //     {
        //         System.out.println("Intersection at:"+arr[i] +" "+arr2[i]);
        //     }
        // }

        // System.out.print(" by value:");

        for( int i=0;i<5;i++)
        {
            for( int j=0;j<5;j++)
            {
                if (arr[i]==arr2[j])
                {
                    System.out.println( arr[i]);
                }
            }
        }

    }
}
