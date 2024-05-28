public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int hight = list.length - 1;
        while (hight >= low) {
            int mid = (low + hight) / 2;
            if (key > list[mid]) {
                low = mid + 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                hight = mid - 1;
            }
        }
        return -1;
    }

}

