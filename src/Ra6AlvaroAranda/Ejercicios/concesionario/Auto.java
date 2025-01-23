package Ra6AlvaroAranda.Ejercicios.concesionario;

public class Auto extends Vehiculo{
    public int puertas;
    public boolean esElectrico;

    public Auto(String marca, String modelo, int anio, double precio, int puertas, boolean esElectrico) {
        super(marca, modelo, anio, precio);
        this.puertas = puertas;
        this.esElectrico = esElectrico;
    }

    public double calcularDescuento(){
        double descuento = 0;

        if (esElectrico){
            descuento = 20.00;
        }else {
            descuento = 10.00;
        }
        return descuento;
    }
    @Override
    public String toString() {
        return "Auto{" +
                "puertas=" + puertas +
                ", esElectrico=" + esElectrico +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", precio=" + precio +
                '}';
    }


}
