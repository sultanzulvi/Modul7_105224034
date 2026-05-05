public class LampuPintar extends PerangkatPintar {
    public void aktifkan(){
        System.out.println("\nLampu menyala dengan tingkat kecerahan standar");
    }

    public void aturKecerahan(int level){
        System.out.printf("\nKecerahan lampu diatur ke level %d", level);
    }
    

    public void aturKecerahan(int level ,String warna){
        System.out.printf("\nKecerahan lampu diatur ke level %d dengan warna cahaya %s", level, warna);
    }
}

