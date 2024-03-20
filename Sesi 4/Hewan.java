class Hewan {

    public void bersuara() {
        System.out.println("Suara hewan");
    }
}

class Anjing extends Hewan {

    @Override
    public void bersuara() {
        System.out.println("Gonggong!");
    }
}

class Kucing extends Hewan {

    @Override
    public void bersuara() {
        System.out.println("Meow!");
    }
}

public class Main {

public static void main(String[] args) {
        Hewan hewan = new Hewan();
        hewan.bersuara(); // Mencetak "Suara hewan"

        Anjing anjing = new Anjing();
        anjing.bersuara(); // Mencetak "Gonggong!"

        Kucing kucing = new Kucing();
        kucing.bersuara(); // Mencetak "
