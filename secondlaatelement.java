
public class secondlaatelement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int temp=0;
        int j;

        for(int i=0;i<arr.length;i++)
        {
            for( j=i+1 ; j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int seclarge = arr[arr.length -2];

        System.out.println("second largest element is " + seclarge);
    }
}

























