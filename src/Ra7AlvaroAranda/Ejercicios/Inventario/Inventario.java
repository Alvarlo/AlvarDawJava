package Ra7AlvaroAranda.Ejercicios.Inventario;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<ProductoBase> productos = new ArrayList<>();

    public Inventario(ArrayList<ProductoBase> productos) {
        this.productos = productos;
    }

    public void agregarProducto(ProductoBase p){
        productos.add(p);
    }
    public void aplicarDescuentoPorCategoria(double CategoriaProducto){

    }
    public double calcularValorTotalInventario(){
        return 0.0;
    }
}
