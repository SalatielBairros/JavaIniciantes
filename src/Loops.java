import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Salatiel on 24/03/2016.
 */
class Loops {
    void Run()
    {
        Exercicio8();
    }

	private void Exercicio8() {
		/* 8) Escreva um algoritmo para ler 10 números.
		Todos os números lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada. */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sumNumbers = 0;
		for (int i = 0; i < 10; i ++){
			System.out.println("Digite o " + (i + 1) + "º número: ");
			try {
				int n = Integer.parseInt(br.readLine());
				if(n < 40){
					sumNumbers += n;
				}
			}catch (Exception ex){
				System.out.println("Valor inválido.");
			}
		}
		System.out.println("Resultado da soma: " + sumNumbers);
	}

	private void Exercicio7() {
		/* 7) Faça um algoritmo que receba a idade de 5 pessoas e mostre mensagem informando "maior de idade"
		e "menor de idade" para cada pessoa. Considere a idade a partir de 18 anos como maior de idade. */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countNumbers = 0;
		for (int i = 1; i <= 5; i ++){
			System.out.println("Digite a idade da " + i + "º pessoa: ");
			try {
				int n = Integer.parseInt(br.readLine());
				if(n >= 18){
					System.out.println("MAIOR DE IDADE.");
				}else{
					System.out.println("MENOR DE IDADE.");
				}
			}catch (Exception ex){
				System.out.println("Valor inválido.");
			}
		}
	}

	private void Exercicio6() {
		/* 6) Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS. */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countNumbers = 0;
		for (int i = 0; i < 10; i ++){
			System.out.println("Digite o " + (i + 1) + "º número: ");
			try {
				int n = Integer.parseInt(br.readLine());
				if(n < 0){
					countNumbers++;
				}
			}catch (Exception ex){
				System.out.println("Valor inválido.");
			}
		}
		System.out.println(countNumbers + " itens são negativos.");
	}

	private void Exercicio5()
	{
		/* Faça um algoritmo que leia 10 números e ao final informar quantos números estão no
			intervalo entre 10 e 150. */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countNumbers = 0;
		for (int i = 0; i < 10; i ++){
			System.out.println("Digite o " + (i + 1) + "º número: ");
			try {
				int n = Integer.parseInt(br.readLine());
				if(n >= 10 && n <= 150){
					countNumbers++;
				}
			}catch (Exception ex){
				System.out.println("Valor inválido.");
			}
		}
		System.out.println(countNumbers + " itens estão entre 10 e 150.");
	}

	private void Exercicio4()
	{
		/* Receba um valor de entrada X e retorne os valores múltiplos desse numero entre 0 a
		50. Ex: X = 15, resposta 15, 30, 45; */
		String inputedData = JOptionPane.showInputDialog("Digite um número: ");
		try {
			int n = Integer.parseInt(inputedData);
			for (int i = 0; i <= 50; i += n){
				System.out.println(i);
			}
		}catch (Exception ex){
			JOptionPane.showMessageDialog(null, "Valor inválido.", "Validação", JOptionPane.ERROR_MESSAGE);
		}

	}

	private void Exercicio3()
	{
		/*Escreva um algoritmo para imprimir os números de 1 (inclusive) a 100 (inclusive) em
		ordem decrescente.*/

		for (int i = 100; i > 0; i--){
			System.out.println(i);
		}
	}

	private void Exercicio2()
    {
        /*Programa que informe os números múltiplos de 3 entre 0 e 100.*/

        for (int i = 3; i <= 100; i += 3){
            System.out.println(i);
        }
    }

    private void Exercicio1() {
        /* 1) Faça um algoritmo que escreva em forma crescente os números de 1 até 100. */

        for (int i = 1; i <= 100; i++){
            System.out.println(i);
        }
    }
}
