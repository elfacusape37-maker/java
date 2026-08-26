import java.util.Scanner;




public class Main {
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    float[] notas = new float[5];
    int i;
    float prom = 0;
    float mayor = 0;

    for (i = 0; i < 5; i++){
        System.out.println("ingrese la nota"+(i+1)+" :");
        notas[i]= entrada.nextFloat();

        prom = prom + notas[i];
        if (notas[i] > mayor) {
            mayor = notas[i];
        }

    }

    System.out.println("la nota mayor es: "+ mayor);
    System.out.println("tu promedio es:"+ (prom/i));

    }
}
