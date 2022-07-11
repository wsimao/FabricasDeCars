package Cars;
import Fábricas.Modelos.CarroSedan;

public class Jetta implements CarroSedan {

    @Override
    public void exibirInfoCarroSedan() {
        System.out.println("");
        System.out.println("MODELO: Jetta");
        System.out.println("FÁBRICA: VW (Volkswagen)");
        System.out.println("CATEGORIA: Sedan");
        System.out.println("");
        
    }

    
}
