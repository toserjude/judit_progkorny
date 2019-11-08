package hu.uni.eszterhazy.models;

import hu.uni.eszterhazy.exceptions.*;

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

    public Cica(String chip, String nev, String gazda_neve, String fajta, LocalDate oltas_ideje, int kor, Nem nem, boolean ivartalanitott, Szin szin) throws NemJoChipSzam, NemJoNev, NemJoGazdaNev, NemJoDatum, NemJoKor {
        setChip(chip);
        setNev(nev);
        setGazda_neve(gazda_neve);
        this.fajta = fajta;
        setOltas_ideje(oltas_ideje);
        setKor(kor);
        this.nem = nem;
        this.ivartalanitott = ivartalanitott;
        this.szin = szin;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) throws NemJoChipSzam {
        if (!chip.matches("[1-9]\\d{15}")) {
            throw new NemJoChipSzam(chip);
        }
        this.chip = chip;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) throws NemJoNev {
        if (nev.isEmpty()) {
            throw new NemJoNev();
        }
        this.nev = nev;
    }

    public String getGazda_neve() {
        return gazda_neve;
    }

    public void setGazda_neve(String gazda_neve) throws NemJoGazdaNev {
        if (gazda_neve.isEmpty()) {
            throw new NemJoGazdaNev();
        }
        this.gazda_neve = gazda_neve;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public LocalDate getOltas_ideje() {
        return oltas_ideje;
    }

    public void setOltas_ideje(LocalDate oltas_ideje) throws NemJoDatum {
        if (oltas_ideje.isBefore(LocalDate.now().minusYears(kor)) ||
                oltas_ideje.isAfter(LocalDate.now())) {
            throw new NemJoDatum();
        }
        this.oltas_ideje = oltas_ideje;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) throws NemJoKor {
        if (kor < 0 || kor >= 50) {
            throw new NemJoKor();
        } else {
            this.kor = kor;
        }
    }

    public Nem getNem() {
        return nem;
    }

    public void setNem(Nem nem) {
        this.nem = nem;
    }

    public boolean isIvartalanitott() {
        return ivartalanitott;
    }

    public void setIvartalanitott(boolean ivartalanitott) {
        this.ivartalanitott = ivartalanitott;
    }

    public Szin getSzin() {
        return szin;
    }

    public void setSzin(Szin szin) {
        this.szin = szin;
    }
}
