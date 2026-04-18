public abstract class Veiculo {
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.placa = placa;
        this.capacidade = capacidade;
    }

    public String getPlaca() {
        return placa;
    }
}