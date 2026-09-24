package atividade3;
import java.util.Scanner;
public class TestePais {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos paises serão cadastrados: ");
        Integer x = sc.nextInt();
        Pais[] paises = new Pais[x];
        Double soma = 0.0;

        for (int i = 0; i < x; i++) {
            System.out.println("Informe o codigo do pais: ");
            String codigo = sc.next();
            System.out.println("Informe o nome do pais: ");
            String nome = sc.next();
            System.out.println("Informe o numero de população: ");
            Integer populacao = sc.nextInt();
            System.out.println("Informe a dimensao do pais em km: ");
            Double dimensao = sc.nextDouble();
            paises[i] = new Pais(codigo, nome, populacao, dimensao);
            soma = soma + paises[i].densidadePopulacional();
        }
        Double media = soma/x;

        Pais maior = paises[0];
        Pais menor = paises[0];
        for (int i = 0; i < x;i++){
            if (paises[i].densidadePopulacional() > maior.densidadePopulacional()){
                maior = paises[i];
            }
            if (paises[i].densidadePopulacional() < menor.densidadePopulacional()){
                menor = paises[i];
            }

        }
        System.out.println("Pais com maior densidade: ");
        System.out.println("Codigo: " + maior.codigo);
        System.out.println("Nome: " + maior.nome);
        System.out.println("Densidade: " + maior.densidadePopulacional());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Pais com maior densidade: ");
        System.out.println("Codigo: " + menor.codigo);
        System.out.println("Nome: " + menor.nome);
        System.out.println("Densidade: " + menor.densidadePopulacional());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Densidade populacional media: " + media);
        System.out.println("Paises com densidade acima da media:");
        for (int i = 0; i < x; i++){
            if (paises[i].densidadePopulacional() > media){
                System.out.println(paises[i].nome +": "+paises[i].densidadePopulacional() + " habitantes/km2");
            }
        }

    }
}
