public class EWallet extends MetodePembayaran{
    public void bayar(double nominal){
        System.out.printf("Memotong saldo E-Wallet sebesar Rp %.2f", nominal);
    }

    public void bayar(double nominal, String nomorHP){
        System.out.printf("\nMemotong saldo E-Wallet sebesar Rp %.2f dari nomor %s", nominal, nomorHP);
    }
}
