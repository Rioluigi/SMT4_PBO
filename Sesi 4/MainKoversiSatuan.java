public class MainKoversiSatuan {

    public static void main(String[] args) {
        KonversiSatuan konversiSatuan = new KonversiSatuan();

        // Konversi cm ke m
        double konversiCmKeM = konversiSatuan.konversi(100, "cm", "m");
        System.out.println("100 cm = " + konversiCmKeM + " m");

        // Konversi m ke cm
        double konversiMKeCm = konversiSatuan.konversi(1, "m", "cm");
        System.out.println("1 m = " + konversiMKeCm + " cm");

        // Satuan tidak valid
        double konversiInvalid = konversiSatuan.konversi(100, "km", "m");
        System.out.println("Konversi km ke m tidak valid: " + konversiInvalid);
    }
}
