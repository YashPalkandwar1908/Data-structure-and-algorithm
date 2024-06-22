package Pattern;

public class Half_Pyramid_Pattern {
    public static void main(String[] args) {
        
        for (int lines = 1; lines <= 4; lines++) {
            for (int star = 1; star <= lines; star++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}

