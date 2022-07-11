package Fábricas;
import Cars.CruzeHatch;
import Cars.CruzeSedan;
import Cars.OnixHatch;
import Cars.OnixSedan;
import Fábricas.Modelos.CarroHatch;
import Fábricas.Modelos.CarroSedan;

public class FabricaChevrolet implements IFabricaDeCarros {

    @Override
    public CarroHatch criarCarroHatch() {
        return new CruzeHatch();
    } 

    @Override
    public CarroSedan criarCarroSedan() {
        return new CruzeSedan();
    }

    @Override
    public CarroHatch criarCarroHatch2() {
        return new OnixHatch();
    }

    @Override
    public CarroSedan criarCarroSedan2() {
        return new OnixSedan();
    }
    
}
