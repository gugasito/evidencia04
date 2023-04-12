import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        solucionSistemaEcuaciones();
    }

    public static void solucionSistemaEcuaciones() {
        float x=0;
        float y=0;
        ingresarParametros();
        eliminacionDeX(x,y);

    }

    public static void eliminacionDeX(float x, float y) {

    }

    public static void ingresarParametros() {
        int A;
        int B;
        int C;
        int D;
        int E;
        int F;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de A");
        A= teclado.nextInt();
        System.out.println("Ingrese el valor de B");
        B= teclado.nextInt();
        System.out.println("Ingrese el valor de C");
        C= teclado.nextInt();
        System.out.println("Ingrese el valor de D");
        D= teclado.nextInt();
        System.out.println("Ingrese el valor de E");
        E= teclado.nextInt();
        System.out.println("Ingrese el valor de F");
        F= teclado.nextInt();
    }
}
