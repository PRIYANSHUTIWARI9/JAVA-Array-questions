package Matrix_Question;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 2, 3, 4 }, { 8, 4, 5 } };

        int[][] tran = new int[arr.length][arr.length];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                tran[i][j] = arr[j][i];
            }   
        }
        for(int i=0; i<tran.length; i++)
        {   
            for(int j=0; j<tran.length; j++)
        {
            System.out.print(tran[i][j]+" ");
        }
        System.out.println();           
            
        }
    }
    
}
