import java.util.*;

class Right_Next_Greater_Element{

    public static void nextGreaterElement(int arr[]){
        int nextGreaterElementArray[] = new int [arr.length];
        Stack <Integer> s = new Stack <>();

        for(int i = arr.length-1 ; i >= 0 ; i--){

            if(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextGreaterElementArray[i] = -1;
            }
            else{
                nextGreaterElementArray[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i = 0 ; i < arr.length  ; i++){
            System.out.print(nextGreaterElementArray[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        nextGreaterElement(arr);
    }
}