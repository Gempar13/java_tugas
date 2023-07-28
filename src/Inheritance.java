public class Inheritance {

    public static class Handphone {

        int Harga;
        String Warna;
        String Perusahaan;

        public Handphone(int Harga, String Warna, String Perusahaan) {
            this.Harga = Harga;
            this.Warna = Warna;
            this.Perusahaan = Perusahaan;
        }

        public String printDetails() {
            return "Harga: " + Harga + " Warna: " + Warna + " Perusahaan: " + Perusahaan;
        }
    }

    public static class Samsung extends Handphone {

        String Fitur;

        public Samsung(int Harga, String Warna, String Perusahaan, String Fitur) {
            super(Harga, Warna, Perusahaan);
            this.Fitur = Fitur;
        }

        @Override
        public String printDetails() {
            return super.printDetails() + " Fitur: " + Fitur;
        }
    }

    public static void main(String[] args) {
        Samsung s = new Samsung(20000, "Biru", "Samsung", "menyentuh");
        System.out.println(s.printDetails());
    }
}