public class Urun {
    @Override
    public String toString() {
        return "Urun{" +
                "Ad='" + Ad + '\'' +
                ", Fiyat=" + Fiyat +
                '}';
    }

    private String Ad;
    private double Fiyat;

    public Urun(String ad, double fiyat) {
        Ad = ad;
        Fiyat = fiyat;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public double getFiyat() {
        return Fiyat;
    }

    public void setFiyat(double fiyat) {
        Fiyat = fiyat;
    }

}
