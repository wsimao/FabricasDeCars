package Cars;
import Fábricas.Modelos.CarroSedan;

public class Virtus implements CarroSedan{

    @Override
    public void exibirInfoCarroSedan() {
        System.out.println("");
        System.out.println("MODELO: Virtus");
        System.out.println("FÁBRICA: VW (Volkswagen)");
        System.out.println("CATEGORIA: Sedan");
        System.out.println("");
        
    }

    
}
