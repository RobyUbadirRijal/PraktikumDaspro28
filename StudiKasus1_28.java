import java.util.Scanner;
public class StudiKasus1_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian;
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang yang dibayar: ");
        uangBayar = input.nextInt();
        totalHarga = hargaPerCup * jumlahCup;
        if (totalHarga > 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }
        totalBayar = totalHarga - diskon;
        kembalian = uangBayar - totalBayar;
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);
        System.out.println("Kembalian: " + kembalian);
        input.close();
    }
}
