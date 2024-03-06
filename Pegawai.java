package Quiz;

public class Pegawai {

    String nama;
    int masaKerjaThn;
    double jamLembur;
    int gajiPokok;


    public Pegawai(String nama, int masaKerjaThn, double jamLembur, int gajiPokok) {
        this.nama = nama;
        this.masaKerjaThn = masaKerjaThn;
        this.jamLembur = jamLembur;
        this.gajiPokok = gajiPokok;
    }


    public double hitungGajiLembur() {
        double gajiLembur;
        if (masaKerjaThn < 5) {
            gajiLembur = 0.05 * gajiPokok * jamLembur;
        } else {
            gajiLembur = 0.10 * gajiPokok * jamLembur;
        }
        return gajiLembur;
    }
    public double hitungTunjangan() {
        double tunjangan;
        if (masaKerjaThn < 5) {
            tunjangan = 0.25 * gajiPokok;
        } else {
            tunjangan = 0.50 * gajiPokok;
        }
        return tunjangan;
    }

    public double hitungGajiTotal() {
        return gajiPokok + hitungGajiLembur() + hitungTunjangan();
    }


    public void printData() {
        System.out.println("Nama              : " + nama);
        System.out.println("Masa Kerja (tahun): " + masaKerjaThn + " tahun");
        System.out.println("Jam Lembur        : " + jamLembur + " jam");
        System.out.println("Gaji Pokok        : " + gajiPokok);
        System.out.println("Gaji Total        : " + hitungGajiTotal());
        System.out.println("...........................");
    }
}