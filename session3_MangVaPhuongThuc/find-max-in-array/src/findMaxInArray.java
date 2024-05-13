import java.util.Scanner;

public class findMaxInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("khong nhap qua 20");
            }
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.print("Nhap phan tu thu "+(i+1) +" cua mang: ");
            array[i]=sc.nextInt();
            i++;
        }

        System.out.print("Danh sach tai san la: ");
        for(int j = 0; j<array.length ;j++){
            System.out.print(array[j]+" ");
        }

        int max = array[0];
        int index = 0;
        for(int j=0 ; j<array.length ;j++){
            if(array[j]>max){
                max = array[j];
                index += j;
            }
        }
        System.out.print("tai san lon nhat la: "+max +" vi tri thu "+index);











    }
}
