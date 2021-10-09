public class Siparis {
    private Urun urun;
    private int Adet;

    public Siparis(Urun urun, int adet) {
        this.urun = urun;
        Adet = adet;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public int getAdet() {
        return Adet;
    }

    public void setAdet(int adet) {
        Adet = adet;
    }
    public double Tutar(){
        return urun.getFiyat()*getAdet();
    }

    @Override
    public String toString() {
        return "Siparis{" +
                "urun=" + urun +
                ", Adet=" + Adet +
                '}';
    }
}
