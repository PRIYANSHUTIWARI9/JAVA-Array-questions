public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};

        for(int i=0; i<arr.length; i++)
        {
            int count = 1;
            for(int j=i+1;j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count > 1)
            {
                System.out.println(arr[i]);
            }
        }
    }
    
}
