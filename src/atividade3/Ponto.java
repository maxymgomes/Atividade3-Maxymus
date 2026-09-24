package atividade3;


public class Ponto {
    public Double x;
    public Double y;

    public Ponto(Double x , Double y){
        this.x = x;
        this.y = y;
    }

    public Double calcularDistancia(Ponto outroPonto){
        Double quadrado = (Math.pow(x - outroPonto.x, 2)) + (Math.pow(y - outroPonto.y,2));
        Double distancia = Math.sqrt(quadrado);

        return distancia;
    }
}
