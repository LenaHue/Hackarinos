package fhdw.me.refu;

public class Information_CardItem {

    private String mTextResource;
    private String mTitleResource;

    public Information_CardItem(String title, String text) {
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
