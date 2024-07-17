import java.util.Scanner;

public class SortingAlgorithms {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to choose algorithm
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Selection Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Insertion Sort");
        System.out.print("Enter the number of the algorithm: ");
        
        int choice = scanner.nextInt();

        // Execute selected algorithm
        switch (choice) {
            case 1:
                selectionSort();
                break;
            case 2:
                quickSort(arr, 0, n - 1);
                break;
            case 3:
                mergeSort();
                break;
            case 4:
                insertionSort();
                break;
            default:
                System.out.println("Invalid algorithm name");
                break;
        }
        
        scanner.close();
    }
    
    public static void selectionSort() {
        System.out.println("Selection Sort Algorithm");
        // Implementation of Selection Sort
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partitioning index
            int pi = partition(arr, low, high);
            
            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // Index of smaller element
        
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void mergeSort() {
        System.out.println("Merge Sort Algorithm");
        // Implementation of Merge Sort
    }
    
    public static void insertionSort() {
        System.out.println("Insertion Sort Algorithm");
        // Implementation of Insertion Sort
    }
}
