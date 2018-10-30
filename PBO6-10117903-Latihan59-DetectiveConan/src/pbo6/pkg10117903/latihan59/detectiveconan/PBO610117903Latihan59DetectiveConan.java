/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan59.detectiveconan;

/**
 *
 * @author yongki
 */
public class PBO610117903Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TokohUtama ut1, ut2, ut3;
        TokohPendukung tp1,tp2,tp3,tp4,tp5,tp6,tp7,tp8,tp9,tp10;
        Anggota a = new Anggota(null);
        a.TampilAnggota();
        System.out.println("");
        System.out.println("================= Tokoh Utama =================");

        ut1 = new TokohUtama("Shinichi Kudo (工藤 新一 Kudō Shinichi)");

        ut1.TampilAnggota();

        ut2 = new TokohUtama("Ran Mouri (毛利 蘭 Mōri Ran)");
        ut2.TampilAnggota();

        ut3 = new TokohUtama("Kogoro Mouri (毛利 小五郎 Mōri Kogorō)");
        ut3.TampilAnggota();
        System.out.println("");
        System.out.println("=============== Tokoh Pendukung ===============");
        tp1 =  new TokohPendukung("Eisuke Hondo (本堂 瑛祐 Hondō Eisuke)");
        tp1.TampilAnggota();
        
        tp2 = new TokohPendukung("Eri Kisaki (妃 英理 Kisaki Eri)");
        tp2.TampilAnggota();
        
        tp3 = new TokohPendukung("Heiji Hattori (服部 平次 Hattori Heiji)");
        tp3.TampilAnggota();
        
        tp4 = new TokohPendukung("Kazuha Toyama (遠山 和葉 Tōyama Kazuha)");
        tp4.TampilAnggota();
        
        tp5 =new TokohPendukung("Kid si Pencuri (怪盗キッド Kaitō Kiddo)");
        tp5.TampilAnggota();
        
        tp6 = new TokohPendukung("Sonoko Suzuki (鈴木 園子 Suzuki Sonoko) ");
        tp6.TampilAnggota();
        
        tp7 = new TokohPendukung("Yusaku Kudo (工藤 優作 Kudō Yusaku)");
        tp7.TampilAnggota();
        
        tp8 = new TokohPendukung("Yukiko Kudo (工藤 有希子 Kudō Yukiko)");
        tp8.TampilAnggota();
        
        tp9 = new TokohPendukung("Masumi Sera (世良 真純 Sera Masumi)");
        tp9.TampilAnggota();
        
        tp10 = new TokohPendukung("Makoto Kyogoku (京極 真 Kyōgoku Makoto)");
        tp10.TampilAnggota();
    }

}
