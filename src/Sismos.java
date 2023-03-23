
public class Sismos {
    import java.util.Scanner;
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
        System.out.println("1. Ingresar datos");
        System.out.println("2. Mostrar sismo de mayor magnitud");
        System.out.println("3. Contar sismos mayores o iguales a 5.0");
        System.out.println("4. Enviar SMS por cada sismo mayor o igual a 7.0");
        System.out.println("5.  Salir (S/N)");



    }
    private static int Metodos (int x){
        if (x=1){
            Double matrix [][]=llenarMatriz();

        }

    }
}
