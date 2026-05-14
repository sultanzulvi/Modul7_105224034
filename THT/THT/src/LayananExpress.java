public class LayananExpress extends LayananEkspedisi {

    public LayananExpress(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) { // Konstruktor untuk inisialisasi atribut
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    @Override
    public double hitungOngkir() { // Menetapkan tarif express sebesar Rp30.000 per kg berat efektif
        return hitungBeratEfektif() * 30000;
    }

    public void klaimAsuransi(double nilaiBarang){ // Mengklaim asuransi dengan ketentuan VIP untuk nilai barang di atas Rp1.000.000 dan standar untuk nilai barang di bawah atau sama dengan Rp1.000.000
        if(nilaiBarang > 1000000){ // Klaim asuransi VIP untuk nilai barang di atas Rp1.000.000
            System.out.printf("Klaim asuransi VIP Rp[%.2f] untuk resi [%s] sedang diproses prioritas", nilaiBarang, nomorResi);
        }else{ // Klaim asuransi standar untuk nilai barang di bawah atau sama dengan Rp1.000.000
            System.out.println("Klaim asuransi standar sedang diproses dalam 7 hari kerja");
        }
    }
}
