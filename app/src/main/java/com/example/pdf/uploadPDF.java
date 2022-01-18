package com.example.pdf;

public class uploadPDF {

    public String url;
    public String etext;

    public uploadPDF() {
    }

    public uploadPDF(String url, String etext) {
        this.url = url;
        this.etext = etext;
    }

    public String getUrl() {
        return url;
    }

    public String getEtext() {
        return etext;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setEtext(String etext) {
        this.etext = etext;
    }
}
