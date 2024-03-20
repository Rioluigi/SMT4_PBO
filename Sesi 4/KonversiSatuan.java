class KonversiSatuan {

    public double konversi(double nilai, String satuanAwal, String satuanAkhir) {
        if (satuanAwal.equals("cm") && satuanAkhir.equals("m")) {
            return nilai / 100;
        } else if (satuanAwal.equals("m") && satuanAkhir.equals("cm")) {
            return nilai * 100;
        } else {
            return -1; // Satuan tidak valid
        }
    }
}
