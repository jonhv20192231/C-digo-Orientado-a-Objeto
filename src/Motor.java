class Motor {
    private String tipo;
    private double potencia;
    private boolean ligado;

    public Motor(String tipo, double potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.ligado = false; // O motor começa desligado
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Motor ligado.");
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    public boolean estaLigado() {
        return ligado;
    }

    @Override
    public String toString() {
        return "Motor: " +
                "Tipo: " + tipo +
                ", Potência: " + potencia + " HP" +
                ", Ligado: " + (ligado ? "Sim" : "Não");
    }


}
