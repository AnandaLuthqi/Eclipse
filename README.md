import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array Gaji Pokok  B=1, C=2)
        double[] gaji = {5000000, 6500000, 9500000};

        // Array Persentase Lembur
        double[] persenLembur = {0.30, 0.32, 0.34, 0.36, 0.38};

        // Input Golongan
        System.out.print("Masukkan Golongan (A/B/C): ");
        String golonganInput = input.next().toUpperCase();

        double gajiPokok = 0;

        // IF-ELSE untuk menentukan index gaji di array
        if (golonganInput.equals("A")) {
            gajiPokok = gaji[0];
        } else if (golonganInput.equals("B")) {
            gajiPokok = gaji[1];
        } else if (golonganInput.equals("C")) {
            gajiPokok = gaji[2];
        } else {
            System.out.println("Golongan tidak valid.");
            input.close();
            return;
        }

        // Input Jam Lembur
        System.out.print("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();

        // Hitung Gaji Lembur
        double gajiLembur = 0;
        if (jamLembur > 0) {
            if (jamLembur == 1) {
                gajiLembur = jamLembur * persenLembur[0] * gajiPokok;
            } else if (jamLembur == 2) {
                gajiLembur = jamLembur * persenLembur[1] * gajiPokok;
            } else if (jamLembur == 3) {
                gajiLembur = jamLembur * persenLembur[2] * gajiPokok;
            } else if (jamLembur == 4) {
                gajiLembur = jamLembur * persenLembur[3] * gajiPokok;
            } else if (jamLembur >= 5) {
                gajiLembur = jamLembur * persenLembur[4] * gajiPokok;
            }
        }

        // Hitung Total Gaji
        double totalGaji = gajiPokok + gajiLembur;

        // Output Rincian Gaji
        System.out.println("\n--- RINCIAN GAJI ---");
        System.out.printf("Golongan       : %s%n", golonganInput);
        System.out.printf("Gaji Pokok     : Rp %, .0f%n", gajiPokok);
        System.out.printf("Gaji Lembur    : Rp %, .0f%n", gajiLembur);
        System.out.println("-------------------------------");
        System.out.printf("Total Gaji     : Rp %, .0f%n", totalGaji);

        input.close();
    }
}

