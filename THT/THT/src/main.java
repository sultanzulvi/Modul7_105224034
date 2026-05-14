import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
       
        ArrayList<LayananEkspedisi> daftarLayanan = new ArrayList<>();

        daftarLayanan.add(new LayananReguler("REG-11", 2, 50, 50, 50)); 
        daftarLayanan.add(new LayananExpress("EXP-22", 5, 10, 10, 10)); 
        daftarLayanan.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100));

        double totalPendapatanPerusahaan = 0.0;

        for (LayananEkspedisi layanan : daftarLayanan) {
            layanan.cetakResi();
            
            double ongkirDasar = layanan.hitungOngkir();
            totalPendapatanPerusahaan += ongkirDasar;

            if (layanan instanceof LayananReguler) {
                LayananReguler reg = (LayananReguler) layanan;
                double hargaPromo = reg.hitungOngkir(true, 25);
                System.out.println("Harga Layanan Reguler (Member, 25km): Rp" + hargaPromo + "\n");
            } 
            else if (layanan instanceof LayananExpress) {
                LayananExpress exp = (LayananExpress) layanan;
                exp.klaimAsuransi(1500000);
            } 
            else if (layanan instanceof LayananInternasional) {
                LayananInternasional inter = (LayananInternasional) layanan;
                inter.cetakManifest();
            }
        }

        System.out.println("\nTOTAL PENDAPATAN PERUSAHAAN (ONGKIR DASAR): Rp" + totalPendapatanPerusahaan);
    }
}