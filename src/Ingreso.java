import java.util.Arrays;
import java.util.Random;

public class Ingreso {
    private static final int MAX_VALUE = 30000;

    public static int[] generarValoresAleatorios(int tamanoMaximo) {
        int[] valores = new int[tamanoMaximo];
        Random random = new Random();
        for (int i = 0; i < tamanoMaximo; i++) {
            valores[i] = random.nextInt(MAX_VALUE) + 1;
        }
        return valores;
    }

    public static int[] obtenerSubArreglo(int[] arregloGrande, int nuevoTamano) {
        return Arrays.copyOfRange(arregloGrande, 0, nuevoTamano);
    }
}
