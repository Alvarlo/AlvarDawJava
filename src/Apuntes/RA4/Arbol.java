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

    //cuando nuetra clase es privada, usamos getters y setters para obtener o para poner valores a variables

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean getCauduca(){
        return caduca;
    }

    public static void raices(){ //como es estatico para llamarlo no necesito hacer una instancia
        System.out.println("tengo raices");
    }
}
