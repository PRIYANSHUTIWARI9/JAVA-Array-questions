package Matrix_Question;

public class equal {
    public static void main(String[] args) {
        boolean flag = true;
        int[][] a = {{1,2,3}, 
                        {2,3,4}, 
                        {3,4,5}};
        int[][] b = {{1,2,3}, 
                        {2,3,4}, 
                        {3,4,5}}; 
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0; j<b.length;j++)
            {
                if(a[i][j] != b[i][j])
                break;

            }
        }   
        if(flag)
        {
            System.out.println("array is equal");
        }   
        else
        {
            System.out.println("array is not equal");
        }          
    }
    
}
