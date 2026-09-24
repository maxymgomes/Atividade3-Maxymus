package atividade5;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, Double salario, String departamento){
        super(nome,salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public Double calcularBonificacao(){
        return salario * 0.12;
    }
}
