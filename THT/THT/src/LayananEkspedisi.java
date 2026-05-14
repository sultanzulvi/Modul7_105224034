public class LayananEkspedisi {
    // Atribut menggunakan protected agar dapat diakses oleh kelas turunan
    protected String nomorResi;
    protected double beratAktualKg;
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    public LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) { // Konstruktor untuk inisialisasi atribut
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungBeratEfektif() { // Menentukan berat mana yang lebih besar antara berat aktual dan berat volumetrik
        double beratVolumetrik = (panjang * lebar * tinggi) / 6000;
        return Math.max(beratAktualKg, beratVolumetrik);
    }

    public void cetakResi(){ // Mencetak nomor resi dan berat efektif
        System.out.println("Nomor Resi : " + nomorResi);
        System.out.println("Berat Efektif : " + hitungBeratEfektif() + " kg");
    }

    public double hitungOngkir() { // Method ini akan di override oleh kelas turunan untuk menghitung ongkir sesuai dengan jenis layanan
        return 0.0; 
    }
}
