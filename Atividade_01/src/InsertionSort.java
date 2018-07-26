public class InsertionSort {

    public void insertionSort(int[] vetor){
        int j;
        int k;
        int i;

        for (j = 1; j<vetor.length;j++){
            k = vetor[j];
            for(i = j - 1; (i >=0) && (vetor[i] > k); i--){
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = k;
        }

    }


}
