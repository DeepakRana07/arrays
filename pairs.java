public class pairs {
    
    public static void main(String[] args) {
        
        int arr[] ={6,4,5,5,10};
        int pair=10;

        for( int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==10)
                {
                    System.out.println(arr[i]+ "," +arr[j]);
                }
            }
        }
    }
}
