public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;


    // Construtor para inicializar os atributos, incluindo a quilometragem
    public Carro(String marca, String modelo, int ano, double quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    // Métodos para definir a marca, modelo e ano
    public void definirMarca(String marca) {
        this.marca = marca;
    }

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirAno(int ano) {
        this.ano = ano;
    }

    // Métodos para obter a marca, modelo, ano e quilometragem
    public String obterMarca() {
        return marca;
    }

    public String obterModelo() {
        return modelo;
    }

    public int obterAno() {
        return ano;
    }

    public double obterQuilometragem() {
        return quilometragem;
    }

    // Método público para rodar o carro e atualizar a quilometragem
    public void rodar(double distancia) {
        if (distancia >= 0) {
            quilometragem += distancia;
            System.out.println("Rodou " + distancia + " quilômetros.");
        } else {
            System.out.println("A distância não pode ser negativa.");
        }
    }

    public static void main(String[] args) {

        // Criando um objeto "meuCarro" a partir da classe "Carro" com valores atribuídos aos atributos
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020, 15000.0);

        // Imprimindo os atributos iniciais, incluindo a quilometragem
        System.out.println("---Questão 01---");
        System.out.println("Marca: " + meuCarro.obterMarca());
        System.out.println("Modelo: " + meuCarro.obterModelo());
        System.out.println("Ano: " + meuCarro.obterAno());
        System.out.println("---Questão 02---");
        System.out.println("Quilometragem: " + meuCarro.obterQuilometragem() + " km");

        // Rodando o carro
        meuCarro.rodar(100.5);
        meuCarro.rodar(50.2);

        // Imprimindo a quilometragem atualizada
        System.out.println("\nQuilometragem após rodar: " + meuCarro.obterQuilometragem() + " km");
        System.out.println("---Questão 03---");
        // Criando um objeto "carroEsportivo" da classe "CarroEsportivo"
        CarroEsportivo carroEsportivo = new CarroEsportivo("Ferrari", "F40", 1992, 1000.0, 320.0);

        // Imprimindo informações do carro esportivo
        System.out.println(carroEsportivo);

        // Definindo uma nova velocidade máxima
        carroEsportivo.definirVelocidadeMaxima(350.0);

        // Acelerando o carro esportivo
        carroEsportivo.acelerar(50.0);

        System.out.println("---Questão 04---");
        // Criando um objeto "motor" e ligando-o
        Motor motorCarro = new Motor("Gasolina", 150.0);
        motorCarro.ligar();

        // Imprimindo informações do motor
        System.out.println(motorCarro);

        // Desligando o motor
        motorCarro.desligar();
    }
}


