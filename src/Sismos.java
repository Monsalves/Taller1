public class Sismos {
    public static void main(String[] args) {
        Double matrix [][]=llenarMatriz();
        mostrarMatriz(matrix);
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
    private static void(Double[][] matriz){
        Double mayor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        System.out.println("El sismo de mayot magnitud es de: " + mayor);

    }


}
