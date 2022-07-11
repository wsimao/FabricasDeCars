package Cars;
import Fábricas.Modelos.CarroSedan;

public class OnixSedan implements CarroSedan {

    @Override
    public void exibirInfoCarroSedan() {
        System.out.println("");
        System.out.println("MODELO: Onix");
        System.out.println("FÁBRICA: Chevrolet");
        System.out.println("CATEGORIA: Sedan");
        System.out.println("");
    }

    
}
