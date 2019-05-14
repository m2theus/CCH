public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        ComputadorBuilder computadorGamerBuilder = new ComputadorGamingBuilder();

        cliente.setComputadorBuilder(computadorGamerBuilder);
        cliente.construtorComputador();

        Computador computador = cliente.getComputador();

        System.out.println(computador);
    }
}
