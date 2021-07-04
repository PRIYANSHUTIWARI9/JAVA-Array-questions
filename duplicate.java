public class duplicate {
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,40,50,50};

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
            if(count <= 1)
            {
                System.out.println(arr[i]);
            }
        }
    }
    
}
