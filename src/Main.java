import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập phần tử vào mảng");
        int size = sc.nextInt();






        NhanVien nv[] = new NhanVien[5];
        nv[0] = new NhanVienFulltime("txt12", "zaizo", 25, "113", "abc@as", 1000, 500, 5000);
        nv[1] = new NhanVienFulltime("txc1", "jack", 26, "03124568", "axx@gmai", 2000, 100, 5500);
        nv[2] = new NhanVienFulltime("tac1", "kaido", 20, "03126598", "acx@gmai", 2000, 0, 5500);
        nv[3] = new NhanVienParttime("acc", "tama", 15, "0215215", "scf@gmai", 150);
        nv[4] = new NhanVienParttime("ac1c", "tamao", 17, "0335215", "saf@gmai", 150);

        for (int i = 0; i < nv.length; i++) {
            System.out.println("nhân viên " + nv[i].getName() + " : " + nv[i].toString());
        }
        int count = 0;
        for (NhanVien ab : nv
        ) {

            System.out.println("đây là tiền của " + ab.getName() + " là :" + ab.tinhLuong());
            if (ab instanceof NhanVienParttime) {
                count += ab.tinhLuong();
            }
            System.out.println("tiền " + count);
        }

    }
}
