package Apuntes.RA4.HomoSapiens;

/** @author Alvaro Aranda
 *
 * Con 5 atributos privados, 4 métodos (pueden ser void o devolver cualquier tipo de dato),
 * 2 constructores (uno con 3 atributos y otro con 5), getters y setters y toSrting.
 *
 * Otra clase que se llame PruebasPersona que instancia dos personas y
 * llame a todos los métodos (no es necesario llamar a los getters y setters).
 */
public class Persona {

    private int edad;
    private double peso;
    private String nombre;
    private String paisDeNacimiento;
    private boolean carnetConducir;

    public boolean mayorEdad(){
        if (edad >= 18){
            return true;
        }else return false;
    }
    public String puedeConducir(){
        if (carnetConducir){
            return "Puede conducir";
        }else{
            return "No puede conducir";
        }
    }
    public String nombreLargo(){
        if (nombre.length()> 3){
            return "Esta persona tiene un nombre muy normal";
        }else if (nombre.length() > 10){
            return "Esta persona tiene un nombre muy largo";
        }else return "Esta persona usa un mote para su nombre";
    }
    public void saludar (){
        System.out.println("Hola");
    }



    public Persona(int edad, String nombre, boolean carnetConducir) {
        this.edad = edad;
        this.nombre = nombre;
        this.carnetConducir = carnetConducir;
    }

    public Persona(int edad, int peso, String nombre, String paisDeNacimiento, boolean carnetConducir) {
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;
        this.paisDeNacimiento = paisDeNacimiento;
        this.carnetConducir = carnetConducir;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", paisDeNacimiento='" + paisDeNacimiento + '\'' +
                ", carnetConducir=" + carnetConducir +
                '}';
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaisDeNacimiento() {
        return paisDeNacimiento;
    }

    public boolean isCarnetConducir() {
        return carnetConducir;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaisDeNacimiento(String paisDeNacimiento) {
        this.paisDeNacimiento = paisDeNacimiento;
    }

    public void setCarnetConducir(boolean carnetConducir) {
        this.carnetConducir = carnetConducir;
    }
}
