public class selecttt {
    public static void main(String[] args) {
        int arr[]={11,3,4,2,72};


        for(int i=0;i<arr.length-1;i++)
        {
            
        int min =Integer.MAX_VALUE;
        int mincount=-1;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    mincount=j;

                }
            }

            int temp=arr[i];
            arr[i]=arr[mincount];
            arr[mincount]=temp;
        }

        for(int i=0;i<arr.length;i++)
        {
               System.out.println(arr[i]);
        }


    }
    
}
