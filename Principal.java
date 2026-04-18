public class Principal {
    public static void main(String[] args) {
        Veiculo caminhao = new Caminhao("ABC1234", 500.0, 3);
        Pacote pacote1 = new Pacote("BR999", 18.5, "Pendente");
        
        Rota rota1 = new Rota(pacote1, caminhao);
        rota1.iniciarEntrega();

        Veiculo moto = new Moto("XYZ9876", 30.0, true);
        Pacote pacote2 = new Pacote("BR111", 2.0, "Despachado");
        
        Rota rota2 = new Rota(pacote2, moto);
        rota2.iniciarEntrega();
    }
}