package com.example.myrecyleview;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myrecyleview.model.TempatUmum;

import java.util.ArrayList;

public class DataTempatUmum{
    public static String detail []  ={
            "Rumah sakit adalah sebuah institusi perawatan kesehatan profesional yang pelayanannya disediakan oleh dokter, perawat, dan tenaga ahli kesehatan lainnya."
            ,"Museum adalah institusi permanen, nirlaba, melayani kebutuhan publik, dengan sifat terbuka, dengan cara melakukan usaha pengoleksian, mengkonservasi, meriset, mengomunikasikan, dan memamerkan benda nyata kepada masyarakat untuk kebutuhan studi, pendidikan, dan kesenangan."
            ,"Sekolah adalah tempat didikan bagi anak anak. tujuan dari sekolah adalah mengajar tentang mengajarkan anak untuk menjadi anak yang mampu memajukan bangsa . Sekolah adalah sebuah lembaga yang dirancang untuk pengajaran siswa / murid di bawah pengawasan guru.",
            "Kantor polisi adalah tempat dimana kita dapat melaporkan suatu kejadian kehilangan ataupun tindakan kriminal yang ada di sekitar kita. Kantor Polisi di gunakan untuk memproses laporan atau pengaduan dari masyarakat mengenai Tindak kejahatan.Selain untuk memproses laporan dari masyarakat, Kantor Polisi juga digunakan oleh polisi sebagai tempat untuk melayani masyarakat yang ingin membuat Surat Izin mengemudi dan surat Keterangan catatan kepolisian. kantor polisi juga digunakan sebagai tempat para polisi berkumpul dan tempat mereka berlatih untuk meningkatkan kemampuan mereka."
            ,"Kantor pos adalah fasilitas fisik tidak bergerak untuk melayani penerimaan, pengumpulan, penyortiran, transmisi, dan pengantaran surat dan paket pos. Kantor pos menjual benda-benda pos dan filateli, seperti prangko, kartu pos, amplop, dan perlengkapan untuk membungkus paket. Di beberapa negara, kantor pos berfungsi sebagai tempat penerimaan aplikasi paspor, pengiriman wesel pos atau money order, penjualan asuransi, pemesanan barang, serta layanan giropos dan perbankan."
            ,"Kampus adalah sebuah kompleks atau daerah tertutup yang merupakan kumpulan gedung-gedung universitas atau perguruan tinggi. Bisa pula berarti sebuah cabang daripada universitas sendiri."
            ,"Perpustakaan adalah sebuah koleksi buku dan majalah. Walaupun dapat diartikan sebagai koleksi pribadi perseorangan, namun perpustakaan lebih umum dikenal sebagai sebuah koleksi besar yang dibiayai dan dioperasikan oleh sebuah kota atau institusi, serta dimanfaatkan oleh masyarakat yang rata-rata tidak mampu membeli sekian banyak buku atas biaya sendiri."
            ,"Pasar adalah salah satu dari berbagai sistem, institusi, prosedur, hubungan sosial dan infrastruktur di mana usaha menjual barang, jasa dan tenaga kerja untuk orang-orang dengan imbalan uang. Barang dan jasa yang dijual menggunakan alat pembayaran yang sah seperti uang fiat. Kegiatan ini merupakan bagian dari perekonomian."
    } ;

    public static int[] gambar = {
            R.drawable.rmhskt1, R.drawable.msm1, R.drawable.sklh1, R.drawable.kntrpls1, R.drawable.kntrpos1,R.drawable.kmps1,R.drawable.prps1,R.drawable.psr1,

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

    };
    static ArrayList<TempatUmum> getListData(){
     ArrayList<TempatUmum>list=new ArrayList<>();
     for(int position =0;position<namaTempat.length;position++){
         TempatUmum tempat=new TempatUmum();
         tempat.setNama(namaTempat[position]);
         tempat.setFoto(gambar[position]);
         tempat.setDetail(detail[position]);
         list.add(tempat);
     }
     return list;
    }

}
