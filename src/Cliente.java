public class Cliente {

    private ComputadorBuilder computadorBuilder;

    public void setComputadorBuilder(ComputadorBuilder computadorBuilder) {
        this.computadorBuilder = computadorBuilder;
    }

    public Computador getComputador() {

        return computadorBuilder.getComputador();
    }

    public void construtorComputador() {
        computadorBuilder.novoComputador();
        computadorBuilder.buildProcessador();
        computadorBuilder.buildMemoria();
        computadorBuilder.buildPlacaMae();
        computadorBuilder.buildHd();
        computadorBuilder.buildPlacaVideo();
        computadorBuilder.buildTecladoGaming();
    }
}
