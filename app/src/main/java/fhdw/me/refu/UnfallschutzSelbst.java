package fhdw.me.refu;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UnfallschutzSelbst {

    public int tag, monat, jahr;
    public Date geburtstag;

    public double selbststaendigNettoeinnahmen, selbststaendigErwerbsminderungsrente, selbststaendigPrivateVorsorge, selbststaendigBUA;


    public void alterBerechnen() {
        String geburtstagString = tag + "." + monat + "." + jahr;
        DateFormat format = new SimpleDateFormat("DD.MM.yyyy");
        try {
            geburtstag = format.parse(geburtstagString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public double getSelbststaendigNettoeinnahmen() {
        return selbststaendigNettoeinnahmen;
    }

    public void setSelbststaendigNettoeinnahmen(double selbststaendigNettoeinnahmen) {
        this.selbststaendigNettoeinnahmen = selbststaendigNettoeinnahmen;
    }

    public double getSelbststaendigErwerbsminderungsrente() {
        return selbststaendigErwerbsminderungsrente;
    }

    public void setSelbststaendigErwerbsminderungsrente(double selbststaendigErwerbsminderungsrente) {
        this.selbststaendigErwerbsminderungsrente = selbststaendigErwerbsminderungsrente;
    }

    public double getSelbststaendigPrivateVorsorge() {
        return selbststaendigPrivateVorsorge;
    }

    public void setSelbststaendigPrivateVorsorge(double selbststaendigPrivateVorsorge) {
        this.selbststaendigPrivateVorsorge = selbststaendigPrivateVorsorge;
    }

    public double getSelbststaendigBUA() {
        return selbststaendigBUA;
    }

    public void setSelbststaendigBUA(double selbststaendigBUA) {
        this.selbststaendigBUA = selbststaendigBUA;
    }
}