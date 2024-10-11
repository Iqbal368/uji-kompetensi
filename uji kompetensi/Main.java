public class Main {
    public static void main(String[] args) {
        // Inheritance dan Polimorfisme
        Hewan hewan1 = new Kucing("Milo", 2); // Kucing adalah Hewan (Inheritance)
        Hewan hewan2 = new Anjing("Buddy", 3); // Anjing adalah Hewan (Inheritance)

        // Polimorfisme: Memanggil metode bersuara() yang di-override di masing-masing kelas anak
        hewan1.bersuara(); // Output: Milo mengeong
        hewan2.bersuara(); // Output: Buddy menggonggong

        // Menggunakan Setter dan Getter
        hewan1.setUmurHewan(5);
        System.out.println(hewan1.getNamaHewan() + " berumur " + hewan1.getUmurHewan() + " tahun.");

        // Contoh Overloading pada kelas Kucing
        Kucing kucing = new Kucing("Simba", 4);
        kucing.bersuara(3); // Output: Simba mengeong sebanyak 3 kali

        // Contoh Overriding pada kelas Kendaraan
        Mobil mobil = new Mobil("Toyota", 60);
        mobil.bergerak(); // Output: Toyota berjalan dengan roda
    }
}