package Quiz;

public class PegawaiMain {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Pegawai 1", 6, 1, 100000);
        Pegawai pegawai2 = new Pegawai("Pegawai 2", 3, 3, 400000);
        Pegawai pegawai3 = new Pegawai("Pegawai 3", 8, 2, 600000);

        pegawai1.printData();
        pegawai2.printData();
        pegawai3.printData();

    }
}
