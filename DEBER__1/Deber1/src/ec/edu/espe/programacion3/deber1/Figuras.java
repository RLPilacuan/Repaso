
package ec.edu.espe.programacion3.deber1;


public class Figuras {
    private String nombreFigura;
    //Construct
    public Figuras(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
   
    //Getter and Setter
    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
    // Info
    public String imprimirLista(){
        return "La figura es "+ getNombreFigura()+"\n";
    }
    
}
