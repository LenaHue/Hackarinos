package fhdw.me.refu;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UnfallschutzBerechnungen {


    public void berechnen(UnfallschutzPerson person){
        if(person.getType().equals("Angestellter")){
            this.angestellterBerechnen(person);
        }
        if(person.getType().equals("Selbst")){
            this.selbstBerechnen(person);
        }
        if(person.getType().equals("Senior")){
            this.seniorBerechnen(person);
        }
    }

    private void angestellterBerechnen(UnfallschutzPerson person){
        person.setAlter(this.alterBerechnen(person.getTag(), person.getMonat(), person.getJahr()));

        person.setAngestellterVersorgungsluecke(
                person.getAngestellterNettogehalt() -
                person.getAngestellterErwerbsminderungsrente() -
                person.getAngestellterPrivateVorsorge() -
                person.getAngestellterBUA()
        );

        person.setAngestellterVersorgungslueckeERGOU(person.getSelbststaendigVersorgungsluecke() / 2);

        person.setAngestellterHalbesNetto(person.getAngestellterNettogehalt() / 2);

        person.setAngestellterHalbesNettoERGOU(person.getAngestellterHalbesNetto() / 2);

        person.setRentenleistung(person.getAngestellterHalbesNettoERGOU() + person.getAngestellterVersorgungslueckeERGOU());

        person.setKapitalleistung( ( ( (78 - person.getAlter()) * person.getAngestellterHalbesNetto() ) * 12 ) / 6 );

    }


    private void selbstBerechnen(UnfallschutzPerson person){
        person.setAlter(this.alterBerechnen(person.getTag(), person.getMonat(), person.getJahr()));

        person.setSelbststaendigVersorgungsluecke(
                person.getSelbststaendigNettoeinnahmen() -
                person.getSelbststaendigErwerbsminderungsrente() -
                person.getSelbststaendigPrivateVorsorge() -
                person.getSelbststaendigBUA()
                );

        person.setSelbststaendigVersorgungslueckeERGOU(person.getSelbststaendigVersorgungsluecke() / 2);

        person.setSelbststaendigHalbesNetto(person.getSelbststaendigNettoeinnahmen() / 2);

        person.setSelbststaendigHalbesNettoERGOU(person.getSelbststaendigHalbesNetto() / 2);

        person.setRentenleistung(person.getSelbststaendigHalbesNettoERGOU() + person.getSelbststaendigVersorgungslueckeERGOU());

        person.setKapitalleistung(( ( (78 - person.getAlter()) * person.getSelbststaendigHalbesNetto() ) * 12 ) / 6);
    }


    private void seniorBerechnen(UnfallschutzPerson person){
        person.setAlter(this.alterBerechnen(person.getTag(), person.getMonat(), person.getJahr()));

        person.setSeniorVersorgungsluecke(person.getSeniorNebenjob());

        person.setSeniorHalbeEinnahmen( ( person.getSeniorEinnahmen() + person.getSeniorRente() + person.getSeniorNebenjob() ) / 2 );

        person.setSeniorVersorgungslueckeERGOU(person.getSeniorVersorgungsluecke() / 2 );

        person.setSeniorHalbeEinnahmenERGOU(person.getSeniorHalbeEinnahmen() / 2);

        person.setRentenleistung(person.getSeniorHalbeEinnahmenERGOU() + person.getSeniorVersorgungslueckeERGOU());

        person.setKapitalleistung( ( ( ( person.getSeniorRenteneintritt() - ( person.getAlter() - person.getSeniorAlterStart() ) ) * person.getSeniorHalbeEinnahmen() ) * 12 ) / 3);

    }

    private int alterBerechnen(int tag, int monat, int jahr) {
        String geburtstagString = tag + "." + monat + "." + jahr;
        DateFormat format = new SimpleDateFormat("DD.MM.yyyy");
        Date geburtstag = new Date();
        try {
            geburtstag = format.parse(geburtstagString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date heute = new Date();
        format.format(heute);

        int alter = heute.getYear() - geburtstag.getYear();
        if (heute.getMonth() < geburtstag.getMonth() && heute.getDay() < geburtstag.getDay()){
            alter--;
        }
        return alter;
    }
}
