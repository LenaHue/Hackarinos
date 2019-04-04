package fhdw.me.refu;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

public class Information_SwipeData extends AppCompatActivity {

    Context context;
    private ViewPager mViewPager;
    private Information_CardPagerAdapter mCardAdapter;
    private Information_CardShadowTransformer mCardShadowTransformer;

    public Information_SwipeData activity;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_adapter);

        context = this;
        activity = this;

        LayoutInflater inflater = LayoutInflater.from(activity.getApplicationContext());
        View view = inflater.inflate(R.layout.information, null);

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mCardAdapter = new Information_CardPagerAdapter();

        //Informationen
        mCardAdapter.addCardItem(new Information_CardItem("Weniger Barrieren im Leben kosten mehr Geld", "Jahr für Jahr kommt es in Deutschland zu rund 8 Millionen Unfällen. Viele davon gehen für die Betroffenen glimpflich aus. Aber für manche Betroffene ändert sich das Leben plützlich grundlegend:"+
                " Wegen einer dauerhaften Beeinträchtigung müssen sie ihre Wohnsituation und ihre Mobilität ganz neu organisieren. Meist brauchen sie vor allem eine barrierefreie Umgebung - Und die kann teuer werden. Geld, das man nicht unbedingt hat, denn ein längerfristiges Ausscheiden aus dem Beruf bringt auch ein geringeres Einkommen mit sich."));
        mCardAdapter.addCardItem(new Information_CardItem("Teure Umbauten und Anschaffungen", "Die Unabhängigkeit soll auch nach schweren Unfällen erhalten bleiben. Hierfür sind viele Baumaßnahmen und Anschaffungen nötig."+
                " Zum Beispiel: ein behindertengerechtes Auto, Gutachten für eine Fahrerlaubnis für behindertengerechte Fahrzeuge, Umbauten im Wohnbereich."));
        mCardAdapter.addCardItem(new Information_CardItem("Kosten steigen um ca. 50%", "Die Erfahrung zeigt, dass ein barrierefreies Leben etwa 50% teurer ist. Zusätzlich zu den schon genannten Kosten fallen Ausgaben für Arznei- und Hilfsmittel an.+" +
                "Ggf. wird eine Haushaltshilfe benötigt. Auch Reisen und andere Freizeitaktivitäten werden wesentlich teurer."));        mCardAdapter.addCardItem(new Information_CardItem(
                "Kapitalleistung bei Invalidität", "Die Kapitalleistung bei Invalidität hilft bei der einmaligen Anschaffung für einen barrierefreien Neustart nach dem Unfall."+
                " Sie lässt sich nach dem Grad der dauernden Invalidität berechnen und wird bei jedem messbaren Invaliditätsgrad gezahlt."+
                " In Verbindung mit verschiedenen Leistungsmodellen können Sie eine Erhöhung der jeweiligen Auszahlungssumme ab bestimmten Invaliditätsgraden vereinbaren."));
        mCardAdapter.addCardItem(new Information_CardItem("Rentenleistung bei Invalidität", "Die Rentenleistung bei Invalidität hilft, den dauerhaften Mehrbedarf zu finanzieren und die unfallbedingten EInkommensverluste aufzufangen. Sie dient als Einkommensausgleich und zur finanziellen Lebenserleichterung."+
                " Die Leistung wird ab einem Invaliditätsgrad von 50% monatlich und für lebenslang gezahlt. Je nach vereinbartem Leistungsmodell kann eine Zahlung auch bereits ab einem Invaliditätsgrad von 35% erfolgen."));

        //Expertenmeinungen
        mCardAdapter.addCardItem(new Information_CardItem("Expertenmeinung: Jutta Eich (Geschäftsführerin IHR)", "„Wir helfen dabei, die \n" +
                "\n" +
                "private Umgebung nach \n" +
                "\n" +
                "einem folgenschweren \n" +
                "\n" +
                "Unfall bedarfsgerecht zu gestalten. Aus langjähriger Erfahrung \n" +
                "\n" +
                "wissen wir, dass die Kosten dafür etwa beim 1,5-fachen \n" +
                "\n" +
                "der bisherigen Lebenskosten liegen. Eine entsprechende \n" +
                "\n" +
                "Absicherung halten wir für besonders wichtig.“ "));

        mCardAdapter.addCardItem(new Information_CardItem("Expertenmeinung: Frank Sodermanns (Inhaber/Geschäftsführer Reha-Mobilitätszentrum NRW)",
                "„Wir bauen Fahrzeuge \n" +
                "\n" +
                "und liefern Elektrorollstühle \n" +
                "\n" +
                "für Menschen mit \n" +
                "\n" +
                "Behinderung. Aus meiner über 20-jährigen Erfahrung weiß \n" +
                "\n" +
                "ich, dass sich ein Pkw-Umbau durchaus zwischen 2.000 € \n" +
                "\n" +
                "und 80.000 € bewegen kann. Ebenso liegt die Anschaffung \n" +
                "\n" +
                "eines hochwertigen Elektrorollstuhls zwischen 15.000 € \n" +
                "\n" +
                "und 35.000 €.“ "));

        mCardAdapter.addCardItem(new Information_CardItem("Expertenmeinung: Jean-Marc Clément (Stellvertretender Vorsitzender des Deutschen Rollstuhl-Sportverbandes e.V.)",
                "„Wir unterstützen Menschen mit \n" +
                        "\n" +
                        "Mobilitätseinschränkungen, die \n" +
                        "\n" +
                        "einen Rollstuhl nutzen. Besonders \n" +
                        "\n" +
                        "Sport und Bewegung bilden dabei wichtige Bausteine für \n" +
                        "\n" +
                        "ein aktives und selbstbestimmtes Leben. Darum unterstützt \n" +
                        "\n" +
                        "der DRS den Rollstuhlsport mit über 28 Sportarten – vom \n" +
                        "\n" +
                        "Golfen bis zum Tennis. Fast alles ist machbar! Dass der Sport \n" +
                        "\n" +
                        "mit Einschränkungen oftmals mehr kostet als ohne Einschränkung \n" +
                        "\n" +
                        "ist nahe liegend: Längere Anfahrtswege zum \n" +
                        "\n" +
                        "gewünschten Verein oder die Ausrüstung gehen ins Geld. \n" +
                        "\n" +
                        "So kostet ein individueller Sportrollstuhl schnell 4.000 Euro. \n" +
                        "\n" +
                        "Unsere Erfahrung bestätigt die Annahme, dass ein aktives \n" +
                        "\n" +
                        "Leben mit mobilen Einschränkungen in der Regel teurer ist.“  "));

        mCardShadowTransformer = new Information_CardShadowTransformer(mViewPager, mCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);

    }


}
