
public class Concessionaria {

    private Carro carro;
    private Moto moto;

    public Concessionaria(FabricaVeiculo fabrica) {
        this.carro = fabrica.createCarro();
        this.moto = fabrica.createMoto();
    }

    public String exibirCarro() {
        return this.carro.getModelo();
    }

    public String exibirMoto() {
        return this.moto.getModelo();
    }
}
