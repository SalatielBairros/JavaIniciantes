import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Executable;

/**
 * Created by Salatiel on 22/03/2016.
 */

public class Conditionals
{
	public void Run()
	{
		Exercicio9();
	}

	private void Exercicio9()
	{
		/* Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo
		que calcule seu peso ideal, utilizando as seguintes fórmulas:
			a. Para homens: (72.7*h) - 58
			b. Para mulheres: (62.1*h) - 44.7 (h = altura)
			c. Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
			Dica: pesquisar o método equals para java. */

		JTextField altura = new JTextField();
		JTextField peso = new JTextField();
		JComboBox sexo = new JComboBox();
		sexo.addItem("Masculino");
		sexo.addItem("Feminino");

		Object[] message = {"Peso:", peso, "Altura:", altura ,"Sexo: ", sexo};
		int option = JOptionPane.showConfirmDialog(null, message, "Cálculo Peso Ideal", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
			try {
				double h = Double.parseDouble(altura.getText());
				double w = Double.parseDouble(peso.getText());
				double result = 0;
				if(sexo.getSelectedItem().toString().equals("Masculino")){
					result = (72.7 * h) - 58;
				}else{
					result = (62.1 * h) - 44.7;
				}
				String responseMessage = "Seu peso ideal é " + result + ". Você está: ";
				if(w > result){
					responseMessage += "ACIMA DO PESO (" + (w - result) + ")";
				}else if(w < result){
					responseMessage += "ABAIXO DO PESO (" + (result - w) + ")";
				}else{
					responseMessage += "PESO IDEAL!";
				}
				JOptionPane.showMessageDialog(null, responseMessage);
			}catch (Exception ex){
				JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).", "Erro Validação", JOptionPane.ERROR_MESSAGE);
			}
		}else{
			JOptionPane.showMessageDialog(null, "CANCELADO!");
		}
	}

	private void Exercicio8()
	{
		/* Receba o valor de uma multa de transito e a quantidade de pontos na carteira do
		condutor, caso o pontos na carteira sejam maiores que 10 a multa é acrescida de 15%.
		Ex: multa 900 e pts 13, resposta 1035 */

		JTextField valorMulta = new JTextField();
		JTextField pontosCarteira = new JTextField();

		Object[] message = {"Valor Multa: ", valorMulta, "Pts. Carteira: ", pontosCarteira};

		int option = JOptionPane.showConfirmDialog(null, message, "Cálculo Multa", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
			double vMulta;
			int pCarteira;
			try {
				vMulta = Double.parseDouble(valorMulta.getText());
				pCarteira = Integer.parseInt(pontosCarteira.getText());
				if(pCarteira > 10){
					vMulta *= 1.15;
				}

				JOptionPane.showMessageDialog(null, String.format("Valor multa: R$%.2f", vMulta));
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).", "Erro Validação", JOptionPane.ERROR_MESSAGE);
			}

		} else {
			System.out.println("CANCELADO!");
		}
	}

	private void Exercicio7()
	{
		/*Faça um algoritmo que receba um número e diga se este número está no intervalo
		entre 5 e 100.*/

		String numero = JOptionPane.showInputDialog("Digite o número: ");
		try {
			double n = Double.parseDouble(numero);
			String returnMessage = "O número%s está no intervalo. ";
			returnMessage = String.format(returnMessage, (!(n >= 5 && n <= 150) ? " não" : ""));
			JOptionPane.showMessageDialog(null, returnMessage);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Valor inválido.", "Erro Validação", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void Exercicio6()
	{
	    /*Faça um programa que receba um numero e informe se o mesmo é positivo, zero ou
        negativo.*/

		String numero = JOptionPane.showInputDialog("Digite o número: ");
		try {
			double n = Double.parseDouble(numero);
			String returnMessage = "O número é ";
			if (n > 0) {
				returnMessage += "positivo.";
			} else if (n < 0) {
				returnMessage += "negativo.";
			} else {
				returnMessage += "zero.";
			}
			JOptionPane.showMessageDialog(null, returnMessage);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Valor inválido.", "Erro Validação", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void Exercicio5()
	{
        /*Receba 4 notas, calcule a média entre elas e retorne o conceito final do aluno. Ex:
        Notas: 7,8,6,10, retorna B*/

        /* 10 - 8 = A
           8 - 6 = B
           6 - 4 = C
           4 - 0 = D
         */

		JTextField nota1 = new JTextField();
		JTextField nota2 = new JTextField();
		JTextField nota3 = new JTextField();
		JTextField nota4 = new JTextField();

		Object[] message = {"Nota 1: ", nota1, "Nota 2: ", nota2, "Nota 3: ", nota3, "Nota 4: ", nota4};

		int option = JOptionPane.showConfirmDialog(null, message, "Cálculo Notas", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
			double n1, n2, n3, n4, media;
			try {
				n1 = Double.parseDouble(nota1.getText());
				n2 = Double.parseDouble(nota2.getText());
				n3 = Double.parseDouble(nota3.getText());
				n4 = Double.parseDouble(nota4.getText());
				media = ((n1 + n2 + n3 + n4) / 4);
				String conceito = "D";
				if (media >= 8) {
					conceito = "A";
				} else if (media >= 6) {
					conceito = "B";
				} else if (media >= 4) {
					conceito = "C";
				}
				JOptionPane.showMessageDialog(null, "Conceito Final: " + conceito);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).", "Erro Validação", JOptionPane.ERROR_MESSAGE);
			}

		} else {
			System.out.println("CANCELADO!");
		}
	}

	private void Exercicio4()
	{
        /*Aplica uma multa de 10% nas contas de energia elétrica com gasto maior que 100
        kWh, sendo o valor do kWh 1,50$. Ex: consumo 120 retorna R$ 198,00*/

		String consumoDigitado = JOptionPane.showInputDialog("Digite o consumo: ");
		try {
			double consumo = Double.parseDouble(consumoDigitado);
			double valorTotal = (consumo * 1.5);
			valorTotal *= (consumo > 100 ? 1.1 : 1);
			JOptionPane.showMessageDialog(null, "Valor conta: R$" + String.format("%.2f", valorTotal));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Valor inválido.", "Erro Validação", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void Exercicio3()
	{
        /*3) Faça um algoritmo que peça ao usuário a quantia em dinheiro que tem sobrando na carteira e sugira, caso ele
        tenha 30 ou mais reais, que vá ao cinema, e se não tiver, fique em casa vendo TV.*/

		String valorCarteira = JOptionPane.showInputDialog("Quanto você tem na carteira? ");
		try {
			double carteira = Double.parseDouble(valorCarteira);
			if (carteira >= 30) {
				JOptionPane.showMessageDialog(null, "Vá ao cinema!");
			} else {
				JOptionPane.showMessageDialog(null, "Fique em casa vendo TV");
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Valor inválido.", "Erro Validação", JOptionPane.ERROR_MESSAGE);
		}

	}

	private void Exercicio2()
	{
        /*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após,
        calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar
        se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão
        escrever a mensagem 'Saldo Negativo'.*/

		JTextField nConta = new JTextField();
		JTextField saldo = new JTextField();
		JTextField debito = new JTextField();
		JTextField credito = new JTextField();
		saldo.setText("0");
		debito.setText("0");
		credito.setText("0");

		Object[] message = {"Conta: ", nConta, "Saldo: ", saldo, "Débito: ", debito, "Crédito: ", credito};

		int option = JOptionPane.showConfirmDialog(null, message, "Cálculo Conta", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
			String conta, returnMessage = "Saldo ";
			double sl, db, cr, total;
			try {
				conta = nConta.getText();
				sl = Double.parseDouble(saldo.getText());
				db = Double.parseDouble(debito.getText());
				cr = Double.parseDouble(credito.getText());
				total = sl - db + cr;

				if (total >= 0) {
					returnMessage += "Positivo";
				} else {
					returnMessage += "Negativo";
				}
				returnMessage = "Conta: " + conta + " com saldo: R$" + total + "." + returnMessage;
				JOptionPane.showMessageDialog(null, returnMessage);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).", "Erro Validação", JOptionPane.ERROR_MESSAGE);
			}

		} else {
			System.out.println("CANCELADO!");
		}
	}

	private void Exercicio1()
	{
        /*Ler o nome de 2 times e o número de gols marcados na partida (para cada time).
        Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.*/

		JTextField time1 = new JTextField();
		JTextField time2 = new JTextField();
		JTextField golT1 = new JTextField();
		JTextField golT2 = new JTextField();
		golT1.setText("0");
		golT2.setText("0");

		Object[] message = {"Time 1: ", time1, "Time 2: ", time2, "Gols Time 1: ", golT1, "Gols Time 2: ", golT2};

		int option = JOptionPane.showConfirmDialog(null, message, "Cálculo Produto", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
			String team1, team2, returnMessage = "VENCEDOR: ";
			int goals1, goals2;
			try {
				team1 = time1.getText();
				team2 = time2.getText();
				goals1 = Integer.parseInt(golT1.getText());
				goals2 = Integer.parseInt(golT2.getText());

				if (goals1 > goals2) {
					returnMessage += team1;
				} else if (goals2 > goals1) {
					returnMessage += team2;
				} else {
					returnMessage = "EMPATE";
				}
				JOptionPane.showMessageDialog(null, returnMessage);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).", "Erro Validação", JOptionPane.ERROR_MESSAGE);
			}

		} else {
			System.out.println("CANCELADO!");
		}
	}
}
