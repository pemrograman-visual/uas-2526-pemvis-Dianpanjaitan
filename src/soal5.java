// 12S25020 Julia Simatupang
// 12S25057 Dian Panjaitan
import java.util.*;
import java.lang.Math;

public class soal3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, gaji, tanggungan;
        double iPK;
        String nama;

        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            iPK = Double.parseDouble(input.nextLine());
            gaji = Integer.parseInt(input.nextLine());
            tanggungan = Integer.parseInt(input.nextLine());
            if (iPK >= 3.0 && gaji <= 3000000) {
                System.out.println(nama + " -> Lolos");
            } else {
                System.out.println(nama + " -> Tidak Lolos");
            }
        }
    }
}
