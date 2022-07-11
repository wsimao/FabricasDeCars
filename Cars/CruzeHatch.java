package Cars;
import Fábricas.Modelos.CarroHatch;

public class CruzeHatch implements CarroHatch {

    @Override
    public void exibirInfoCarroHatch() {
        System.out.println("");
        System.out.println("MODELO: Cruze");
        System.out.println("FÁBRICA: Chevrolet");
        System.out.println("CATEGORIA: Hatch");
        System.out.println("");
        
    }

    
}
