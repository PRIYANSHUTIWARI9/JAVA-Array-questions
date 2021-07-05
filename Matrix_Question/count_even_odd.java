package Matrix_Question;

public class count_even_odd {
    public static void main(String[] args) {
        int count1=0, count2=0;
        int[][] arr = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i][j]%2 ==0)
                {
                    count1 = count1+1;
                }
                else
                {
                    count2 = count2+1;
                }
            }
            
        }
        System.out.println("The number of even number in matrix :-  " + count1);
        System.out.println("The number of odd number in matrix :-  " + count2);
        
    }
    
}
