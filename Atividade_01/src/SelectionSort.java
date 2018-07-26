public class SelectionSort {

    public static void selectionSort(int [] vetor){
        for(int i = 0; i < vetor.length - 1;i++){
            int menor = i;

            for(int j = menor + 1;j <vetor.length; j++){
                if(vetor[j] < vetor[menor]){
                    menor = j;
                }
            }
            if(menor != i){
                int l = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = l;
            }
        }
    }

}
