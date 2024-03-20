public class MainPesan {

    public static void main(String[] args) {
        Pesan pesan = new Pesan();

        // Mencetak pesan tanpa pengirim
        pesan.cetakPesan("Selamat pagi!");

        // Mencetak pesan dengan pengirim
        pesan.cetakPesan("Terima kasih", "Budi");
    }
}