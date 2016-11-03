import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Salatiel on 24/03/2016.
 */
class Loops {
    void Run()
    {
	    Exercicio6();
    }

	private void Exercicio12() {
		/*12) Um jogo de adivinhação:
		a. Gerar um numero inteiro aleatório entre 1 e 10 (numero alvo).
		b. Perguntar um valor para chute.
				c. Informar se o valor chute é maior ou é menor que o numero alvo.
				d. O jogo só para quando o numero alvo for adivinhado.
				Dica: pesquisar a classe random para java.*/

		//Referência Random: http://www.k19.com.br/artigos/numeros-aleatorios-em-java-a-classe-random/

		int randomNumber = (new Random().nextInt(10) + 1);
		while(true) {
			String number = JOptionPane.showInputDialog("Qual número da sequencia? ");
			try {
				int n = Integer.parseInt(number);
				if (n == randomNumber) {
					System.out.println("Você acertou!");
					break;
				} else {
					System.out.println("Valor errou! O número correto é " + (n < randomNumber ? "MAIOR" : "MENOR"));
				}
			} catch (Exception ex) {
				System.out.println("Valor inválido.");
			}
		}
	}

	private void Exercicio11() {
		/* 11) Um algoritmo que retorne o N-ésimo termo da série de fibonacci. */

		String number = JOptionPane.showInputDialog("Qual número da sequencia? ");
		try {
			int n = Integer.parseInt(number);
			if(n >= 0) {

				int F = 0; // atual
				int ant = 0; // anterior
				for (int i = 1; i <= n; i++)
				{
					if (i == 1) {
						F = 1; ant = 0;
					} else {
						F += ant; ant = F - ant;
					}
				}
				System.out.println("Resultado: " + F);
			}else {
				System.out.println("O número deve ser positivo.");
			}
		}catch (Exception ex){
			System.out.println("Valor inválido.");
		}
	}

	private void Exercicio10() {
		/* 10) Ler um valor e realizar o calculo do fatorial do valor. */

		String number = JOptionPane.showInputDialog("Digite um número positivo: ");
		try {
			int n = Integer.parseInt(number);
			if(n >= 0) {
				int result = 1;
				for (int i = n; i > 0; i--){
					result *= i;
				}
				System.out.println("Resultado: " + result);
			}else {
				System.out.println("O número deve ser positivo.");
			}
		}catch (Exception ex){
			System.out.println("Valor inválido.");
		}
	}

	private void Exercicio9() {
		/* 9) Crie um algoritmo que o usuário entre com vários números inteiros e positivos e
		imprima o produto dos números ímpares e a soma dos números pares.  */

		//Como o enunciado diz apenas "vários números", vou exigir 10 numeros do usuário.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sumNumbers = 0;
		for (int i = 0; i < 10; i ++){
			System.out.println("Digite o " + (i + 1) + "º número: ");
			try {
				int n = Integer.parseInt(br.readLine());
				if(n >= 0) {
					if (n < 40) {
						sumNumbers += n;
					}
				}else {
					System.out.println("O número deve ser positivo.");
				}
			}catch (Exception ex){
				System.out.println("Valor inválido.");
			}
		}
		System.out.println("Resultado da soma: " + sumNumbers);
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
