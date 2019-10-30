package com.ivan.bungahias;

import java.util.ArrayList;

public class DataBunga {
    private static String[] bungaNames = {
            "Bunga Anggrek",
            "Bunga Bugenvil",
            "Bunga Iris",
            "Bunga Mawar",
            "Bunga Melati",
            "Bunga Pentas",
            "Bunga Petunia",
            "Bunga Sepatu",
            "Bunga Teratai",
            "Bunga Tulip"

    };

    private static String[] bungaDetails = {
            "Tanaman hias yanng satu ini merupakan satu suku tumbuhan berbunga dengan anggota jenis terbanyak.\n" + "Jenis-jenisnya tersebar luas dari daerah tropika basah hingga wilayah sirkumpolar, meskipun sebagian besar anggotanya ditemukan di daerah tropika.",
            "Bugenvil adalah satu dari sekian macam macam bunga hias populer dengan bentuk serupa pohon kecil yang sukar tumbuh tegak.\n" + "Melihat dari rupa tumbuhannya yang berwarna-warni, bugenvil seolah menjadi tanaman hias yang sangat populer karena kecantikkan warnanya dan cara merawatnya yang mudah.",
            "Macam macam bunga lainnya yang populer adalah iris atau bernama latin Iris Germanica.\n" + "Iris identik dengan warna ungu, mulai dari gelap hingga cerah.",
            "Mawar layak didaulat sebagai bunga yang paling indah dan tak lekang oleh waktu.\n" + "Faktanya nih Sahabat 99, bunga mawar hadir sebagai simbol cinta dan romansa secara mendunia!",
            "Melati adalah salah satu dari macam macam bunga hias yang terdiri dari sekitar 200 spesies tumbuhan asli daerah beriklim tropis dan hangat dari Eurasia, Australasia dan Oseania.\n" + "Hidup menahun, melati dibudidayakan karena warnanya yang putih nan cantik serta harum.",
            "Pentas adalah salah satu dari macam macam bunga yang ditemukan di Afrika Selatan, Komoro, Madagaskar, dan Semenanjung Arab.\n" + "Tanaman memiliki daun hijau berbulu dan kelompok bunga dalam nuansa merah, putih, merah muda, dan ungu.",
            "Petunia berasal dari Amerika Selatan dengan ciri fisik yakni kisaran tinggi 16–30 cm, bunga bermahkota tunggal dan ada pula yang bermahkota ganda.\n" + "Warnanya bervariasi mulai dari merah, putih, kuning pucat, biru, hingga ungu tua.",
            "Kembang sepatu adalah salah satu dari macam macam bunga yang berasal dari Asia Timur.\n" + "Sejak dahulu sampai sekarang, kembang sepatu populer dijadikan sebagai tanaman hias di daerah tropis dan subtropis.\n" + "Ciri khas kembang sepatu adalah bunganya besar, berwarna merah dan tidak berbau.",
            "Teratai tumbuh di permukaan air tenang, dengan bunga dan daun yang terdapat di permukaan air keluar dari tangkai dalam lumpur pada dasar kolam, sungai atau rawa.\n" + "Tangkai terdapat di tengah-tengah daun, dengan daun yang berbentuk bundar lebar yang terpotong pada jari-jari menuju ke tangkai.\n" + "Kebanyakan anggota suku ini hidup sebagai epifit, terutama yang berasal dari daerah tropika.",
            "Mulai ari merah terang dan kuning ke ungu hampir hitam, tulip merona seperti pelangi.\n" + "Bunga yang satu ini menyebar luas mulai dari Benua Afrika, Asia, hingga Eropa.\n" + "Berdasarkan periode, tulip mekar dari musim semi ke awal musim panas.\n" + "Sementara di Indonesia sendiri, tulip dapat mekar sepanjang waktu selama cuaca cerah."

    };

    private static int[] bungaImages = {
            R.drawable.bungaanggrek,
            R.drawable.bungabugenvil,
            R.drawable.bungairis,
            R.drawable.bungamawar,
            R.drawable.bungamelatiputih,
            R.drawable.bungapentas,
            R.drawable.bungapetunia,
            R.drawable.bungasepatumerah,
            R.drawable.bungateratai,
            R.drawable.bungatulip
    };

    private static String[] bungaHarga={
            "Rp. 40.000",
            "Rp. 50.000",
            "Rp. 80.000",
            "Rp. 30.000",
            "Rp. 30.000",
            "Rp. 50.000",
            "Rp. 40.000",
            "Rp. 80.000",
            "Rp. 10.000",
            "Rp. 40.000"
    };

    private static String[] bungaJenis={
            "Bunga Hias",
            "Bunga Hias",
            "Bunga Hias",
            "Bunga Hias",
            "Bunga Hias",
            "Bunga Hias",
            "Bunga Hias",
            "Bunga Hias",
            "Bunga Hias",
            "Bunga Hias"
    };

    static ArrayList<Bungahias> getListData() {
        ArrayList<Bungahias> list = new ArrayList<>();
        for (int position = 0; position < bungaNames.length; position++) {
            Bungahias bungahias = new Bungahias();
            bungahias.setName(bungaNames[position]);
            bungahias.setDetail(bungaDetails[position]);
            bungahias.setPhoto(bungaImages[position]);
            bungahias.setHarga(bungaHarga[position]);
            bungahias.setJenis(bungaJenis[position]);
            list.add(bungahias);
        }
        return list;
    }
}

