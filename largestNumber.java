public class largestNumber {

    public static void large(int arr[]){
        int large1 = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(large1<arr[i])
            {
                large1 = arr[i];
            }
        }
        System.out.println(large1);


    }

    public static void main(String[] args) {
        int[] arr = {55,33,75,93,87};
        large(arr);
        

    }
    
}
