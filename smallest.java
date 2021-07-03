public class smallest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};

        int min = arr[0];

        for(int i=0;i<arr.length; i++)
        {
            if(min>arr[i])
            {
                min= arr[i];
            }
        }
        System.out.println("smallest number in the array :- "+min);
    }
    
}
