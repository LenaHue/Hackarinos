package fhdw.me.refu;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UnfallschutzPerson {

    //ATTRIBUTE ------------------------------------------------------------------------------------

    public int tag = 0, monat = 0, jahr = 0, alter = 0;

    public String type;                     //Identifizierendes Attribut

    //Angestellter ------------------------------------

    public double angestellterBruttogehalt = 0.0, //Eingabegrößen durch Vermittler
            angestellterNettogehalt = 0.0,
            angestellterErwerbsminderungsrente = 0.0,
            angestellterPrivateVorsorge = 0.0,
            angestellterBUA = 0.0;

    public double angestellterVersorgungsluecke = 0.0, //Rechengrößen
            angestellterVersorgungslueckeERGOU = 0.0,
            angestellterHalbesNetto = 0.0,
            angestellterHalbesNettoERGOU = 0.0;

    //Selbstständiger ---------------------------------

    public double selbststaendigNettoeinnahmen = 0.0,  //Eingabegrößen durch Vermittler
            selbststaendigErwerbsminderungsrente = 0.0,
            selbststaendigPrivateVorsorge = 0.0,
            selbststaendigBUA = 0.0;

    public double selbststaendigVersorgungsluecke = 0.0,  //Rechengrößen
            selbststaendigVersorgungslueckeERGOU = 0.0,
            selbststaendigHalbesNetto = 0.0,
            selbststaendigHalbesNettoERGOU = 0.0;

    //Senior ------------------------------------------

    public double seniorRente = 0.0,  //Eingabegrößen durch Vermittler
            seniorNebenjob = 0.0,
            seniorEinnahmen = 0.0;
    public int seniorAlterStart = 0,
            seniorRenteneintritt = 0;

    public double seniorVersorgungsluecke = 0.0,  //Rechengrößen
            seniorVersorgungslueckeERGOU = 0.0,
            seniorHalbeEinnahmen = 0.0,
            seniorHalbeEinnahmenERGOU = 0.0;

    //Ergebnis ----------------------------------------

    public double Kapitalleistung = 0.0,
            Rentenleistung = 0.0;


    //KONSTRUKTOR ----------------------------------------------------------------------------------


    public UnfallschutzPerson(String mType){
        type = mType;
    }

    //MEHTODEN -------------------------------------------------------------------------------------


    public void berechnen(){
        UnfallschutzBerechnungen berechnungen = new UnfallschutzBerechnungen();
        berechnungen.berechnen(this);
    }


    //GETTER & SETTER ------------------------------------------------------------------------------

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
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getType(){
        return type;
    }

    public double getKapitalleistung() {
        return Kapitalleistung;
    }

    public void setKapitalleistung(double kapitalleistung) {
        Kapitalleistung = kapitalleistung;
    }

    public double getRentenleistung() {
        return Rentenleistung;
    }

    public void setRentenleistung(double rentenleistung) {
        Rentenleistung = rentenleistung;
    }

    //Angestellter -----------------------------------

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

    public double getAngestellterVersorgungsluecke() {
        return angestellterVersorgungsluecke;
    }

    public void setAngestellterVersorgungsluecke(double angestellterVersorgungsluecke) {
        this.angestellterVersorgungsluecke = angestellterVersorgungsluecke;
    }

    public double getAngestellterVersorgungslueckeERGOU() {
        return angestellterVersorgungslueckeERGOU;
    }

    public void setAngestellterVersorgungslueckeERGOU(double angestellterVersorgungslueckeERGOU) {
        this.angestellterVersorgungslueckeERGOU = angestellterVersorgungslueckeERGOU;
    }

    public double getAngestellterHalbesNetto() {
        return angestellterHalbesNetto;
    }

    public void setAngestellterHalbesNetto(double angestellterHalbesNetto) {
        this.angestellterHalbesNetto = angestellterHalbesNetto;
    }

    public double getAngestellterHalbesNettoERGOU() {
        return angestellterHalbesNettoERGOU;
    }

    public void setAngestellterHalbesNettoERGOU(double angestellterHalbesNettoERGOU) {
        this.angestellterHalbesNettoERGOU = angestellterHalbesNettoERGOU;
    }

    //Selbstständiger -------------------------------

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

    public double getSelbststaendigVersorgungsluecke() {
        return selbststaendigVersorgungsluecke;
    }

    public void setSelbststaendigVersorgungsluecke(double selbststaendigVersorgungsluecke) {
        this.selbststaendigVersorgungsluecke = selbststaendigVersorgungsluecke;
    }

    public double getSelbststaendigVersorgungslueckeERGOU() {
        return selbststaendigVersorgungslueckeERGOU;
    }

    public void setSelbststaendigVersorgungslueckeERGOU(double selbststaendigVersorgungslueckeERGOU) {
        this.selbststaendigVersorgungslueckeERGOU = selbststaendigVersorgungslueckeERGOU;
    }

    public double getSelbststaendigHalbesNetto() {
        return selbststaendigHalbesNetto;
    }

    public void setSelbststaendigHalbesNetto(double selbststaendigHalbesNetto) {
        this.selbststaendigHalbesNetto = selbststaendigHalbesNetto;
    }

    public double getSelbststaendigHalbesNettoERGOU() {
        return selbststaendigHalbesNettoERGOU;
    }

    public void setSelbststaendigHalbesNettoERGOU(double selbststaendigHalbesNettoERGOU) {
        this.selbststaendigHalbesNettoERGOU = selbststaendigHalbesNettoERGOU;
    }

    //Senior -----------------------------------------

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

    public int getSeniorAlterStart() {
        return seniorAlterStart;
    }

    public void setSeniorAlterStart(int seniorAlterStart) {
        this.seniorAlterStart = seniorAlterStart;
    }

    public int getSeniorRenteneintritt() {
        return seniorRenteneintritt;
    }

    public void setSeniorRenteneintritt(int seniorRenteneintritt) {
        this.seniorRenteneintritt = seniorRenteneintritt;
    }

    public double getSeniorVersorgungsluecke() {
        return seniorVersorgungsluecke;
    }

    public void setSeniorVersorgungsluecke(double seniorVersorgungsluecke) {
        this.seniorVersorgungsluecke = seniorVersorgungsluecke;
    }

    public double getSeniorVersorgungslueckeERGOU() {
        return seniorVersorgungslueckeERGOU;
    }

    public void setSeniorVersorgungslueckeERGOU(double seniorVersorgungslueckeERGOU) {
        this.seniorVersorgungslueckeERGOU = seniorVersorgungslueckeERGOU;
    }

    public double getSeniorHalbeEinnahmen() {
        return seniorHalbeEinnahmen;
    }

    public void setSeniorHalbeEinnahmen(double seniorHalbeEinnahmen) {
        this.seniorHalbeEinnahmen = seniorHalbeEinnahmen;
    }

    public double getSeniorHalbeEinnahmenERGOU() {
        return seniorHalbeEinnahmenERGOU;
    }

    public void setSeniorHalbeEinnahmenERGOU(double seniorHalbeEinnahmenERGOU) {
        this.seniorHalbeEinnahmenERGOU = seniorHalbeEinnahmenERGOU;
    }
}



