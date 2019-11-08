package hu.uni.eszterhazy;

import java.time.LocalDate;

public class Cica {

    private String chip;
    private String nev;
    private String gazda_neve;
    private String fajta;
    private LocalDate oltas_ideje;
    private int kor;
    private Nem nem;
    private boolean ivartalanitott;
    private Szin szin;

    // konvertáláshoz ha más formátumból akarnánk pl json-ból
    public Cica() {
    }

    public Cica(String chip, String nev, String gazda_neve, String fajta, LocalDate oltas_ideje, int kor, Nem nem, boolean ivartalanitott, Szin szin) {
        this.chip = chip;
        this.nev = nev;
        this.gazda_neve = gazda_neve;
        this.fajta = fajta;
        this.oltas_ideje = oltas_ideje;
        this.kor = kor;
        this.nem = nem;
        this.ivartalanitott = ivartalanitott;
        this.szin = szin;
    }
}
