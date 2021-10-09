public class Test {
    public static void main(String[] args) {
        Kafe kafe = new Kafe();
        Garson mehmetGarson = new Garson("12345678901","Mehmet Sefik",21,130);
        kafe.IseGarsonAl(mehmetGarson);
        kafe.IseGarsonAl(mehmetGarson);
        Urun urun = new Urun("Milkshake",15);
        kafe.UrunEkle(urun);
        kafe.UrunEkle(urun);
        kafe.IseGarsonAl(new Garson("96655941152","Kübra Uyanik",25,130));
        kafe.UrunEkle(new Urun("Türk Kahvesi",9));
        kafe.getGarsonlar().get(0).SiparisAl(new Siparis(kafe.getUrunler().get(0),3));
        kafe.getGarsonlar().get(1).SiparisAl(new Siparis(kafe.getUrunler().get(0),5));
        kafe.getGarsonlar().get(0).SiparisAl(new Siparis(kafe.getUrunler().get(1),1));
        kafe.getGarsonlar().get(1).SiparisAl(new Siparis(kafe.getUrunler().get(1),9));
        kafe.UrunDegistir(kafe.getGarsonlar().get(1).getSiparisler().get(0),new Urun("Kahve",10));
        kafe.MenuListele();
        kafe.TumSiparisleriIlet();
        kafe.GunuKapat();
        kafe.IstenCikar(mehmetGarson);
    }
}
