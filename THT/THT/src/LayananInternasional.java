public class LayananInternasional extends LayananEkspedisi {
    // Atribut tambahan untuk layanan internasional
    private String negaraTujuan;
    private double nilaiBarangUSD;

    public LayananInternasional(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD) { // Konstruktor untuk inisialisasi atribut
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    @Override
    public double hitungOngkir() { // Menetapkan tarif internasional sebesar Rp200.000 per kg berat efektif dengan tambahan pajak 20% untuk nilai barang di atas USD 50
        double ongkirDasar = hitungBeratEfektif() * 200000;
        double pajak = 0;

        if(nilaiBarangUSD > 50){ // Menambahkan pajak 20% untuk nilai barang di atas USD 50
            pajak = 0.20 * ongkirDasar;
        }

        return ongkirDasar + pajak; // Total ongkir termasuk pajak jika berlaku
    }

    public void cetakManifest(){ // Mencetak manifest internasional dengan informasi negara tujuan dan nilai barang dalam USD
        System.out.printf("Manifest Internasional ke %s Dengan nilai : USD %.2f\n", negaraTujuan, nilaiBarangUSD);
    }
}
