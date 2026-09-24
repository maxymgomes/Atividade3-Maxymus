package atividade3;

public class Pais {
    public String codigo;
    public String nome;
    public Integer populacao;
    public Double dimensao;

    public Pais(String codigo , String nome, Integer populacao, Double dimensao){
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public Pais(String nome, Double densidade){
        this.nome = nome;
    }

    public Pais(){

    }

    public Double densidadePopulacional(){
        if (populacao == null || dimensao == null || dimensao == 0) {
            return 0.0;
        }

        return (double) populacao / dimensao;
    }
}
