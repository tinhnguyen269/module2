public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list){

        for(int i =0; i<list.length -1;i++){

            double curenMin = list[i];
            int indexCurrenMin = i;

            for(int j = i+1; j< list.length;j++){
                if(curenMin > list[j]){
                     curenMin = list[j];
                     indexCurrenMin = j;
                }
            }

            if(indexCurrenMin != i){
                list[indexCurrenMin] = list[i];
                list[i] = curenMin;
            }
        }
    }
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
