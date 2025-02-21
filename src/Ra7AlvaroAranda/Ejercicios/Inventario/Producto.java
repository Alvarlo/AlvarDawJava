package Ra7AlvaroAranda.Ejercicios.Inventario;

public class Producto extends ProductoBase implements IDescuento{


    public Producto(String nombre, String categoria, double precioBase) {
        super(nombre, categoria, precioBase);
    }

    @Override
    public void aplicarDescuentoPorcentual(double porcentajeDescuento) throws DescuentoInvalidoException {
       aplicarDescuento((porcentajeDescuento*getPrecioBase())/100);
    }

    @Override
    public void aplicarDescuentoPorcentajeMaximo(double porcentajeDescuento) throws DescuentoInvalidoException {
        if (porcentajeDescuento < 100){
            aplicarDescuentoPorcentual(getPrecioBase());
        }else{
            System.out.println("No se puede aplicar un descuento de mas del 100%");
        }
    }

    @Override
    public double getPrecioFinal() {
        return getPrecioBase()-getDescuentoAplicado();
    }
}
