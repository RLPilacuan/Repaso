
package ec.edu.espe.programacion3.deber1;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
       ArrayList <Figuras> listaFiguras=new ArrayList<Figuras>();
       listaFiguras.add(new Figuras("triangulo"));
       listaFiguras.add(new Figuras("cuadrado"));
       listaFiguras.add(new Figuras("rombo"));
       listaFiguras.add(new Figuras("circulo"));
       listaFiguras.add(new Figuras("rectangulo"));
       for(Figuras figure:listaFiguras ){
           System.out.println(figure.imprimirLista());
       }
    }
}
