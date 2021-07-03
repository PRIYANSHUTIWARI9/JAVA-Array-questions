public class leftRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n=3;
        for(int j=0;j<n;j++)
        {   
            int i, first;
            first=arr[0];
            for ( i= 0; i < arr.length - 1; i++) {
                
                arr[i] = arr[i + 1];
            }
            arr[i] = first;
        }
        

        for(int i=0;i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
