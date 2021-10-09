public class Insan {
    private String TC;

    @Override
    public String toString() {
        return "Insan{" +
                "TC='" + TC + '\'' +
                ", AdSoyad='" + AdSoyad + '\'' +
                ", Yas=" + Yas +
                '}';
    }

    private String AdSoyad;
    private int Yas;

    public Insan(String TC, String adSoyad, int yas) {
        this.TC = TC;
        AdSoyad = adSoyad;
        Yas = yas;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getAdSoyad() {
        return AdSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        AdSoyad = adSoyad;
    }

    public int getYas() {
        return Yas;
    }

    public void setYas(int yas) {
        Yas = yas;
    }

}
