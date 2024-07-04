
public class largestNumber {

    public static int LN (int number[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[]={65,90,23,88};

        System.out.println("Largest number in the array is "+ LN(number));
    }
}
