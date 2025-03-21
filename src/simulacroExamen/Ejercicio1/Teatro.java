package simulacroExamen.Ejercicio1;

public class Teatro {
    public String nombre;
    public Asiento[] asientos;

    public Teatro(String nombre) {
        this.nombre = nombre;
        this.asientos = new Asiento[50];
    }
    public void agregarAsiento(int fila, int numero, double precio, boolean vip){
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == null){
                asientos[i] = new Asiento(fila,numero,precio,vip);
                System.out.println("Se ha añadido el asiento");
                return; //un return en una funcion void lo que hace es parar la funcion
            }
        }
        System.out.println("No se ha añadido ningún asiento");
    }
    public void calcularPrecios(String diaSemana){
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null){
                System.out.print(asientos[i].toString());
                System.out.println("Precio = " + asientos[i].calcularPrecio(diaSemana));
            }
        }
    }
}
