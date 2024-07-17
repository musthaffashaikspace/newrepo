import java.util.Scanner;

public class SortingAlgorithms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Prompt user to choose algorithm
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Selection Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Insertion Sort");
        System.out.print("Enter the number of the algorithm: ");

        int choice = scanner.nextInt();

        // Execute selected algorithm
        long startTime = 0;
        long endTime = 0;
        switch (choice) {
            case 1:
                startTime = System.nanoTime();
                selectionSort(arr);
                endTime = System.nanoTime();
                break;
            case 2:
                startTime = System.nanoTime();
                quickSort(arr, 0, arr.length - 1);
                endTime = System.nanoTime();
                System.out.println("Sorted array using Quick Sort:");
                printArray(arr);
                break;
            case 3:
                startTime = System.nanoTime();
                mergeSort(arr, 0, arr.length - 1);
                endTime = System.nanoTime();
                System.out.println("Sorted array using Merge Sort:");
                printArray(arr);
                break;
            case 4:
                startTime = System.nanoTime();
                insertionSort(arr);
                endTime = System.nanoTime();
                break;
            default:
                System.out.println("Invalid algorithm name");
                break;
        }
        System.out.println("Time taken for your selected sorting algo: " + (endTime - startTime) / 1_000_000_000.0 + " seconds");
        scanner.close();
    }

    public static void selectionSort(int[] arr) {
        System.out.println("Selection Sort Algorithm");
        // Implementation of Selection Sort
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[middle + 1 + j];
        }

        // Merge the temporary arrays back into arr[left..right]
        int i = 0, j = 0;
        int k = left; // Initial index of merged subarray

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void insertionSort(int[] arr) {
        System.out.println("Insertion Sort Algorithm");

        System.out.println("Array before sorting:");
        printArray(arr);

        System.out.println("Sorting using Insertion Sort:");
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println("Array after sorting:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
