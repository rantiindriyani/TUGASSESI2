public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHp(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public String getJenisHP () {
        return jenis_hp;
    }

    public int geTahunPembuatan () {
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHp("samsung", 1998);
        System.out.println("jenis hp " + hp.getJenisHP());
        System.out.println("tahun pembuatan hp " + hp.geTahunPembuatan() );
    }

}
