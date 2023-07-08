public class leaderelement {
    
    public static void main(String[] args) {
        int arr[]={12,3,4,6,7,1,4,2};
        
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            
            for( int j=i+1;j<arr.length;j++)
            {
                
                if(arr[i]<arr[j])
                {
                    count++;
                    break;

                }
            }
            if(count==0)
            {

                System.out.println(arr[i]);
            }

        }
    }
}
