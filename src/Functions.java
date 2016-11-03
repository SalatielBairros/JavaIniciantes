import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Functions {
	public void Run(){
		//double[][] matrix1 = {{10, 20}, {30, 40}};
		//double[][] matrix2 = {{50, 60}, {70, 80}};
		int[] vetorText = {5, 6, 8, 7, 10, 55};
		Exercicio6(vetorText);
	}

	private String Exercicio1(String nome, String sobrenome) {
		/* Crie uma fun��o que recebe dois argumentos, nome e sobrenome, e retorna uma
		String com o nome completo separado por espa�o. */
		
		return (nome + " " + sobrenome);
	}
	
	private int Soma_Exercicio2(int v1, int v2){
		/* Crie uma fun��o chamada �Soma� que realize opera��o de soma para dois argumentos
		recebidos. Crie uma fun��o polim�rfica de soma que receba 3 e realize a soma dos
		valores. */
		
		return (v1 + v2);
	}
	
	private int Soma_Exercicio2(int v1, int v2, int v3){
		return (v1 + v2 + v3);
	}
	
	private void Exercicio3(double d1, double d2){
		/* Crie uma fun��o que receba dois argumentos double, realize as opera��es aritm�ticas
		b�sicas (soma, subtra��o, multiplica��o e divis�o) entre os valores e escreva na tela os
		resultados. */
		
		System.out.println("SOMA: " + (d1 + d2));
		System.out.println("SUBTRA��O: " + (d1 - d2));
		System.out.println("MULTIPLICA��O: " + (d1 * d2));
		System.out.println("DIVIS�O: " + (d1 / d2));
	}
	
	private int Exercicio4(int[] values){
		/* Crie uma fun��o que receba um vetor de inteiros como argumento e tem como
		retorno o menor valor contido no vetor. */		
		return Arrays.stream(values).min().getAsInt();
	}
	
	private double Exercicio5(double[] values){
		/* Crie uma fun��o que receba um vetor de double como argumento e tenha como
		retorno o somat�rio dos valores contidos. */
		
		return Arrays.stream(values).sum();
	}
	
	private int Exercicio6(int[] values){
		/* Crie uma fun��o que receba um vetor de inteiros como argumento e tem como
		retorno o �ndice do menor valor contido no vetor. */
		
		int menor = 0;
		for(int i = 0; i < values.length; i++){
			if(values[menor] > values[i]) menor = i;
		}
		return menor;
	}
	
	private int[] Exercicio7(int[] vetor1, int[] vetor2){
		/* Receba dois vetores de inteiros como argumentos, multiplique os valores entre os
		vetores �ndice a �ndice, e retorne o vetor resultante da opera��o. */
		
		int maxL, minL;
		boolean oneB = true;
		if(vetor1.length >= vetor2.length){
			maxL = vetor1.length;
			minL = vetor2.length;
		} else{
			maxL = vetor2.length;
			minL = vetor1.length;
			oneB = false;
		}
		
		int[] newVect = new int[maxL];
		
		for(int i = 0; i < maxL; i++){
			if(i >= minL){
				newVect[i] = (oneB ? vetor1[i] : vetor2[i]);
			} else{
				newVect[i] = (vetor1[i] * vetor2[i]);
			}
		}
		return newVect;
	}
	
	private void Exercicio8(String[] vetor1, String[] vetor2){
		/* Receba dois vetores de string, concatene os valores contidos �ndice a �ndice separando
		os por �:� e escreva os resultados na tela. */
		
		int maxL, minL;
		boolean oneB = true;
		if(vetor1.length >= vetor2.length){
			maxL = vetor1.length;
			minL = vetor2.length;
		} else{
			maxL = vetor2.length;
			minL = vetor1.length;
			oneB = false;
		}		
		
		for(int i = 0; i < maxL; i++){
			if(i >= minL){				
				System.out.println(oneB ? vetor1[i] : vetor2[i]);				
			}else{
				System.out.println(vetor1[i] + " : " + vetor2[i]);
			}
		}
	}
	
	private void Exercicio9(double[][] matrix1, double[][] matrix2){
		/* Crie uma fun��o que receba duas matrizes de double como argumento e escreva na
		tela o resultado das opera��es de soma e subtra��o entre elas. */
		
		//OBS.: N�o est� realizando a valida��o de tamanho apenas porque � um esfor�o desnecess�rio para a finalidade do exerc�cio;
		// TODO est� mal feita.
		
		for(int i = 0; i < matrix1.length; i++){
			for(int j = 0; j < matrix1[i].length; j++){
				System.out.print(matrix1[i][j] - matrix2[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n");
		
		for(int i = 0; i < matrix1.length; i++){
			for(int j = 0; j < matrix1[i].length; j++){
				System.out.print(matrix1[i][j] + matrix2[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
