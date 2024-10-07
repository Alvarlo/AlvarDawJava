public class Prueba {
    public static void main(String[] args) {
        //Declarar dos variables enteras, y una para cada operación
        int num1, num2, suma, resta, divi, multi, resto;
        String fraseSumar = "La suma es: ";
        String fraseRestar = "La resta es: ";
        String fraseMulti = "La multiplicacion es: ";
        String fraseDivi = "La división es: ";
        String fraseResto = "El resto es: ";

        //inicializar las dos variables de numeros
        num1 = 7;
        num2 = 3;

        //asignaremos a las operaciones sus valores
        suma = num1 + num2;
        resta = num1 - num2;
        divi = num1 / num2;
        multi = num1 * num2;
        resto = num1 % num2;

        //mostraremos los resultados
        System.out.println(fraseSumar + suma);
        System.out.println(fraseRestar + resta);
        System.out.println(fraseDivi + divi);
        System.out.println(fraseMulti + multi);
        System.out.println(fraseResto + resto);
    }
}
