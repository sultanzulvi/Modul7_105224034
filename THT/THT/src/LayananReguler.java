public class LayananReguler extends LayananEkspedisi {
    
    public LayananReguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) { // Konstruktor untuk inisialisasi atribut
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    @Override // Menetapkan tarif reguler sebesar Rp15.000 per kg berat efektif
    public double hitungOngkir() {
        return hitungBeratEfektif() * 15000;
    }

    public double hitungOngkir(boolean isMember, int jarakKm) { // Menghitung ongkir dengan diskon 10% untuk member dan surcharge Rp500 per km untuk jarak di atas 20km
        double tarifDasar = hitungOngkir();
        
        if (isMember) { // Member mendapatkan diskon 10% dari tarif dasar
            tarifDasar -= (0.10 * tarifDasar);
        }
        
        double surchargeJarak = jarakKm * 500; // Surcharge Rp500 per km untuk jarak di atas 20km
        return tarifDasar + surchargeJarak;
    }

}
