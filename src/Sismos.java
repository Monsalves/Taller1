public class Sismos {
    public static void main(String[] args) {
        Double matrix [][]=llenarMatriz();
        mostrarMatriz(matrix);
        System.out.println(buscarMayor(matrix));
        System.out.println(ContarSismos(matrix));



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


}
