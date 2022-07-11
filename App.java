import Fábricas.FabricaChevrolet;
import Fábricas.FabricaVW;
import Fábricas.IFabricaDeCarros;
import Fábricas.Modelos.CarroHatch;
import Fábricas.Modelos.CarroSedan;
import Cars.*;

public class App {
    public static void main(String[] args) {
        IFabricaDeCarros fabrica = new FabricaVW();
        CarroHatch hatch = fabrica.criarCarroHatch();
        CarroSedan sedan = fabrica.criarCarroSedan();
        CarroHatch hatch4 = fabrica.criarCarroHatch2();
        CarroSedan sedan4 = fabrica.criarCarroSedan2();
    

        fabrica = new FabricaChevrolet();
        CarroHatch hatch2 = fabrica.criarCarroHatch();
        CarroSedan sedan2 = fabrica.criarCarroSedan();
        CarroHatch hatch3 = fabrica.criarCarroHatch2();
        CarroSedan sedan3 = fabrica.criarCarroSedan2();

        System.out.println("INFORMAÇÕES DA FÁBRICA VW (Volkswagen)");

        hatch.exibirInfoCarroHatch();
        sedan.exibirInfoCarroSedan();
        hatch4.exibirInfoCarroHatch();
        sedan4.exibirInfoCarroSedan();

        System.out.println("INFORMAÇÕES DA FÁBRICA CHEVROLET");

        hatch2.exibirInfoCarroHatch();
        sedan2.exibirInfoCarroSedan();
        hatch3.exibirInfoCarroHatch();
        sedan3.exibirInfoCarroSedan();

    }
    
}
