public class Max_sunarry_sum_prefix {
    public static void subArraysump(int number[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0]=number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+number[i];
        }

            for (int i = 0; i < prefix.length; i++) {
                for (int j = i; j < prefix.length; j++) {

                    currSum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];

                    if (maxSum<currSum) {
                        maxSum=currSum;
                    }
                    
                }
                
            }
        
        System.out.println("MAX SUM = "+maxSum);

    }



    public static void main(String[] args) {
        
        int number[]={1,-2,6,-2,3};
        subArraysump(number);
    }
}
