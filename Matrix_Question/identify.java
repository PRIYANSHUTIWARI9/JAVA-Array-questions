package Matrix_Question;

public class identify {
    public static void main(String[] args) {
        boolean flag = true;
        int[][] a = {{1,0,0}, 
                        {0,1,0}, 
                        {0,0,1}}; 
                        
                        for(int i=0; i<a.length; i++)
                        {
                            for(int j=0; j<a.length; j++)
                            {
                                if(i == j && a[i][j] != 1){    
                                    flag = false;    
                                    break;    
                                }    
                                if(i != j && a[i][j] != 0){    
                                    flag = false;    
                                    break;    
                                }    
                            }
                        } 
                        if(flag)
                        {
                            System.out.println("identify");
                        }               
                        else
                        {
                            System.out.println("not identify");
                        }
    }
}
