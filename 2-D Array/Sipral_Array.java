public class Sipral_Array {


public static void Sipral_Array_Print(int Matrix[][]){
    int startRow=0;
    int endRow=Matrix.length-1;
    int startCol=0;
    int endCol=Matrix[0].length-1;

    while (startRow<=endRow && startCol<=endCol) {
        for(int j=startCol; j<=endCol;j++){
            System.out.print(Matrix[startRow][j]+" ");
        }

        for (int i = startRow+1; i <= endRow; i++) {
            System.out.print(Matrix[i][endCol]+" ");
        }
        
        for(int j=endCol-1; j>=startCol; j--){
            if (startRow==endRow) {
                break;
            }
            System.out.print(Matrix[endRow][j]+" ");
        }
        
        for(int i=endRow-1; i>=startRow+1;i--){
            if (startCol==endCol) {
                break;
            }
            System.out.print(Matrix[i][startCol]+" ");
        }
        startRow++;
        startCol++;
        endRow--;
        endCol--;
    }

}
    public static void main(String[] args) {
        
        int Matrix[][]={{1,2,3,4},
                    {12,13,14,5},
                    {11,16,15,6},
                    {10,9,8,7}}; 

                    Sipral_Array_Print(Matrix);
    }
}