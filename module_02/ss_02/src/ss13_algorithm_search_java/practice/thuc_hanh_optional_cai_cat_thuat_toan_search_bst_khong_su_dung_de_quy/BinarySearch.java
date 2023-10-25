package ss13_algorithm_search_java.practice.thuc_hanh_optional_cai_cat_thuat_toan_search_bst_khong_su_dung_de_quy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(array, 3));
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (high > low) {
            mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
