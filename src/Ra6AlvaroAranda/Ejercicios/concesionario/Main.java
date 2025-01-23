package Ra6AlvaroAranda.Ejercicios.concesionario;

public class Main {
    public static void main(String[] args) {

        Concesionario c = new Concesionario("concesionario1","calle coche 2","789456123",6);

        Vehiculo v = new Vehiculo("asd","ett",2004,24000);
        Auto a = new Auto("seat","ibiza",2001,30000,5,true);

        c.agregarVehiculo(v);
        c.agregarVehiculo(v);
        c.agregarVehiculo(v);
        c.agregarVehiculo(v);
        c.agregarVehiculo(v);
        c.agregarVehiculo(v);


        c.mostrarInventario();
        System.out.println(a.calcularDescuento());



    // lo probe asi como esta ahora antes pero creo que como estaba mal,  el bucle XDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD

        //no sale bro solo sale el descuento
    }
}
