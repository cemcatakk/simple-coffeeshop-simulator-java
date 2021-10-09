import java.util.ArrayList;

public class Kafe {
    private ArrayList<Garson> Garsonlar;
    private ArrayList<Siparis> TumSiparisler;
    private ArrayList<Urun> Urunler;

    public Kafe() {
        Garsonlar = new ArrayList<Garson>();
        TumSiparisler = new ArrayList<Siparis>();
        Urunler = new ArrayList<Urun>();
    }

    public ArrayList<Garson> getGarsonlar() {
        return Garsonlar;
    }

    public void setGarsonlar(ArrayList<Garson> garsonlar) {
        Garsonlar = garsonlar;
    }

    public ArrayList<Siparis> getTumSiparisler() {
        return TumSiparisler;
    }

    public void setTumSiparisler(ArrayList<Siparis> tumSiparisler) {
        TumSiparisler = tumSiparisler;
    }
    public ArrayList<Urun> getUrunler() {
        return Urunler;
    }

    public void setUrunler(ArrayList<Urun> urunler) {
        Urunler = urunler;
    }

    public void SiparisleriIlet(Garson garson){
        for (Object garsonSiparis:garson.getSiparisler().toArray()){
            garson.getSiparisler().remove(garsonSiparis);
            TumSiparisler.add((Siparis) garsonSiparis);
        }
        System.out.println(garson.getAdSoyad()+" Adli Garson Siparisleri Iletti.");
    }
    public void TumSiparisleriIlet(){
        for (Garson garson:Garsonlar){
            SiparisleriIlet(garson);
        }
    }
    public void YeniSiparis(Urun urun,int adet,Garson garson){
        garson.SiparisAl(new Siparis(urun,adet));
    }
    public void YeniSiparis(Siparis siparis, Garson garson){
        garson.SiparisAl(siparis);
    }
    public double ToplamGelir(){
        double toplam=0;
        for (Siparis siparis:TumSiparisler){
            toplam+=siparis.Tutar();
        }
        return toplam;
    }
    public double ToplamGider(){
        double toplam=0;
        for (Garson garson:Garsonlar){
            toplam+=garson.getYevmiye();
        }
        return  toplam;
    }
    public int ToplamSiparisSayisi(){
        return TumSiparisler.size();
    }
    public void IseGarsonAl(Garson garson){
        if (getGarsonlar().contains(garson)){
            System.out.println(garson.getAdSoyad()+" adli garson zaten calisiyor.");
        }
        else{
            getGarsonlar().add(garson);
            System.out.println(garson.getAdSoyad()+" Adli Garson "+garson.getYevmiye()+"TL Yevmiye ile ise basladi.");
        }
    }
    public void UrunEkle(Urun urun){
        if (getUrunler().contains(urun)){
            System.out.println(urun.getAd()+" Adli urun zaten var.");
        }
        else{
            getUrunler().add(urun);
            System.out.println(urun.getAd()+" Adli urun eklendi.");
        }
    }
    public void UrunDegistir(Siparis siparis,Urun yeniUrun){
        Siparis tmp = new Siparis(yeniUrun,siparis.getAdet());
        for(Garson garson:Garsonlar){
            if (garson.getSiparisler().contains(siparis)){
                garson.getSiparisler().remove(siparis);
                garson.getSiparisler().add(tmp);
            }
        }
        System.out.println(siparis.getUrun().getAd()+" Adli Urun "+yeniUrun.getAd()+" İle değiştirildi.");
    }
    public void IstenCikar(Garson garson){
        if (getGarsonlar().contains(garson)){
            getGarsonlar().remove(garson);
            System.out.println(garson.getAdSoyad()+" Adli garson isten cikarildi!");
        }
        else System.out.println(garson.getAdSoyad()+" Adli garson burada calismiyor");
    }
    public void GunuKapat(){
        System.out.println("Gün Bitti. İstatistikler Yazdırılıyor...");
        GunlukRapor();
        TumSiparisler=new ArrayList<Siparis>();
        for (Garson garson:Garsonlar){
            garson.setCiro(0);
            garson.setSiparisler(new ArrayList<Siparis>());
        }
        System.out.println("Bilgiler sıfırlandı.");
    }
    public void GunlukRapor(){
        System.out.println("----------------GÜNLÜK RAPOR----------------");
        System.out.println("Çalışan Sayısı: "+getGarsonlar().size());
        System.out.println("Ürün Sayısı: "+getUrunler().size());
        System.out.println("Sipariş Sayısı: "+getTumSiparisler().size());
        System.out.println("Bugün Çalışan Garson Bilgileri: ");
        for (Garson garson:Garsonlar){
            System.out.println(garson.toString());
        }
        System.out.println("Bugün Satılan Siparişler: ");
        for (Siparis siparis:TumSiparisler){
            System.out.println(siparis.toString());
        }
        System.out.println("Toplam Gelir: "+ToplamGelir());
        System.out.println("Toplam Gider(Yövmiyeler): "+ToplamGider());
        System.out.println("Günlük Kar/Zarar: "+(ToplamGelir()-ToplamGider()));
        System.out.println("--------------------------------------------");
    }
    public void MenuListele(){
        System.out.println("---MENUDEKI URUNLER---");
        for (Urun urun:getUrunler()){
            System.out.println(urun.toString());
        }
    }
}
