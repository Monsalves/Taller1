import java.nio.DoubleBuffer;
import java.util.Scanner;
public class Sismos {

    public static void main(String[] args) {

        Menu();



    }

    private static void mostrarMatriz(Double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");

        }
    }
    private static Double [][] llenarMatriz() {
        Double matriz[][] = new Double[7][24];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (Double) (Math.random() * 9.9);

            }

        }
        return matriz;
    }
    private static Double buscarMayor(Double[][] matriz){
        Double mayor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;

    }
    private static int ContarSismos(Double[][] matriz){
        int mayor5 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                double v = 5.0;
                if(matriz[i][j] > v) {
                    mayor5 = (mayor5 + 1);
                }

            }

        }
        return mayor5;

    }
    private static int ContarSms(Double[][]matriz){
        int contadorAlertas = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Double v = 7.0;
                if (matriz[i][j]>v){
                    contadorAlertas = contadorAlertas + 1;
                }
            }
        }
        return contadorAlertas;
    }
    private static void EnviarSms(int cantidad){
        int limite = 0;
        while(limite != cantidad){
            System.out.println("Alerta!!! se debe evacuar zona costera!");
            cantidad = cantidad-1;
        }
    }

    private static void Menu(){
        Double matrix [][]=llenarMatriz();
        mostrarMatriz(matrix);
        System.out.println("el sismo de mayor valor es " + buscarMayor(matrix));
        System.out.println("hay "+ContarSismos(matrix)+" sismos mayores a 5.0");
        EnviarSms(ContarSms(matrix));
        System.out.println("No se pudo realizar el menú en el tiempo estimado");
    }




}



