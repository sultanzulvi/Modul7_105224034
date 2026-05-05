    import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {
        ArrayList<PerangkatPintar> perangkat = new ArrayList<>();
        perangkat.add(new LampuPintar());
        perangkat.add(new AcPintar());

        for (PerangkatPintar value : perangkat){
            value.aktifkan();
        }
        
    // Karena method aktifkan sudah ter override dan otomatis yang tercetak adalah aktifkan() dari masing-masing subclass

    if(perangkat.get(1) instanceof AcPintar){
        AcPintar ac = (AcPintar) perangkat.get(1);
        ac.aturSuhu(27);
    }

    PerangkatPintar alat1 = new LampuPintar();
    // alat1.aturKecerahan(75, "Putih"); . Karena method aturKecerahan dengan 2 parameter tidak ada di class PerangkatPintar, maka method tersebut tidak bisa diakses melalui referensi alat1 dengan tipe PerangkatPintar.
    // perbaikan
    ((LampuPintar)alat1).aturKecerahan(75, "Putih");
    }
}
