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
		coluna a coluna e realize a multiplicaÁ„o dos valores. */
    	
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
    	/* Elabore um algoritmo que receba um vetor de 5 posiÁıes e retorne o produto
		(multiplicaÁ„o) total desses valores. */
    	
    	int[] vetor = new int[5];
        int count = 0;        
        while(count < 5){
            String dNumber = JOptionPane.showInputDialog("Digite o " + (count + 1) + "∞ n˙mero: ");
            try {            	
                vetor[count] = Integer.parseInt(dNumber);;
                count++;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Valor inv·lido!", "ValidaÁ„o",
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
    	/*Elabore um algoritmo que receba um vetor de 5 posiÁıes e retorne a soma total
		desses valores.*/
    	
    	int[] vetor = new int[5];
        int count = 0;        
        while(count < 5){
            String dNumber = JOptionPane.showInputDialog("Digite o " + (count + 1) + "∞ n˙mero: ");
            try {            	
                vetor[count] = Integer.parseInt(dNumber);;
                count++;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Valor inv·lido!", "ValidaÁ„o",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
        int soma = Arrays.stream(vetor).sum();        
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }

    private void Exercicio5() {
		/* Elabore um algoritmo que receba um vetor de 5 posiÁıes e escreva os n˙meros
		Ìmpares, e indique em quais posiÁıes eles se encontram. */
    	
    	int[] vetor = new int[5];
        int count = 0;
        String valores = "";
        while(count < 5){
            String dNumber = JOptionPane.showInputDialog("Digite o " + (count + 1) + "∞ n˙mero: ");
            try {
                int n = Integer.parseInt(dNumber);
                if((n % 2) != 0){
                    valores += (count > 0 ? ", " : "") + ("V: " + n + " P: " + count);
                }
                vetor[count] = n;
                count++;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Valor inv·lido!", "ValidaÁ„o",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Valores: " + valores);
	}

	private void Exercicio4() {
        /* 4) Fa√ßa um algoritmo com vetor de 5 posi√ß√µes que digite valores e informe quem s√£o m√∫ltiplos de 10. */

        int[] vetor = new int[5];
        int count = 0;
        String valores = "";
        while(count < 5){
            String dNumber = JOptionPane.showInputDialog("Digite o " + (count + 1) + "¬∫ n√∫mero: ");
            try {
                int n = Integer.parseInt(dNumber);
                if((n % 10) == 0){
                    valores += (count > 0 ? ", " : "") + n;
                }
                vetor[count] = n;
                count++;
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Valor inv√°lido!", "Valida√ß√£o",
                        JOptionPane
                                .ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Valores: " + valores);
    }

    private void Exercicio3() {
        /* 3) Fa√ßa um algoritmo com um vetor de tamanho 5 onde somente √© permitido inserir
        valores maiores que 0 e menores que 10. */

        int[] vetor = new int[5];
        int count = 0;
        while(count < 5){
            String dNumber = JOptionPane.showInputDialog("Digite o " + (count + 1) + "¬∫ n√∫mero: ");
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
                JOptionPane.showMessageDialog(null, "Valor inv√°lido! Deve ser um n√∫mero entre 0 e 9.", "Valida√ß√£o",
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
        /* 1) Crie um algoritmo onde o usu√°rio entra com 10 nomes diferentes em um vetor. */

        /* 2) Fa√ßa um algoritmo cuja fun√ß√£o seja preencher um vetor de tamanho 10 utilizando o comando de entrada de
        dados
        da linguagem (usu√°rio entra com o valor). Em seguida escreva os valores contidos no vetor. */

        String[] vetor = new String[10];
        //Pega os valores
        for(int i = 0; i < 10; i++){
            vetor[i] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "¬∫ nome: ");
        }
        //Exibe os valores
        for(int i = 0; i < 10; i++){
            JOptionPane.showMessageDialog(null, (i + 1) + "¬∞ Nome: " + vetor[i]);
        }
    }
}
