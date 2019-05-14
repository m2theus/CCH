public class ComputadorTrabalhoBuilder extends ComputadorBuilder {

    @Override
    public void buildMemoria() {

        computador.setMemoria("sandisk");

    }

    @Override
    public void buildPlacaMae() {

        computador.setPlacaMae("placa mae asus");
    }

    @Override
    public void buildHd() {

        computador.serHd("hd sata");

    }


    @Override
    public void buildProcessador() {

        computador.setProcessador("intel core i7");
    }

}
