public class Hollow_Rectangle {
    public static void main(String[] args) {
        int totalrows=5,totalcol=4;

        for(int i=1;i<=totalrows;i++){
            for (int j = 1; j <= totalcol; j++) {
                if(i==1||i==totalrows||j==1||j==totalcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
