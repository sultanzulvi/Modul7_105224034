public class KartuKredit extends MetodePembayaran{
    public void bayar(double nominal){
        System.out.printf("\nMencetak tagihan Kartu Kredit sebesar Rp %.2f ", nominal);
    }

    public void verifikasiPIN(){
        System.out.println("\nMemverifikasi PIN Kartu Kredit.... BERHASIL!");
    }
}
