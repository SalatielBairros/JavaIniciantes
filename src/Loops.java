/**
 * Created by Salatiel on 24/03/2016.
 */
public class Loops {
    public void Run()
    {
        Exercicio4();
    }

	private void Exercicio4()
	{
		/* Receba um valor de entrada X e retorne os valores múltiplos desse numero entre 0 a
		50. Ex: X = 15, resposta 15, 30, 45; */


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
