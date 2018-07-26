import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] vetor1 = {5, 4, 2, 6, 1, 3, 2};
        int[] vetor2 = {5, 4, 2, 9, 1, 3, 15};
        System.out.println("Vetor1 de entrada:");
        System.out.println(Arrays.toString(vetor1));

        System.out.println("Vetor2 de entrada:");
        System.out.println(Arrays.toString(vetor1));


        InsertionSort in = new InsertionSort();
        SelectionSort sels = new SelectionSort();

        // Insertion Sort
        in.insertionSort(vetor1);
        System.out.println("Insertion Sort: ");
        System.out.println(Arrays.toString(vetor1));

        // Selection Sort
        sels.selectionSort(vetor2);
        System.out.println("Selection Sort: ");
        System.out.println(Arrays.toString(vetor2));


    }

}



