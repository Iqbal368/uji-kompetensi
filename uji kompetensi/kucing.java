public class Kuncing extends Hewan{
    public Kucing(String nama){
        super(nama);
    }

    public Kucing(String nama, int umur){
        super(nama umur);
    }

    public void bersuara(int kali){
        for (int i = 0; i < kali; i++){
            System.out.println(getNamaHewan() + " meong.");
        }
    }
}