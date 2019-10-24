package com.example.myfavplayer;

import java.util.ArrayList;

public class Data_Players {
    private static String[] PlayersName = {
            "Kuroky",
            "Miracle-",
            "GH",
            "Ana",
            "Topson",
            "Puppey",
            "inYourdreaM",
            "Somnus`m",
            "Dendi",
            "MidONe"
    } ;

    private static String[] PlayersDetail = {
            "Kuro Salehi Takhasomi berasal dari jerman dan lahir pada 28 oktober 1992 (26 tahun), sekarang masih aktif bermain dengan role support dan kapten",
            "Amer Al-Barkawi berasal dari Jordan dan lahir pada 20 juni 1997 (22 tahun), masih aktif sebagai pemain dota dengan role carry dan solo mid",
            "Maroun Merhej berasal dari Lebanon dan lahir pada 17 juni 1995 (24 tahun), merupakan pemain pos 4 yang luarbiasa",
            "Anathan Pham berasal dari australia dan lahir pada 26 oktober 1999 (19 tahun), ia telah dua kali menjadi champion pada TI(Tournament International) bersama tim nya OG",
            "Topias Miikka Taavitsainen berasal dari Finland dan lahir pada 14 april 1998 (21 tahun), merupakan pemain yang sangat luarbiasa karena baru 2 tahun karir nya sebagai pemain dota profesional ia telah menjadi champion TI 2 kali bersama tim nya OG",
            "Clement Ivanov berasal dari Estonia dan lahir pada 6 maret 1990 (29 tahun), salah seorang legenda dota2 dan seorang pemain suppor dan kapten yang sangat luarbiasa",
            "Muhammad Rizky berasal dari Indonesia dan lahir pada 6 oktober 1997 (21 tahun), merupakan pemain dota2 Indonesia terhebat saat ini dan saat ini bergabung dalam Tim BOOM Esport",
            "Lu Yao berasal dari China dan lahir pada 16 desember 1995 (23 tahun), merupakan salah satu pemain dota2 terkuat di cina saat ini. Ia merupakan pemain midlaner hebat",
            "Danil Ishutin berasal dari Ukraina dan lahir pada 30 desember 1989 (29 tahun), ia seorang legenda di dalam dota2 juga orang pertama yang menjadi champion bersama timnya Natus Vincere (NaVi)",
            "Yeik Nai Zheng berasal dari Malaysia dan lahir pada 3 juni 1996 (23 tahun), seorang midlaner handal seperti namanya dalam game, sekarang aktif sebagai midlaner bagi Team Secret"
    };

    private static int[] PlayersImg = {
            R.drawable.kuroky,
            R.drawable.miracul,
            R.drawable.gh,
            R.drawable.anathan,
            R.drawable.topson,
            R.drawable.puppey,
            R.drawable.iyd,
            R.drawable.maybe,
            R.drawable.dendi,
            R.drawable.midone
    };

    static ArrayList<Players> getData(){
        ArrayList<Players> list = new ArrayList<>();
            for (int position = 0; position< PlayersName.length;position++){
                    Players players = new Players();
                    players.setName(PlayersName[position]);
                    players.setDetail(PlayersDetail[position]);
                    players.setPhoto(PlayersImg[position]);
                    list.add(players);
            }
            return list;
    }
}
