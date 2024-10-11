public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    public Anjing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void bersuara() {
        System.out.println(getNamaHewan() + " menggonggong.");
    }
}