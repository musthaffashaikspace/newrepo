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
                quickSort();
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
    
    public static void quickSort() {
        System.out.println("Quick Sort Algorithm");
        // Implementation of Quick Sort
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
