import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] vetor = GerarVetor.gerarVetor(10);
		System.out.print("antes de ordenar:");
		System.out.println(Arrays.toString(vetor));
		
		InsertionSort inSort = new InsertionSort();
		inSort.insertionSort(vetor);
		
		System.out.print("Vetor ordenado:");
		System.out.println(Arrays.toString(vetor));

	

	}
}
