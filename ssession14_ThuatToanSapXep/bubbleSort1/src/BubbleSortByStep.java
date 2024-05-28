import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("nhap vao tung phan tu cho mang:");

        for(int i=0 ; i<list.length ;i++){
            System.out.print("nhap phan tu thu "+ i + "cua mang:");
            list[i] = sc.nextInt();
        }

        System.out.println("mang moi vua nhap la:");
        for(int i=0 ; i< list.length;i++){
            System.out.print(list[i]+" ");
        }

        System.out.println("Dang sap xep.....");
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list){
        boolean needNextPass = true;

        for(int k =0 ; k<list.length -1 && needNextPass ;k++){
            needNextPass = false;
            for(int i=0 ; i< list.length-1-k;i++){
                if(list[i]>list[i+1]){
                    System.out.println("doi"+list[i]+ "voi "+list[i+1]);
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    needNextPass = true;
                }
            }
            if(needNextPass==false){
                System.out.println("Mang da duoc sap xep");
                break;
            }

            System.out.println("mang sau lan " + k +" sap xep la:");
            for(int j = 0; j<list.length ;j++){
                System.out.print(list[j]+" ");
            }

        }
    }
}
