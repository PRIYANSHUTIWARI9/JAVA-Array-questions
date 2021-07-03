public class largest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};

        int max = arr[0];

        for(int i=0;i<arr.length; i++)
        {
            if(max<arr[i])
            {
                max= arr[i];
            }
        }
        System.out.println("Largest number in the array :- "+max);
    }
    
}
