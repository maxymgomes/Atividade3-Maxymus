package atividade3;

public class Triangulo {
    Ponto ponto1;
    Ponto ponto2;
    Ponto ponto3;

    public Triangulo(Ponto ponto1, Ponto ponto2, Ponto ponto3){
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        this.ponto3 = ponto3;
    }

    public Double calculaPerimetro(){
            Double lado1 = ponto1.calcularDistancia(ponto2);
            Double lado2 = ponto2.calcularDistancia(ponto3);
            Double lado3 = ponto3.calcularDistancia(ponto1);

            Double perimetro = lado1 + lado2 + lado3;

            return perimetro;
    }
}
