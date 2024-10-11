public class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama);
    }

    public Mobil(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    @Override
    public void bergerak() {
        System.out.println(getNamaKendaraan() + " berjalan dengan roda.");
    }
}