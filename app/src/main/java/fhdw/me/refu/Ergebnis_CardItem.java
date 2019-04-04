package fhdw.me.refu;


public class Ergebnis_CardItem {

    private String mTextResource;
    private String mTitleResource;

    public Ergebnis_CardItem(String title, String text) {
        mTitleResource = title;
        mTextResource = text;
    }

    public String getText() {
        return mTextResource;
    }

    public String getTitle() {
        return mTitleResource;
    }

}
