public class NhanVienFulltime extends NhanVien {
    private int bonus;
    private int fine;
    private int saraly;

    public NhanVienFulltime() {

    }

    public NhanVienFulltime(String employeeCode, String name, int age, String phone, String email, int bonus, int fine, int saraly) {
        super(employeeCode, name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.saraly = saraly;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getSaraly() {
        return saraly;
    }

    public void setSaraly(int saraly) {
        this.saraly = saraly;
    }

    @Override
    int tinhLuong() {
        return saraly + bonus - fine;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "NhanVienFulltime " + "\n" +
                "Tiền thưởng: " + bonus + "\n" +
                " Tiền phạt: " + fine + "\n " +
                " Lương cứng: " + saraly;
    }
}
