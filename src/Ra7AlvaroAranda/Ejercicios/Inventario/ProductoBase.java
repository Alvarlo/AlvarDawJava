package Ra7AlvaroAranda.Ejercicios.Inventario;

public abstract class ProductoBase {
    private String nombre;
    private String categoria;
    private double precioBase;
    private double descuentoAplicado;

    public ProductoBase(String nombre, String categoria, double precioBase) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getDescuentoAplicado() {
        return descuentoAplicado;
    }

    public abstract double getPrecioFinal();

    public void aplicarDescuento(double descuentoAplicado) throws DescuentoInvalidoException{
        if (descuentoAplicado >= 0) {
            this.descuentoAplicado = descuentoAplicado;
        }else {
            throw new DescuentoInvalidoException();
        }
    }

}
