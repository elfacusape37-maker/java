import java.util.Scanner;




public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        float[] notas = new float[5];
        float prom = 0;
        float mayor = 0;
        int i;
        int aprobados = 0;
        int desaprobados = 0;


        for (i = 0; i < 5; i++){
            System.out.println("ingrese la nota de los alumnos"+(i+1)+" :");
            notas[i]= entrada.nextFloat();

            prom = prom + notas[i];
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] >= 6){
                aprobados++;
            } else {
                desaprobados++;
            }
        }


        System.out.println("aprobados: "+ aprobados);
        System.out.println("desaprobados: "+ desaprobados);

    }
}