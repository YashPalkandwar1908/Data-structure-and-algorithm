
public class reversingArray {

    public static void reverse(int number[]){
        int first=0,last=number.length-1;

        while (first<last) {
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[]={45,67,12,40,98,9};
        
        for(int i = 0; i<=number.length-1;i++){
            System.out.print(number[i]+", ");
        }
        System.out.println();

        reverse(number);

        for(int i = 0; i<=number.length-1;i++){
            System.out.print(number[i]+", ");
        }
    }
}
