package Matrix_Question;

public class lower_triangular {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j > i) {
                    System.out.print("0 ");
                } else {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

}
