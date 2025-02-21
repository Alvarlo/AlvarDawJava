package Ra7AlvaroAranda.Ejercicios.Inventario;

import java.util.Date;

public class ProductoConPromocion extends ProductoBase implements IPromocion{
    private Date fechaInicioPromocion;
    private Date fechaFinalPromocion;

    public ProductoConPromocion(String nombre, String categoria, double precioBase, Date fechaInicioPromocion, Date fechaFinalPromocion) {
        super(nombre, categoria, precioBase);
        this.fechaInicioPromocion = fechaInicioPromocion;
        this.fechaFinalPromocion = fechaFinalPromocion;
    }

    @Override
    public void aplicarPromocion(double porcentajeDescuento) {

    }

    @Override
    public void estaEnPromocion() {

    }

    @Override
    public double getPrecioFinal() {
        return 0;
    }
}
