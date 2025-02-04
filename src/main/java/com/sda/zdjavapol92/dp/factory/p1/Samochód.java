package com.sda.zdjavapol92.dp.factory.p1;

import lombok.Data;

@Data
public class Samochód {
    private String marka;
    private String model;
    private double pojSilnika;
    private double cena;
    private double mocKM;
    private int iloscPoduszekPow;
    private boolean podgrzewaneFotele;
    private String kolor;

    public Samochód(String marka, String model, double pojSilnika, double cena, double mocKM, int iloscPoduszekPow, boolean podgrzewaneFotele, String kolor) {
        this.marka = marka;
        this.model = model;
        this.pojSilnika = pojSilnika;
        this.cena = cena;
        this.mocKM = mocKM;
        this.iloscPoduszekPow = iloscPoduszekPow;
        this.podgrzewaneFotele = podgrzewaneFotele;
        this.kolor = kolor;
    }

    // Tworzymy pewne predefiniowane obiekty
    // Ustaw rozdzielczość ekranu... 3258 x 123901 ?
    // Ustaw kanał audio : stereo / mono + 44100 khz
    // Praktyczne ustawienia/obiekty

    // metoda fabryki poniżej
    public static Samochód stworzLamborghiniAventado(){
        return new Samochód("Lamborghini", "Aventado",
                6.0, 1000000, 400.0, 2, true, "żółty");
    }

//    public static Samochód createSamochód(String marka, String model, double pojSilnika, double cena, double mocKM, int iloscPoduszekPow, boolean podgrzewaneFotele, String kolor) {
//        return new Samochód(marka, model, pojSilnika, cena, mocKM, iloscPoduszekPow, podgrzewaneFotele, kolor);
//    }
}
