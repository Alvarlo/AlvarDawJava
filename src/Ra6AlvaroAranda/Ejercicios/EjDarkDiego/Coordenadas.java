package Ra6AlvaroAranda.Ejercicios.EjDarkDiego;

/**
 * -Crea la clase Coordenadas con los atributos int X e int Y con getters, setters, un constructor y un ToString()
 * para que cada coordenada salga por pantalla de la siguiente manera: (1,2)
 * -En la clase Main, dentro del método main, instancia un Array de Coordenadas vacío de longitud 15, para luego
 * rellenarlo con coordenadas aleatorias.
 * -Ejercicio 1:
 * 	-Saca por pantalla todas las coordenadas cuyo X sea menor que 6
 * -Ejercicio2 Ordenación:
 * 	-Ordena el array de menor a mayor, teniendo en cuenta el valor de X (sin utilizar métodos de Java)
 * -Ejercicio3:
 * 	-Desordena el array con posiciones aleatorias
 *
 */

public class Coordenadas {
    private int x;
    private int y;

    public Coordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +
                "-" + y +
                ')';
    }
}
