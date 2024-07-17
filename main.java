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
        long startTime=0;
        long endTime=0;
        switch (choice) {
            case 1:
                startTime = System.nanoTime();
                selectionSort(arr);
                endTime =  System.nanoTime();
                break;
            case 2:
                startTime = System.nanoTime();
                quickSort(arr);
                endTime = System.nanoTime();
                break;
            case 3:
                startTime = System.nanoTime();
                mergeSort(arr);
                endTime = System.nanoTime();
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
        System.out.println("Time taken for your selected sorting algo"+(endTime - startTime) / 1_000_000_000.0+" seconds");
        scanner.close();
    }
    
    public static void selectionSort(int []arr) {
        System.out.println("Selection Sort Algorithm");

        // Implementation of Selection Sort
    }
    
    public static void quickSort(int []arr) {
        System.out.println("Quick Sort Algorithm");
        // Implementation of Quick Sort
    }
    
    public static void mergeSort(int[] arr) {
        System.out.println("Merge Sort Algorithm");
        // Implementation of Merge Sort
    }
    
    public static void insertionSort(int arr[]) {
        System.out.println("Insertion Sort Algorithm");
       
        System.out.println("Array before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }

        System.out.println("\nSorting using Insertion Sort:");
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

        System.out.println("\nArray after sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
    }
}