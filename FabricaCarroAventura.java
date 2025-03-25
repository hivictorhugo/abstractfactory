
public class FabricaCarroAventura implements FabricaVeiculo {
    public Carro createCarro() {
        return new SUV();
    }

    public Moto createMoto() {
        return new MotoCustom();
    }
}