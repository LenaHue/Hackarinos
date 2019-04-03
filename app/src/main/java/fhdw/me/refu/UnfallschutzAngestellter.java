package fhdw.me.refu;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UnfallschutzAngestellter {

    public int tag, monat, jahr;
    public Date geburtstag;

    public double angestellterBruttogehalt, angestellterNettogehalt,
            angestellterErwerbsminderungsrente, angestellterPrivateVorsorge, angestellterBUA;


    public void alterBerechnen() {
        String geburtstagString = tag + "." + monat + "." + jahr;
        DateFormat format = new SimpleDateFormat("DD.MM.yyyy");
        try {
            geburtstag = format.parse(geburtstagString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getMonat() {
        return monat;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
        this.alterBerechnen();
    }

    public double getAngestellterBruttogehalt() {
        return angestellterBruttogehalt;
    }

    public void setAngestellterBruttogehalt(double angestellterBruttogehalt) {
        this.angestellterBruttogehalt = angestellterBruttogehalt;
    }

    public double getAngestellterNettogehalt() {
        return angestellterNettogehalt;
    }

    public void setAngestellterNettogehalt(double angestellterNettogehalt) {
        this.angestellterNettogehalt = angestellterNettogehalt;
    }

    public double getAngestellterErwerbsminderungsrente() {
        return angestellterErwerbsminderungsrente;
    }

    public void setAngestellterErwerbsminderungsrente(double angestellterErwerbsminderungsrente) {
        this.angestellterErwerbsminderungsrente = angestellterErwerbsminderungsrente;
    }

    public double getAngestellterPrivateVorsorge() {
        return angestellterPrivateVorsorge;
    }

    public void setAngestellterPrivateVorsorge(double angestellterPrivateVorsorge) {
        this.angestellterPrivateVorsorge = angestellterPrivateVorsorge;
    }

    public double getAngestellterBUA() {
        return angestellterBUA;
    }

    public void setAngestellterBUA(double angestellterBUA) {
        this.angestellterBUA = angestellterBUA;
    }
}



