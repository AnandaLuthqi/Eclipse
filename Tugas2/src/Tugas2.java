import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //  INPUT 
        System.out.print("Masukkan Golongan (1/2/3): ");
        int golongan = input.nextInt();

        System.out.print("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();

        //  VARIABEL 
        double gajiPokok = 0;
        double gajiLembur = 0;
        double totalGaji;

        //   GAJI POKOK 
        if (golongan == 1) {
            gajiPokok = 5000000;
        } else if (golongan == 2) {
            gajiPokok = 6500000;
        } else if (golongan == 3) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid.");
        }

        //   GAJI LEMBUR 
        if (gajiPokok > 0) {
            if (jamLembur == 1) {
                gajiLembur = 1 * 0.30 * gajiPokok;
            } else if (jamLembur == 2) {
                gajiLembur = 2 * 0.32 * gajiPokok;
            } else if (jamLembur == 3) {
                gajiLembur = 3 * 0.34 * gajiPokok;
            } else if (jamLembur == 4) {
                gajiLembur = 4 * 0.36 * gajiPokok;
            } else if (jamLembur >= 5) {
                gajiLembur = jamLembur * 0.38 * gajiPokok;
            } else {
                gajiLembur = 0; // jam lembur < 1
            }
        }

        //   TOTAL GAJI 
        totalGaji = gajiPokok + gajiLembur;

        //  OUTPUT 
        System.out.println("\n--- RINCIAN GAJI ---");
        System.out.println("Golongan       : " + golongan);
        System.out.println("Jam Lembur     : " + jamLembur);
        System.out.printf("Gaji Pokok     : Rp %,.0f\n", gajiPokok);
        System.out.printf("Gaji Lembur    : Rp %,.0f\n", gajiLembur);
        System.out.println("---------------------------");
        System.out.printf("Total Gaji     : Rp %,.0f\n", totalGaji);

        input.close();
    }
}
