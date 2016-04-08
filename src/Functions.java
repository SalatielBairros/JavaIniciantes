import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Functions {
	public void Run(){
		double[][] matrix1 = {{10, 20}, {30, 40}};
		double[][] matrix2 = {{50, 60}, {70, 80}};;
		Exercicio9(matrix1, matrix2);
	}

	private String Exercicio1(String nome, String sobrenome) {
		/* Crie uma função que recebe dois argumentos, nome e sobrenome, e retorna uma
		String com o nome completo separado por espaço. */
		
		return (nome + " " + sobrenome);
	}
	
	private int Soma_Exercicio2(int v1, int v2){
		/* Crie uma função chamada “Soma” que realize operação de soma para dois argumentos
		recebidos. Crie uma função polimórfica de soma que receba 3 e realize a soma dos
		valores. */
		
		return (v1 + v2);
	}
	
	private int Soma_Exercicio2(int v1, int v2, int v3){
		return (v1 + v2 + v3);
	}
	
	private void Exercicio3(double d1, double d2){
		/* Crie uma função que receba dois argumentos double, realize as operações aritméticas
		básicas (soma, subtração, multiplicação e divisão) entre os valores e escreva na tela os
		resultados. */
		
		System.out.println("SOMA: " + (d1 + d2));
		System.out.println("SUBTRAÇÃO: " + (d1 - d2));
		System.out.println("MULTIPLICAÇÃO: " + (d1 * d2));
		System.out.println("DIVISÃO: " + (d1 / d2));
	}
	
	private int Exercicio4(int[] values){
		/* Crie uma função que receba um vetor de inteiros como argumento e tem como
		retorno o menor valor contido no vetor. */		
		return Arrays.stream(values).min().getAsInt();
	}
	
	private double Exercicio5(double[] values){
		/* Crie uma função que receba um vetor de double como argumento e tenha como
		retorno o somatório dos valores contidos. */
		
		return Arrays.stream(values).sum();
	}
	
	private int Exercicio6(int[] values){
		/* Crie uma função que receba um vetor de inteiros como argumento e tem como
		retorno o índice do menor valor contido no vetor. */
		
		int menor = 0;
		for(int i = 0; i < values.length; i++){
			if(values[menor] > values[i]) menor = 1;
		}
		return menor;
	}
	
	private int[] Exercicio7(int[] vetor1, int[] vetor2){
		/* Receba dois vetores de inteiros como argumentos, multiplique os valores entre os
		vetores índice a índice, e retorne o vetor resultante da operação. */
		
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
		/* Receba dois vetores de string, concatene os valores contidos índice a índice separando
		os por “:” e escreva os resultados na tela. */
		
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
		/* Crie uma função que receba duas matrizes de double como argumento e escreva na
		tela o resultado das operações de soma e subtração entre elas. */
		
		//OBS.: Não está realizando a validação de tamanho apenas porque é um esforço desnecessário para a finalidade do exercício;
		// TODO está mal feita.
		
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
