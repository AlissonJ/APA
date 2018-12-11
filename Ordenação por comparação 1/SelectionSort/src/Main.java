import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		int []vetor = GerarVetor.gerarVetor(10);
		System.out.println(Arrays.toString(vetor));
		
		SelectionSort.selectionSort(vetor);
		System.out.print("Vetor ordenado: ");
		System.out.println(Arrays.toString(vetor));

	}

	
	
	
	
	
}
