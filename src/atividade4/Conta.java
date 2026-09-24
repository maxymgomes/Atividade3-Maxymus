package atividade4;
import java.util.Scanner;

public class Conta {
    Scanner sc = new Scanner(System.in);
    private String agencia;
    private String numero;
    private Cliente titular;
    private Double saldo;

    public Conta(String agencia, String numero, Cliente titular){
        validarAgencia(agencia);
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }
    public Conta(){
        this.saldo = 0.0;
    }

    public void criarConta(){
        IO.println("Informe o nome do cliente:");
        String nome = sc.next();
        IO.println("Informe o email do cliente:");
        String email = sc.next();
        Cliente c1 = new Cliente(nome, email);

        IO.println("Informe a agencia da conta:");
        String agencia = sc.next();
        IO.println("Informe o numero da conta:");
        String numero = sc.next();
        Conta conta = new Conta(agencia,numero,c1);
    }

    public void sacar(Double valor){
        if (valor > this.saldo){
            throw new RuntimeException("Saldo insuficiente");
        }else if (valor < 0){
            throw new RuntimeException("Valor de saque negativo");
        }else{
            this.saldo -= valor;
        }
    }

    public void depositar(Double valor){
        if (valor > 0)
            this.saldo += valor;
    }

    private void validarAgencia(String agencia){
        String[] partes = agencia.split("-");
        if (partes[0].length() != 4 || partes[1].length() != 1){
            throw new RuntimeException(" ERRO : Agencia Invalida");
        }
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public String getNumero(){
        return this.numero;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


}