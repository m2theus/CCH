public abstract class ComputadorBuilder {

    public Computador computador;

    public Computador getComputador() {
        return this.computador;
    }

    public void novoComputador() {

        computador = new Computador();
    }

    public abstract void buildMemoria();

    public abstract void buildPlacaMae();

    public abstract void buildHd();

    public abstract void buildPlacaVideo();

    public abstract void buildTecladoGaming();

    public abstract void buildPlacaMae();

    public abstract void buildProcessador();

}
