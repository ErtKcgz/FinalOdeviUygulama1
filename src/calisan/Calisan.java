package calisan;
public class Calisan {
    public static void main(String[] args) {
        bilgilerim ekle= new bilgilerim();
        ekle.setIsim("Ertuğrul");
        ekle.setSoyisim("Kocagöz");
        ekle.setYas(21);
        System.out.println("Adım :"+ekle.getIsim()+"\n Soyadım: "+ekle.getSoyisim()+"\n Yaşım: "+ekle.getYas());
        
    }
    public static class bilgilerim{
        private String isim;
        private String soyisim;
        private int yas;
        
        public String getIsim() {
            return isim;
        }
        public void setIsim(String isim) {
            this.isim = isim;
        }
        public String getSoyisim() {
            return soyisim;
        }
        public void setSoyisim(String soyisim) {
            this.soyisim = soyisim;
        }
        public int getYas() {
            return yas;
        }
        public void setYas(int yas) {
            this.yas = yas;
        }
    }
}
