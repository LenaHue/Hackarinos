package fhdw.me.refu;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UnfallschutzSenior {

    public int tag, monat, jahr;
    public Date geburtstag;

    public double seniorRente, seniorNebenjob, seniorEinnahmen, seniorAlterStart, seniorRenteneintritt;



    public void alterBerechnen() {
        String geburtstagString = tag + "." + monat + "." + jahr;
        DateFormat format = new SimpleDateFormat("DD.MM.yyyy");
        try {
            geburtstag = format.parse(geburtstagString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public double getSeniorRente() {
        return seniorRente;
    }

    public void setSeniorRente(double seniorRente) {
        this.seniorRente = seniorRente;
    }

    public double getSeniorNebenjob() {
        return seniorNebenjob;
    }

    public void setSeniorNebenjob(double seniorNebenjob) {
        this.seniorNebenjob = seniorNebenjob;
    }

    public double getSeniorEinnahmen() {
        return seniorEinnahmen;
    }

    public void setSeniorEinnahmen(double seniorEinnahmen) {
        this.seniorEinnahmen = seniorEinnahmen;
    }

    public double getSeniorAlterStart() {
        return seniorAlterStart;
    }

    public void setSeniorAlterStart(double seniorAlterStart) {
        this.seniorAlterStart = seniorAlterStart;
    }

    public double getSeniorRenteneintritt() {
        return seniorRenteneintritt;
    }

    public void setSeniorRenteneintritt(double seniorRenteneintritt) {
        this.seniorRenteneintritt = seniorRenteneintritt;
    }
}
