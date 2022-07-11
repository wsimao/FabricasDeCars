package Cars;
import Fábricas.Modelos.CarroSedan;

public class CruzeSedan implements CarroSedan{

    @Override
    public void exibirInfoCarroSedan() {
        System.out.println("");
        System.out.println("MODELO: Cruze");
        System.out.println("FÁBRICA: Chevrolet");
        System.out.println("CATEGORIA: Sedan");
        System.out.println("");
        
    }

    
}
