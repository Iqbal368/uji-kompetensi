public class Kendaraan{
    priivate String namaKendaraan;

    public Kendaraan(String nama){
        this.namaKendaraan = nama;
    }

    public Kendaraan(String nama, int kecepatan){
        this.namaKendaraan = nama;
        System.out.println(namaKendaraan + "melaju dengan kecepatan" + kecepatan + " km/jam.");
    }

    public String getNamaKendaraan(){
        return namaKendaraan;
    }

    public void setNamaKendaraan(String nama){
        this.namaKendaraan = nama;
    }

    public void bergerak(){
        System.out.println(namaKendaraan + "sedang bergerak.");
    }
}