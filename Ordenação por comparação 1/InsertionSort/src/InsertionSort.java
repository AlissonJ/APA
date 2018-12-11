import java.util.Arrays;

public class InsertionSort {

	
	public void insertionSort(int[] vetor){
		int pivo;
		int i;
		
		for(i = 1; i < vetor.length; i++) {
			pivo= vetor[i];
			int j = i-1;
			while( (j>=0) && (vetor[j]>pivo) ) {
				vetor[j+1] = vetor[j];
				j = j-1;
			}
			vetor[j+1] = pivo;
			//System.out.println(Arrays.toString(vetor));
		}
	}
	
}
