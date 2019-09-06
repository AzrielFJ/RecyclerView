package com.example.myrecyleview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailTempatUmum extends AppCompatActivity {
    public static int[] gambar = {
            R.drawable.rmhskt, R.drawable.msm, R.drawable.sklh, R.drawable.kntrpls, R.drawable.kntrpos,R.drawable.kmps,R.drawable.prps,R.drawable.psr,

    };

    private static String[] namaTempat={
            "Rumah Sakit",
            "Museum",
            "Sekolah",
            "Kantor Polisi",
            "Kantor Pos",
            "Kampus",
            "Perpustakaan",
            "Pasar"

    };	public static String pnjlsn []  ={
            "Rumah sakit adalah sebuah institusi perawatan kesehatan profesional yang pelayanannya disediakan oleh dokter, perawat, dan tenaga ahli kesehatan lainnya."
            ,"Museum adalah institusi permanen, nirlaba, melayani kebutuhan publik, dengan sifat terbuka, dengan cara melakukan usaha pengoleksian, mengkonservasi, meriset, mengomunikasikan, dan memamerkan benda nyata kepada masyarakat untuk kebutuhan studi, pendidikan, dan kesenangan."
            ,"Sekolah adalah tempat didikan bagi anak anak. tujuan dari sekolah adalah mengajar tentang mengajarkan anak untuk menjadi anak yang mampu memajukan bangsa . Sekolah adalah sebuah lembaga yang dirancang untuk pengajaran siswa / murid di bawah pengawasan guru.",
            "Kantor polisi adalah tempat dimana kita dapat melaporkan suatu kejadian kehilangan ataupun tindakan kriminal yang ada di sekitar kita. Kantor Polisi di gunakan untuk memproses laporan atau pengaduan dari masyarakat mengenai Tindak kejahatan.Selain untuk memproses laporan dari masyarakat, Kantor Polisi juga digunakan oleh polisi sebagai tempat untuk melayani masyarakat yang ingin membuat Surat Izin mengemudi dan surat Keterangan catatan kepolisian. kantor polisi juga digunakan sebagai tempat para polisi berkumpul dan tempat mereka berlatih untuk meningkatkan kemampuan mereka."
            ,"Kantor pos adalah fasilitas fisik tidak bergerak untuk melayani penerimaan, pengumpulan, penyortiran, transmisi, dan pengantaran surat dan paket pos. Kantor pos menjual benda-benda pos dan filateli, seperti prangko, kartu pos, amplop, dan perlengkapan untuk membungkus paket. Di beberapa negara, kantor pos berfungsi sebagai tempat penerimaan aplikasi paspor, pengiriman wesel pos atau money order, penjualan asuransi, pemesanan barang, serta layanan giropos dan perbankan."
            ,"Kampus adalah sebuah kompleks atau daerah tertutup yang merupakan kumpulan gedung-gedung universitas atau perguruan tinggi. Bisa pula berarti sebuah cabang daripada universitas sendiri."
            ,"Perpustakaan adalah sebuah koleksi buku dan majalah. Walaupun dapat diartikan sebagai koleksi pribadi perseorangan, namun perpustakaan lebih umum dikenal sebagai sebuah koleksi besar yang dibiayai dan dioperasikan oleh sebuah kota atau institusi, serta dimanfaatkan oleh masyarakat yang rata-rata tidak mampu membeli sekian banyak buku atas biaya sendiri."
            ,"Pasar adalah salah satu dari berbagai sistem, institusi, prosedur, hubungan sosial dan infrastruktur di mana usaha menjual barang, jasa dan tenaga kerja untuk orang-orang dengan imbalan uang. Barang dan jasa yang dijual menggunakan alat pembayaran yang sah seperti uang fiat. Kegiatan ini merupakan bagian dari perekonomian."
    } ;



    public String namatempat(int imId){
        String namatempat = namaTempat[imId];
        return namatempat;
    }
    public String penjelasan(int imId){
        String penjelasan = pnjlsn[imId];
        return penjelasan;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_tempat_umum);
        ImageView iv = (ImageView) findViewById(R.id.singleimage);
        int imId = this.getIntent().getExtras().getInt("position");
        int image = DetailTempatUmum.gambar[imId];
        iv.setImageResource(image);

        String text=DetailTempatUmum.pnjlsn[imId];
        TextView sinopsis= findViewById(R.id.penjelasan);
        sinopsis.setMovementMethod(new ScrollingMovementMethod());
        sinopsis.setText(text);


    }   public static Intent getActIntent(Activity activity){
        return new Intent(activity, DetailTempatUmum.class);
    }


}
