package Fábricas;
import Cars.Gol;
import Cars.Golf;
import Cars.Jetta;
import Cars.Virtus;
import Fábricas.Modelos.CarroHatch;
import Fábricas.Modelos.CarroSedan;

public class FabricaVW implements IFabricaDeCarros{

    @Override
    public CarroHatch criarCarroHatch() {
        return new Gol();
    }

    @Override
    public CarroSedan criarCarroSedan() {
        return new Jetta();
    }

    @Override
    public CarroHatch criarCarroHatch2() {
        return new Golf();
    }

    @Override
    public CarroSedan criarCarroSedan2() {
        return new Virtus();
    }
    
}
