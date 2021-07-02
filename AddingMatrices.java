public class AddingMatrices {
    public static void main(String[] args) {
        int[][] a= {{1,2,3},{2,3,6},{3,4,5}};
        int[][] b= {{4,5,6},{5,6,7},{6,7,8}};
        int[][] c= new int[3][3];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
