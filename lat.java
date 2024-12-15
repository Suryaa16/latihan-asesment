import java.util.Scanner;

public class lat {

    public static void main(String[] args) {
        Scanner er = new Scanner(System.in);
        double[] array1 = new double[10];
        double[] array2 = new double[10];

        System.out.println("Masukkan elemen-elemen untuk Array Ke-1:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = er.nextDouble();
        }

        System.out.println("Array Ke-1:");
        for (double a : array1) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Masukkan elemen-elemen untuk Array Ke-2:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = er.nextDouble();
        }

        System.out.println("Array Ke-2:");
        for (double b : array2) {
            System.out.print(b + " ");
        }
        System.out.println();

        bubbleSort(array1);
        bubbleSort(array2);

        System.out.println("Array Ke-1 setelah diurutkan:");
        for (double a : array1) {
            System.out.printf(String.format("%.2f", a) + " ");
        }
        System.out.println();

        System.out.println("Array Ke-2 setelah diurutkan:");
        for (double b : array2) {
            System.out.printf(String.format("%.2f", b) + " ");
        }
        System.out.println();

        er.close();
    }

    public static void bubbleSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) { // Mulai dari 0
            for (int j = 0; j < n - i - 1; j++) { // Mulai dari 0 hingga n - i - 1
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
