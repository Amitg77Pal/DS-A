import java.util.Arrays;

public class ArrayDeletion {
    public static int delete(int[] arr, int size, int key) {
        int i;
        // Find the index of the key to be deleted
        for (i = 0; i < size; i++) {
            if (arr[i] == key) {
                break;
            }
        }

        // If key not found, return original size
        if (i == size) {
            return size;
        }

        // Shift elements to the left to overwrite the deleted element
        for (int j = i; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }

        return size - 1; // Return new size of the array
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 12, 5, 6};
        int size = arr.length;

        int key = 12; // Element to delete
        size = delete(arr, size, key);

        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOf(arr, size)));

        key = 6; // Another element to delete
        size = delete(arr, size, key);

        System.out.println("Updated array after second deletion: " + Arrays.toString(Arrays.copyOf(arr, size)));
    }
}
