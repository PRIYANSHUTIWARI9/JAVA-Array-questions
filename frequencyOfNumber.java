public class frequencyOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,8,3,2,2,2,5,1};

        
        int[] farr= new int[arr.length];
        int visit = -1;

        for(int i=0; i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    count =count+1;
                    farr[j] = visit;
                }
            }
            if(farr[i] != visit)
            farr[i] = count;
           

        }

        for(int i=0; i<arr.length;i++)
        {
            if(farr[i] != visit)
            System.out.println(arr[i]+"   |   " +farr[i]);
        }
    }
    
}
