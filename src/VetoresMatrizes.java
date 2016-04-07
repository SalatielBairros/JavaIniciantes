import javax.swing.*;

/**
 * Created by Salatiel on 26/03/2016.
 */
class VetoresMatrizes {
    void Run()
    {
        Exercicio4();
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
