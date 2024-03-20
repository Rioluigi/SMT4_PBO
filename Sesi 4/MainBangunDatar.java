public class MainBangunDatar {

    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        // Menghitung luas persegi
        double luasPersegi = bangunDatar.luas(5);
        System.out.println("Luas persegi: " + luasPersegi);

        // Menghitung luas persegi panjang
        double luasPersegiPanjang = bangunDatar.luas(5, 3);
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);

        // Menghitung luas segitiga
        double luasSegitiga = bangunDatar.luas(4, 6);
        System.out.println("Luas segitiga: " + luasSegitiga);
    }
}