package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {
        Conta contaSelecionada = new Conta();
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();
        Conta conta1 = new Conta();
        conta1.criarConta();
        Conta conta2 = new Conta();
        conta2.criarConta();

        contas.add(conta1);
        contas.add(conta2);

        System.out.print("Informe a agência: ");
        String agencia = sc.nextLine();
        System.out.print("Informe o número da conta: ");
        String numero = sc.nextLine();

        for (Conta conta: contas){

            String agencia1 = conta.getAgencia();
            String numero1 = conta.getNumero();

            if(agencia1.equals(agencia) && numero1.equals(numero)) {
                contaSelecionada = conta;
            }

            else{
                System.out.println("erro");
            }


        }

        System.out.println("Informe o valor que quer depositar: ");
        Double deposito = sc.nextDouble();
        contaSelecionada.depositar (deposito);
        System.out.println("Informe o valor que quer sacar: ");
        Double saque = sc.nextDouble();
        contaSelecionada.sacar(saque);

        System.out.println(contaSelecionada.getSaldo());
        System.out.println(contaSelecionada.getTitular().getNome());
        System.out.println(contaSelecionada.getTitular().getEmail());


    }
//nada aconteceria, pois assim como nos temos diversas contas em bancos,acho que se pode ter aqui tambem
//sendo sincero tenhoi nenhuma ideia de como resorver se desse algum problema

}


