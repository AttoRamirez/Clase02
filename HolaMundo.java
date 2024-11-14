import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Alejo como vas");
        System.out.println("Esta haciendo hambre , no");
        System.out.printf("Aqui va una cadena:. %s%n", "Alejo");
        System.out.printf("Aqui va un entero: %d%n", 24);
     
        var entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un numero entrero: ");
        
        System.out.println(entrada);

        entrada.close();
    }
}