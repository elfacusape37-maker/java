import java.util.Scanner;




public class Main {
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    float[] notas = new float[5];
    int i = 0;
    float prom = 0;


    for (i = 0; i < 5; i++){
        System.out.println("ingrese la nota"+(i+1)+" :");
        notas[i]= entrada.nextFloat();
    }
    System.out.println("tus notas fueron");
    for (i=0;i<5;i++) {
        System.out.println(notas[i]);
        prom =prom+notas[i];
    }
    System.out.println("tu promedio es:"+ (prom/i));

    }
}
