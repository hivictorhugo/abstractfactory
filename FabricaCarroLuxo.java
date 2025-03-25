
public class FabricaCarroLuxo implements FabricaVeiculo {
    public Carro createCarro() {
        return new Sedan();
    }

    public Moto createMoto() {
        return new MotoEsportiva();
    }
}
