import java.util.ArrayList;

public class Garson extends Insan{

    private ArrayList<Siparis> Siparisler;
    private double Ciro;
    private double Yevmiye;
    private int AlinanSiparis;
    public Garson(String TC, String adSoyad, int yas,double Yevmiye) {
        super(TC, adSoyad, yas);
        Siparisler = new ArrayList<Siparis>();
        this.Yevmiye=Yevmiye;
        Ciro = 0;
        AlinanSiparis=0;
    }

    public ArrayList<Siparis> getSiparisler() {
        return Siparisler;
    }

    public void setSiparisler(ArrayList<Siparis> siparisler) {
        Siparisler = siparisler;
    }

    public double getCiro() {
        return Ciro;
    }

    public void setCiro(double ciro) {
        Ciro = ciro;
    }

    public double getYevmiye() {
        return Yevmiye;
    }

    public void setYevmiye(double Yevmiye) {
        Yevmiye = Yevmiye;
    }
    public void SiparisAl(Siparis siparis){
        getSiparisler().add(siparis);
        setCiro(getCiro()+siparis.Tutar());
        System.out.println(getAdSoyad()+" Adli Garson "+siparis.getAdet()+" Adet "+siparis.getUrun().getAd()+" Siparisi Aldi!");
    }
    public double CiroOrtalamasi(){
        return getCiro()/getAlinanSiparis();
    }
    public int AktifSiparisSayisi(){
        return getSiparisler().size();
    }
    public int getAlinanSiparis() {
        return AlinanSiparis;
    }

    public void setAlinanSiparis(int alinanSiparis) {
        AlinanSiparis = alinanSiparis;
    }

    @Override
    public String toString() {
        return "Garson{" +
                ", Yevmiye=" + Yevmiye +
                "} " + super.toString();
    }
}
