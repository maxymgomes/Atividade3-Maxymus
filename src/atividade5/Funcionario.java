package atividade5;

public class Funcionario {
    protected String nome;
    protected  Double salario;

    public Funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public Double getSalario(){
        return this.salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public Double calcularBonificacao(){
        return (salario*0.1);
    }
}
