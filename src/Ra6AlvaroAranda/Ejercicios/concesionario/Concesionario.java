package Ra6AlvaroAranda.Ejercicios.concesionario;

import java.util.Arrays;


public class Concesionario {
    public String nombre;
    public String direccion;
    public String telefono;
    public Vehiculo[] inventario;
    public int cantidadVehiculos;

    public Concesionario(String nombre, String direccion, String telefono, int cantidadVehiculos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantidadVehiculos = cantidadVehiculos;
        inventario = new Vehiculo[cantidadVehiculos];
    }


    public boolean agregarVehiculo(Vehiculo vehiculo){
        boolean hayEspacio = false;
        int i = 0;
        while(i < inventario.length && !hayEspacio) {

            if (inventario[i] == null) {
                hayEspacio = true;
                inventario[i] = vehiculo;
                cantidadVehiculos++;
            }else i++;
        }
        if (!hayEspacio){
            System.out.println("Esta lleno");
        }
        return hayEspacio;
    }

    public void mostrarInventario(){
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null){
                inventario[i].mostrarDetalles();
            }
        }
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", inventario=" + Arrays.toString(inventario) +
                ", cantidadVehiculos=" + cantidadVehiculos +
                '}';
    }


}
