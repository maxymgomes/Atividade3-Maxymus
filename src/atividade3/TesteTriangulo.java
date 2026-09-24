package atividade3;

public class TesteTriangulo {
    public static void main(String[] args){
        Triangulo pitogoras = new Triangulo(new Ponto(0.0,0.0) , new Ponto(3.0 , 0.0), new Ponto(0.0, 4.0));
        pitogoras.calculaPerimetro();
        System.out.println(pitogoras.calculaPerimetro());
    }
}