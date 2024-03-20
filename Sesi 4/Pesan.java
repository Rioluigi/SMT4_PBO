class Pesan {

    public void cetakPesan(String pesan) {
        System.out.println(pesan);
    }

    public void cetakPesan(String pesan, String pengirim) {
        System.out.println("[" + pengirim + "]: " + pesan);
    }
}
