import java.util.Arrays;

import javax.swing.*;

/**
 * Created by Salatiel on 26/03/2016.
 */
@SuppressWarnings("unused")
class VetoresMatrizes {
    void Run()
    {
    	Exercicio11();
    }

    private void Exercicio11(){
    	/* Elabore um algoritmo que exiba na tela os valores contidos em uma matriz [3x3]
		coluna a coluna e realize a multiplica��o dos valores. */
    	
    	int[][] matriz = {
    			{10, 20, 30},
    			{40, 50, 60},
    			{80, 90, 100},
    	};    	
    	    	
    	int mult = 0;
    	for (int i = 0; i < matriz[0].length; i++) {
    		for (int j = 0; j < matriz.length; j++)  {
    			System.out.print(matriz[j][i] + " ");
    			mult *= matriz[j][i];
    		}
    		System.out.print("\n");
		}
    	System.out.println("\n MULTIPLICACAO TOTAL: " + mult);
    }
    
    private void Exercicio10(){
    	/* Elabore um algoritmo que exiba na tela os valores contidos em uma matriz [3x3] linha
		a linha e realize a soma dos valores nas mesmas. */
    	
    	int[][] matriz = {
    			{10, 20, 30},
    			{40, 50, 60},
    			{80, 90, 100},
    	};    	
    	    	
    	int soma = 0;
    	for (int i = 0; i < matriz.length; i++) {
    		for (int j = 0; j < matriz[i].length; j++)  {
    			System.out.print(matriz[i][j] + " ");
    			soma += matriz[i][j];
    		}
    		System.out.print("\n");
		}
    	System.out.println("\n SOMA TOTAL: " + soma);
    }
    
    private void Exercicio9(){
    	/* Elabore um algoritmo que informe os valores contidos em uma matriz 4 linhas x 4
		colunas e realize a soma total dos valores existentes. */
    	
    	int[][] matriz = {
    			{10, 20, 30, 40},
    			{40, 50, 60, 70},
    			{80, 90, 100, 110},
    			{120, 130, 140, 150}
    	};    	
    	    	
    	int soma = 0;
    	for (int i = 0; i < matriz.length; i++) {
    		for (int j = 0; j < matriz[i].length; j++)  {
    			System.out.println("Linha: " + (i + 1) + " - Coluna: " + (j + 1) + " - Valor: " + matriz[i][j]);
    			soma += matriz[i][j];
    		}			
		}
    	System.out.println("\n SOMA TOTAL: " + soma);
    }
    
    private void Exercicio8(){
    	/* Elabore um algoritmo que informe os valores contidos em uma matriz 2 linhas x 3
		colunas. */
    	
    	int[][] matriz = {
    			{10, 20, 30},
    			{40, 50, 60}
    	};    	
    	    	
    	for (int i = 0; i < matriz.length; i++) {
    		for (int j = 0; j < matriz[i].length; j++)  {
    			System.out.println("Linha: " + (i + 1) + " - Coluna: " + (j + 1) + " - Valor: " + matriz[i][j]);
    		}			
		}
    }
    
    private void Exercicio7(){
    	/* Elabore um algoritmo que receba um vetor de 5 posi��es e retorne o produto
		(multiplica��o) total desses valores. */
    	
    	int[] vetor = new int[5];
        int count = 0;        
        while(count < 5){
            String dNumber = JOptionPane.showInputDialog("Digite o " + (count + 1) + "� n�mero: ");
            try {            	
                vetor[count] = Integer.parseInt(dNumber);;
                count++;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Valor inv�lido!", "Valida��o",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
        int mul = 1;
        for (int i : vetor) {
			mul *= i;
		}
                
        JOptionPane.showMessageDialog(null, "Mul: " + mul);
    }
    
    private void Exercicio6() {
    	/*Elabore um algoritmo que receba um vetor de 5 posi��es e retorne a soma total
		desses valores.*/
    	
    	int[] vetor = new int[5];
        int count = 0;        
        while(count < 5){
            String dNumber = JOptionPane.showInputDialog("Digite o " + (count + 1) + "� n�mero: ");
            try {            	
                vetor[count] = Integer.parseInt(dNumber);;
                count++;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Valor inv�lido!", "Valida��o",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
        int soma = Arrays.stream(vetor).sum();        
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }

    private void Exercicio5() {
		/* Elabore um algoritmo que receba um vetor de 5 posi��es e escreva os n�meros
		�mpares, e indique em quais posi��es eles se encontram. */
    	
    	int[] vetor = new int[5];
        int count = 0;
        String valores = "";
        while(count < 5){
            String dNumber = JOptionPane.showInputDialog("Digite o " + (count + 1) + "� n�mero: ");
            try {
                int n = Integer.parseInt(dNumber);
                if((n % 2) != 0){
                    valores += (count > 0 ? ", " : "") + ("V: " + n + " P: " + count);
                }
                vetor[count] = n;
                count++;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Valor inv�lido!", "Valida��o",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Valores: " + valores);
	}

	private void Exercicio4() {
        /* 4) Faça um algoritmo com vetor de 5 posições que digite valores e informe quem são múltiplos de 10. */

        int[] vetor = new int[5];
        int count = 0;
        String valores = "";
        while(count < 5){
            String dNumber = JOptionPane.showInputDialog("Digite o " + (count + 1) + "º número: ");
            try {
                int n = Integer.parseInt(dNumber);
                if((n % 10) == 0){
                    valores += (count > 0 ? ", " : "") + n;
                }
                vetor[count] = n;
                count++;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Valor inválido!", "Validação",
                        JOptionPane
                                .ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Valores: " + valores);
    }

    private void Exercicio3() {
        /* 3) Faça um algoritmo com um vetor de tamanho 5 onde somente é permitido inserir
        valores maiores que 0 e menores que 10. */

        int[] vetor = new int[5];
        int count = 0;
        while(count < 5){
            String dNumber = JOptionPane.showInputDialog("Digite o " + (count + 1) + "º número: ");
            try {
                int n = Integer.parseInt(dNumber);
                if(n > 0 && n < 10){
                    vetor[count] = n;
                    count++;
                }
                else{
                    throw new Exception();
                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Valor inválido! Deve ser um número entre 0 e 9.", "Validação",
                        JOptionPane
                        .ERROR_MESSAGE);
            }
        }

        String valores = "";
        //Exibe os valores
        for(int i = 0; i < 5; i++){
            valores += (i > 0 ? ", " : "") + vetor[i];
        }
        JOptionPane.showMessageDialog(null, "Valores: " + valores);
    }

    private void Exercicio1_2() {
        /* 1) Crie um algoritmo onde o usuário entra com 10 nomes diferentes em um vetor. */

        /* 2) Faça um algoritmo cuja função seja preencher um vetor de tamanho 10 utilizando o comando de entrada de
        dados
        da linguagem (usuário entra com o valor). Em seguida escreva os valores contidos no vetor. */

        String[] vetor = new String[10];
        //Pega os valores
        for(int i = 0; i < 10; i++){
            vetor[i] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º nome: ");
        }
        //Exibe os valores
        for(int i = 0; i < 10; i++){
            JOptionPane.showMessageDialog(null, (i + 1) + "° Nome: " + vetor[i]);
        }
    }
}
