package Apuntes.RA4;

public class Arbol {
    //public o priave o protected o default (publico dentro del paquete)
    //atributos de la clase
    public double altura;
    public boolean caduca;
    public double diametroTronco;
    public String variedad;


    public Arbol(){
        this.altura = Math.random()*10;
    }
    public Arbol (String variedad, double altura){
        this.variedad = variedad; //this sirve para referirse a la
        this.altura = altura;
    }
    //click derecho, generar, seleccionar atributos
    public Arbol(double altura, boolean caduca, double diametroTronco, String variedad) {
        this.altura = altura;
        this.caduca = caduca;
        this.diametroTronco = diametroTronco;
        this.variedad = variedad;
    }

    //metodo to string: click derecho, generar - toString()

    @Override
    public String toString() {
        return "Arbol{" +
                "altura=" + altura +
                ", caduca=" + caduca +
                ", diametroTronco=" + diametroTronco +
                ", variedad='" + variedad + '\'' +
                '}';
    }
}
