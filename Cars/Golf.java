package Cars;
import Fábricas.Modelos.CarroHatch;

public class Golf implements CarroHatch {

    @Override
    public void exibirInfoCarroHatch() {
        System.out.println("");
        System.out.println("MODELO: Golf");
        System.out.println("FÁBRICA: VW (Volkswagen)");
        System.out.println("CATEGORIA: Hatch");
        System.out.println("");
        
    }

    
}
