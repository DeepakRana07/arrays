public class mergesort {

    public static void mergesort(int arr1[],int arr2[])
    {
        
        int a=arr1.length;
        int b=arr2.length;
        int size=a+b;

        int newarr[]=new int [size];

        int i=0;
        int k=0;
        int j=0;

        while(i<a && j<b)
        {
            if(arr1[i]<arr2[j])
            {
                newarr[k]=arr1[i];
                i++;
                k++;

            }
            else
            {
                newarr[k]=arr2[j];
                j++;
                k++;
            }
        }

        for(k=0;k<size-1;k++)
        {
            System.out.println(newarr[k]);
        }


    }
    public static void main(String[] args) {
        int arr1[]={1,3,5,10,15};
        int arr2[]={2,4,11,14,17};

        mergesort(arr1,arr2);
    }
}
