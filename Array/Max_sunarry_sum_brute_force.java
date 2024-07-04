public class Max_sunarry_sum_brute_force {

    public static void subArraysum(int number[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currSum=0;
                for (int k = i; k <= j; k++) {
                   currSum+=number[k];
                }
                if (maxSum<currSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("MAX SUM = "+maxSum);
    }

    public static void main(String[] args) {
        
        int number[]={1,-5,9,-1,7};
        subArraysum(number);

    }
}
