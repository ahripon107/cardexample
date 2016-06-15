package com.therap.amin.demorecyclerview;

/**
 * Created by amin on 6/15/16.
 */
public class Data {

    private String textView;
    private String buttonText;

    public Data(String textView, String buttonText) {
        this.textView = textView;
        this.buttonText = buttonText;
    }

    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    @Override
    public String toString() {
        return "Data{" +
                "textView='" + textView + '\'' +
                ", buttonText='" + buttonText + '\'' +
                '}';
    }
}
