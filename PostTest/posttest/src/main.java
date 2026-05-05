import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<MetodePembayaran> metode = new ArrayList<>();
        metode.add(new EWallet());
        metode.add(new KartuKredit());

        for(MetodePembayaran tipe : metode){
            if(tipe instanceof EWallet){
                EWallet ewallet = (EWallet) tipe;
                ewallet.bayar(100000, "08123456789");
            }else if(tipe instanceof KartuKredit){
                KartuKredit kartu = (KartuKredit) tipe;
                kartu.bayar(100000);
                kartu.verifikasiPIN();  
            }else{
                tipe.bayar(100000);
            }
        }

    }
}
