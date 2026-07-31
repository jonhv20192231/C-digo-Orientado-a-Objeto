public class CarroEsportivo extends Carro {
    private double velocidadeMaxima;

    public CarroEsportivo(String marca, String modelo, int ano, double quilometragem, double velocidadeMaxima) {
        super(marca, modelo, ano, quilometragem);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void definirVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double obterVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void acelerar(double aumentoDeVelocidade) {
        if (aumentoDeVelocidade >= 0) {
            System.out.println("Acelerando o carro esportivo em " + aumentoDeVelocidade + " km/h.");
        } else {
            System.out.println("Aumento de velocidade inválido.");
        }
    }

    @Override
    public String toString() {
        return "Carro Esportivo:\n" +
                "Marca: " + obterMarca() + "\n" +
                "Modelo: " + obterModelo() + "\n" +
                "Ano: " + obterAno() + "\n" +
                "Quilometragem: " + obterQuilometragem() + " km\n" +
                "Velocidade Máxima: " + velocidadeMaxima + " km/h";
    }


}
