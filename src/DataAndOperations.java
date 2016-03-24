import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DataAndOperations {

    public void Run() {
        Exercicio14();
    }

    public void Exercicio1() {
        /*Declare cinco variáveis do tipo inteiro, realize a soma e exiba na tela.*/

        System.out.println("\n\nEXERCICIO 1:");
        int a = 10, b = 20, c = 30;
        int soma = a + b + c;
        System.out.println("Soma: " + soma);
    }

    public void Exercicio2() {
        /*Declare cinco variáveis do tipo double, realize a soma e exiba na tela.*/

        System.out.println("\n\nEXERCICIO 2:");
        double a = 10, b = 20, c = 30, d = 40, e = 50;
        double soma = a + b + c + d + e;
        System.out.println("Soma: " + soma);
    }

    public void Exercicio3_4() {
        /*3) Receba três nomes e exiba os mesmos na tela em linhas separadas.
          4) Receba três nomes e exiba os mesmos separando os por virgulas.*/

        System.out.println("\n\nEXERCICIO 3:");
        String p1 = JOptionPane.showInputDialog("Digite o primeiro nome: ");
        String p2 = JOptionPane.showInputDialog("Digite o segundo nome: ");
        String p3 = JOptionPane.showInputDialog("Digite o terceiro nome: ");
        System.out.println(String.join("\n", p1, p2, p3));
        System.out.println("\n\nEXERCICIO 4:");
        System.out.println(String.join(", ", p1, p2, p3));
    }

    public void Exercicio5() {
        /* Receba o nome, sobrenome, sexo, RG e idade e posteriormente exiba as informações
            na tela. Nome e sobrenome devem ser informados na mesma linha.*/

        JTextField nomeCompleto = new JTextField();
        JTextField rg = new JTextField();
        JTextField idade = new JTextField();
        JTextField sexo = new JTextField();

        Object[] message = {"Nome Completo:", nomeCompleto, "RG:", rg, "Idade:", idade, "Sexo:", sexo};

        int option = JOptionPane.showConfirmDialog(null, message, "Dados pessoais", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String result = String.join("\n", ("Nome: " + nomeCompleto.getText()), ("CPF: " + rg.getText()),
                    ("Idade: " + idade.getText()), ("Sexo: " + sexo.getText()));
            JOptionPane.showMessageDialog(null, result);
        } else {
            System.out.println("CANCELADO!");
        }
    }

    public void Exercicio6() {
        /*Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a
        variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da
        variável A. Apresentar os valores trocados.*/

        String v1, temp;
        v1 = temp = JOptionPane.showInputDialog("Valor 1: ");
        String v2 = JOptionPane.showInputDialog("Valor 2: ");
        v1 = v2;
        v2 = temp;
        JOptionPane.showMessageDialog(null, "V1: " + v1 + "\nV2: " + v2);
    }

    public void Exercicio7_8() {
        /*7) Faça um algoritmo que receba dois números e exiba o resultado da sua soma.
          8) Faça um algoritmo que receba dois números e ao final mostre a soma, subtração,
                multiplicação e a divisão dos números lidos., */

        double v1;
        while (true) {
            try {
                String n = JOptionPane.showInputDialog("Digite o primeiro n�mero: ");
                v1 = Double.parseDouble(n);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor inv�lido.", "Erro valida��o", JOptionPane.ERROR_MESSAGE);
            }
        }

        double v2;
        while (true) {
            try {
                String n = JOptionPane.showInputDialog("Digite o segundo n�mero: ");
                v2 = Double.parseDouble(n);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor inv�lido.", "Erro valida��o", JOptionPane.ERROR_MESSAGE);
            }
        }
        String returnMessage = String.join("\n", ("Resulado soma: " + (v1 + v2)), ("Resulado subtra��o: " + (v1 - v2)),
                ("Resulado multiplica��o: " + (v1 * v2)), ("Resulado divis�o: " + (v1 / v2)));
        JOptionPane.showMessageDialog(null, returnMessage);
    }

    public void Exercicio9() {
        /*Receba um valor em mph (milhas por hora) e transforme em km\h, lembrando que 1
        milha equivale a 1.6km.*/

        double v1;
        while (true) {
            try {
                String n = JOptionPane.showInputDialog("Digite o valor em mph: ");
                v1 = Double.parseDouble(n);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor inv�lido.", "Erro valida��o", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, (v1 * 1.6) + "Km/h");
    }

    public void Exercicio10() {
        /*Escrever um algoritmo para determinar o consumo médio de um automóvel sendo
        fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.*/

        double distancia;
        while (true) {
            try {
                String n = JOptionPane.showInputDialog("Digite a dist�ncia (Km): ");
                distancia = Double.parseDouble(n);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor inv�lido.", "Erro valida��o", JOptionPane.ERROR_MESSAGE);
            }
        }

        double combustivel;
        while (true) {
            try {
                String n = JOptionPane.showInputDialog("Digite o combust�vel (L): ");
                combustivel = Double.parseDouble(n);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor inv�lido.", "Erro valida��o", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Valor m�dio: " + (distancia / combustivel) + "Km/L");
    }

    public void Exercicio11() {
        /* Escreva um algoritmo para ler o número total de eleitores de um município, o número
        de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um
        representa em relação ao total de eleitores.*/

        JTextField nEleitores = new JTextField();
        JTextField nBrancos = new JTextField();
        JTextField nNulos = new JTextField();
        JTextField nValidos = new JTextField();

        Object[] message = {"N. Eleitores:", nEleitores, "Votos Brancos:", nBrancos, "Votos nulos:", nNulos,
                "Votos validos:", nValidos};

        int option = JOptionPane.showConfirmDialog(null, message, "Calculo Votos", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            double eleitores, brancos, nulos, validos;
            try {
                eleitores = Double.parseDouble(nEleitores.getText());
                brancos = Double.parseDouble(nBrancos.getText());
                nulos = Double.parseDouble(nNulos.getText());
                validos = Double.parseDouble(nValidos.getText());

                double pBrancos = ((brancos / eleitores) * 100);
                double pNulos = ((nulos / eleitores) * 100);
                double pValidos = ((validos / eleitores) * 100);

                String returnMessage = String.join("\n", ("Brancos: " + String.format("%.2f", pBrancos) + "%"),
                        ("Nulos: " + String.format("%.2f", pNulos) + "%"),
                        ("V�lidos: " + String.format("%.2f", pValidos) + "%"));
                JOptionPane.showMessageDialog(null, returnMessage);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Algun(s) do(s) valor(es) s�o inv�lidos. Verifique os dados digitados.", "Erro valida��o",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else {
            System.out.println("CANCELADO!");
        }
    }

    public void Exercicio12() {
        /*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e
        mês com 30 dias.  */

        String data = JOptionPane.showInputDialog("Digite sua data de nascimento (dd/mm/yyyy): ");
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
            Date date = (Date) formatter.parse(data);
            long diferencaDias = (((new Date()).getTime()) - date.getTime()) / (1000 * 60 * 60 * 24);
            JOptionPane.showMessageDialog(null, "Dias: " + diferencaDias);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data inv�lida.", "Erro valida��o", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Exercicio13() {
        /* Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual
            de reajuste. Calcular e escrever o valor do novo salário. */

        JTextField salario = new JTextField();
        JTextField reajuste = new JTextField();

        Object[] message = {"Salário:", salario, "Reajuste (%):", reajuste};

        int option = JOptionPane.showConfirmDialog(null, message, "Cálculo Salário", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            double sal, per;
            try {
                sal = Double.parseDouble(salario.getText());
                per = Double.parseDouble(reajuste.getText());
                sal += (sal * (per / 100));
                JOptionPane.showMessageDialog(null, "Total: " + sal);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).", "Erro Validação", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            System.out.println("CANCELADO!");
        }
    }

    public void Exercicio14() {
        // Faça um algoritmo que receba o preço de custo de um produto, a quantidade em
        // estoque e uma taxa de lucro em %.  Informe qual será o lucro caso o estoque seja
        // inteiramente vendido.

        JTextField precoCusto = new JTextField();
        JTextField quantidade = new JTextField();
        JTextField lucro = new JTextField();

        Object[] message = {"Preço Custo: ", precoCusto, "Quantidade: ", quantidade, "Lucro: ", lucro};

        int option = JOptionPane.showConfirmDialog(null, message, "Cálculo Produto", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            double custo, qtd, luc, vProdU = 0, lucroTotal;
            try {
                custo = Double.parseDouble(precoCusto.getText());
                qtd = Double.parseDouble(quantidade.getText());
                luc = Double.parseDouble(lucro.getText());
                vProdU += (custo + (custo * (luc / 100)));
                lucroTotal = ((vProdU * qtd) - (custo * qtd));
                JOptionPane.showMessageDialog(null, "Total: " + lucroTotal);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).", "Erro Validação", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            System.out.println("CANCELADO!");
        }
    }
}
