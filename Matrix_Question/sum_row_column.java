package Matrix_Question;

public class sum_row_column {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 2, 3, 4 }, { 8, 4, 5 } };

    for(int i=0; i<arr.length; i++)
    {
        int sum=0;
        for(int j=0; j<arr.length; j++)
        {
            sum = sum +arr[i][j];
        }
        System.out.println("sum of row " + (i+1) +":- " + sum );
    }
    for(int i=0; i<arr.length; i++)
    {
        int sum=0;
        for(int j=0; j<arr.length; j++)
        {
            sum = sum +arr[j][i];
        }
        System.out.println("sum of column " + (i+1) +":- " + sum );
    }
    }
    
}
