import java.util.Scanner;

public class BinarySearch {

        int binarySearch(int array[], int x, int low, int high) {

            if (high >= low) {
                int mid = low + (high - low) / 2;
                if (array[mid] == x)
                    return mid;

                if (array[mid] > x)
//                    System.out.println(array[mid]);
                    return binarySearch(array, x, low, mid - 1);

                return binarySearch(array, x, mid + 1, high);
            }

            return -1;
        }

        public static void main(String args[]) {
            Config config = new Config();
            SaveToDB save = new SaveToDB();

            BinarySearch ob = new BinarySearch();
            int array[] = { 3, 4, 5, 6, 7, 8, 9 };
            int n = array.length;
            int x = 6;
            int result = ob.binarySearch(array, x, 0, n - 1);
            if (result == -1) {
                save.sendToDB("Data tidak ditemukan");
                System.out.println("Not found");
            } else {
                save.sendToDB("Data ditemukan di index ke "+result);
                System.out.println("Element found at index " + result);
            }
        }
}
