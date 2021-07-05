package Matrix_Question;

public class mutliple {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, 
                    {2,3,4}, 
                    {3,4,5}};
        int[][] b = {{4,5,6}, 
                    {5,6,7}, 
                    {6,7,8}};
         
        int[][] c = new int[3][3];            
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                c[i][j]  =0;
                for(int k=0 ; k<a.length;k++)
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for(int i =0 ; i<c.length; i++)
        {
            for( int j=0; j<c.length; j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }   
}
