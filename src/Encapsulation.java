public class Encapsulation {

    public static class Karyawan {
        private String Nama; 
        private int Gaji;

        public String getName() {
            return Nama;
        }

        public void setName(String Nama) {
            this.Nama = Nama;
        }

        public int getSalary() {
            return Gaji;
        }

        public void setSalary(Integer Gaji) {
            this.Gaji = Gaji;
        }
    }

    public static void main(String[] args) {
        Karyawan e = new Karyawan();
        e.setName("Gempar");
        e.setSalary(20000);

        System.out.println(e.Nama);
        System.out.println(e.Gaji + "");
    }
}