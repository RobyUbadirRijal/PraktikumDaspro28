import java.util.Scanner;
public class StudiKasus2_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String mahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int statusPendanaan;
        int juara;

        System.out.print("Masukkan nama mahasiswa: ");
        mahasiswa = input.nextLine();
        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = input.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Masukkan juara (1/2/3): ");
            juara = input.nextInt();
            if (juara >= 1 && juara <= 3) {
                System.out.print("Masukkan jumlah dokumen: ");
                jumlahDokumen = input.nextInt();
                if (jumlahDokumen == 4) {
                    System.out.println("Mahasiswa " + mahasiswa + " mendapatkan dana dari " + jenisKegiatan + ".");
                    System.out.println("Mahasiswa " + mahasiswa + " juga memenuhi syarat jumlah dokumen.");
                } else {
                    System.out.println("Mahasiswa " + mahasiswa + " tidak mendapatkan dana dari " + jenisKegiatan + ".");
                    System.out.println("Mahasiswa kurang "+ (4 - jumlahDokumen) + " dokumen untuk memenuhi syarat.");
                }
            } else {
                System.out.println("Mahasiswa " + mahasiswa + " tidak mendapatkan dana dari " + jenisKegiatan + ".");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Masukkan status pendanaan (1 = tersedia, 0 = tidak tersedia): ");
            statusPendanaan = input.nextInt();
            if (statusPendanaan == 1) {
                System.out.println("Mahasiswa " + mahasiswa + " mendapatkan dana dari PKM.");
                System.out.print("Masukkan jumlah dokumen: ");
                jumlahDokumen = input.nextInt();
                if (jumlahDokumen == 4) {
                    System.out.println("Mahasiswa " + mahasiswa + " mendapatkan dana dari " + jenisKegiatan + ".");
                    System.out.println("Mahasiswa " + mahasiswa + " juga memenuhi syarat jumlah dokumen.");
                } else {
                    System.out.println("Mahasiswa " + mahasiswa + " tidak mendapatkan dana dari " + jenisKegiatan + ".");
                    System.out.println("Mahasiswa kurang "+ (4 - jumlahDokumen) + " dokumen untuk memenuhi syarat.");
                }
            } else {
                System.out.println("Mahasiswa " + mahasiswa + " tidak mendapatkan dana dari PKM.");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Mahasiswa " + mahasiswa + " tidak mendapatkan dana dari kegiatan lainnya.");
        } else {
            System.out.println("Jenis kegiatan tidak valid.");
        }
        input.close();
    }
}
