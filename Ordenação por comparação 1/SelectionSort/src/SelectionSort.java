import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] vetor) { 
		int i;
		int min;
		for(i=0; i< vetor.length; i++) {
			min = i;
			for(int j = i+1; j< vetor.length; j++) {
				if(vetor[j]<vetor[min]) {
					min = j;
				}
			}
			if(vetor[i] != vetor[min]) {
				int temp = vetor[i];
				vetor[i] = vetor[min];
				vetor[min] = temp;
			}
			//System.out.println(Arrays.toString(vetor));
		}
	}
	
}
