package Fábricas;
import Fábricas.Modelos.CarroHatch;
import Fábricas.Modelos.CarroSedan;

public interface IFabricaDeCarros {

    CarroHatch criarCarroHatch();
    CarroSedan criarCarroSedan();
    CarroHatch criarCarroHatch2();
    CarroSedan criarCarroSedan2();
}