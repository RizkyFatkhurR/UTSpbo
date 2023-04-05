import java.util.ArrayList;

class Bus {
    private int maxCapacity; // Kapasitas maksimal bus
    private int currentCapacity; // Jumlah penumpang saat ini

    public Bus(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = 0;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void showStatus() {
        System.out.println("-> Jumlah penumpang: " + currentCapacity + " orang");
    }

    public void sampaiDiHalte(Halte porong) {
    }
}

class Halte {
    private String nama; // Nama halte
    private ArrayList<Penumpang> penumpangMenunggu; // Daftar penumpang yang menunggu di halte

    public Halte(String nama) {
        this.nama = nama;
        penumpangMenunggu = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Penumpang> getPenumpangMenunggu() {
        return penumpangMenunggu;
    }

    public void setPenumpangMenunggu(ArrayList<Penumpang> penumpangMenunggu) {
        this.penumpangMenunggu = penumpangMenunggu;
    }

    public void addPenumpang(Penumpang penumpang) {
        penumpangMenunggu.add(penumpang);
    }

    public void removePenumpang(Penumpang penumpang) {
        penumpangMenunggu.remove(penumpang);
    }

    public void showStatus() {
        System.out.println("-> Halte " + nama + " " + penumpangMenunggu.size() + " orang menunggu");
    }

    public String getJumlahPenumpang() {
        return null;
    }
}

class Penumpang {
    private String tujuan; // Tujuan penumpang

    public Penumpang(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
}
public class jadwalbus {
    public static void main(String[] args) {
        // Membuat objek Bus
        Bus bus = new Bus(20);
        bus.setCurrentCapacity(5);

        // Membuat objek Halte
        Halte porong = new Halte("Porong");
        Halte surabaya = new Halte("Surabaya");
        Halte gresik = new Halte("Gresik");

        // Menambahkan penumpang menunggu di halte Porong
        Penumpang penumpang1 = new Penumpang("Surabaya");
        Penumpang penumpang2 = new Penumpang("Gresik");
        porong.addPenumpang(penumpang1);
        porong.addPenumpang(penumpang2);

        // Menampilkan status awal bus dan halte
        System.out.println("-> Bus berangkat dari PULL/Kantor");
        System.out.println("\t-jumlah penumpang : " + bus.getCurrentCapacity() + " orang");
        System.out.println("\t-3 orang turun di halte Porong");
        System.out.println("\t-2 orang turun di halte Gresik");
        System.out.println("--------------------------------");

        // Menampilkan status halte Porong
        System.out.println("-> Halte Porong " + porong.getJumlahPenumpang() + " orang menunggu");

        // Bus sampai di halte Porong
        bus.sampaiDiHalte(porong);

        // Menampilkan status setelah bus sampai di halte Porong
        System.out.println("-> Bus sampai di Halte Porong");
        System.out.println("\t-3 orang turun");
        System.out.println("\t-2 orang naik");
        System.out.println("\t\t*tujuan " + penumpang1.getTujuan());
        System.out.println("\t\t*tujuan " + penumpang2.getTujuan());
        System.out.println("\t-jumlah penumpang : " + bus.getCurrentCapacity() + " orang");

        // Menampilkan status setelah penumpang turun di halte Porong
        System.out.println("-> Halte Porong " + porong.getJumlahPenumpang() + " orang menunggu");
        System.out.println("--------------------------------");

        // Menampilkan status halte Surabaya
        System.out.println("-> Halte Surabaya " + surabaya.getJumlahPenumpang() + " orang menunggu");

        // Bus sampai di halte Surabaya
        bus.sampaiDiHalte(surabaya);

        // Menampilkan status setelah bus sampai di halte Surabaya
        System.out.println("-> Bus sampai di Halte Surabaya");
        System.out.println("\t-1 orang turun");
        System.out.println("\t-5 orang naik");
        System.out.println("\t\t*tujuan " + penumpang1.getTujuan());
        System.out.println("\t-jumlah penumpang : " + bus.getCurrentCapacity() + " orang");

        // Menampilkan status setelah penumpang turun di halte Surabaya
        System.out.println("-> Halte Surabaya " + surabaya.getJumlahPenumpang() + " orang menunggu");
        System.out.println("--------------------------------");
    }
}