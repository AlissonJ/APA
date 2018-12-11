import java.util.Random;

public class GerarVetor {
	
	public static int[] gerarVetor(int n){
		int []vetor = new int[n];
		Random gerador = new Random();
		for(int i = 0;i<n;i++) {
			vetor[i] = gerador.nextInt(10);
		}
		return vetor;
	}


}
