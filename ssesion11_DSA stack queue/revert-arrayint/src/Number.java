import java.util.Stack;

public class Number {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        int [] arr = {2,3,4,5,6,7};

        for(int i =0;i<arr.length;i++){
            num.push(arr[i]);
        }
        System.out.println(num);

        for(int i =0;i<arr.length;i++){
            arr[i] = num.pop();
        }
        for(int ch:arr){
            System.out.print(ch + "");
        }
    }

}
