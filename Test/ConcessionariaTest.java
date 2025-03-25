package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcessionariaTest {

    @Test
    void deveExibirCarroLuxo() {
        FabricaVeiculo fabricaLuxo = new FabricaCarroLuxo();
        Concessionaria concessionaria = new Concessionaria(fabricaLuxo);
        assertEquals("Carro Sedan", concessionaria.exibirCarro());
    }

    @Test
    void deveExibirMotoLuxo() {
        FabricaVeiculo fabricaLuxo = new FabricaCarroLuxo();
        Concessionaria concessionaria = new Concessionaria(fabricaLuxo);
        assertEquals("Moto Esportiva", concessionaria.exibirMoto());
    }

    @Test
    void deveExibirCarroAventura() {
        FabricaVeiculo fabricaAventura = new FabricaCarroAventura();
        Concessionaria concessionaria = new Concessionaria(fabricaAventura);
        assertEquals("Carro SUV", concessionaria.exibirCarro());
    }

    @Test
    void deveExibirMotoAventura() {
        FabricaVeiculo fabricaAventura = new FabricaCarroAventura();
        Concessionaria concessionaria = new Concessionaria(fabricaAventura);
        assertEquals("Moto Custom", concessionaria.exibirMoto());
    }
}
