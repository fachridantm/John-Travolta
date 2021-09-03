import java.util.Scanner;

public class JohnTravolta {
    final static double gajiPerJam = 15000; // Jika <= 40 jam/minggu
    final static double gajiLembur = 15000 * 1.5; // Jika > 40 jam/minggu

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalPemasukan, pengeluaran, tabungan;

        // Input User
        System.out.print("Jam Kerja = ");
        int jamKerja = in.nextInt();
        System.out.print("Pengeluaran (Rp) = ");
        pengeluaran = in.nextDouble();

        // totalPemasukan
        totalPemasukan = gajiPokok(jamKerja) + bonusLembur(jamKerja);

        // tabungan
        tabungan = totalPemasukan - pengeluaran;

        // Output
        System.out.println("=========================");
        System.out.println("Gaji Per Jam (<= 40 jam/minggu) = " + gajiPerJam);
        System.out.println("Gaji Lembur (> 40 jam/minggu) = " + gajiLembur);
        System.out.println("=========================");
        System.out.println("Jam Kerja = " + jamKerja);
        System.out.println("Gaji Pokok (Rp) = " + gajiPokok(jamKerja));
        System.out.println("Bonus Lembur (Rp) = " + bonusLembur(jamKerja));
        System.out.println("Pengeluaran (Rp) = " + pengeluaran);
        System.out.println("Pemasukan (Rp) = " + totalPemasukan);
        System.out.println("=========================");
        System.out.println("Sehingga, John Travolta " + ekspetasiHasil(totalPemasukan, pengeluaran));
        System.out.println("Jadi, Tabungan John Travolta saat ini adalah " + tabungan);
    }

    public static double gajiPokok(int jamKerja) {
        if (jamKerja <= 40) {
            return jamKerja * gajiPerJam;
        } else {
            return (40 * gajiPerJam);
        }
    }

    public static double bonusLembur(int jamKerja) {
        if (jamKerja > 40) {
            return (jamKerja - 40) * gajiLembur;
        }
        return 0;
    }

    public static String ekspetasiHasil(double totalPemasukan, double pengeluaran) {

        if (totalPemasukan > pengeluaran) {
            return "Bisa Menabung";
        } else if (totalPemasukan == pengeluaran) {
            return "Tidak Bisa Menabung";
        } else { // totalPemasukan < pengeluaran
            return "Harus Cari Tambahan";
        }
    }
}
