public class NhanVienParttime extends NhanVien {
    private int time;

    public NhanVienParttime() {

    }

    public NhanVienParttime(String employeeCode, String name, int age, String phone, String email, int time) {
        super(employeeCode, name, age, phone, email);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    @Override
    int tinhLuong() {
        return time * 100000;
    }

    @Override
    public String toString() {
        return super.toString()+ "\t"+ "NhanVienParttime :" + "\t" +
                "Thời gian làm: " + time ;
    }
}
