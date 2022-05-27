package HTML_Maker;

import java.io.*;

public class Görare{
    FileWriter skrivare;
    File fil;

    public Görare(FileWriter skrivare, File fil) {
        this.skrivare = skrivare;
        this.fil = fil;
    }

    public void start(String Titel) throws IOException  {
        skrivare.append("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<meta charset=\"UTF-8\">\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n<title>Document</title>\n</head>\n<body>");
    }
    public void slut() throws IOException  {
        skrivare.append("</body>\n</html>");
    }

    public void div(Object o) throws IOException {
        skrivare.append("\n<div>" + o + "</div>\n");
    }
    public void div() throws IOException {
        skrivare.append("\n<div></div>\n");
    }
    public void divid(Object o, String id) throws IOException {
        skrivare.append("\n<div id=\"" + id + "\">" + o + "</div>\n");
    }
    public void divid(String id) throws IOException {
        skrivare.append("\n<div id=\"" + id + "\"></div>\n");
    }
    public void h1(Object o) throws IOException {
        skrivare.append("\n<h1>" + o + "</h1>\n");
    }
    public void h1() throws IOException {
        skrivare.append("\n<h1></h1>\n");
    }
    public void h2(Object o) throws IOException {
        skrivare.append("\n<h2>" + o + "</h2>\n");
    }
    public void h2() throws IOException {
        skrivare.append("\n<h2></h2>\n");
    }
    public void p(Object o) throws IOException {
        skrivare.append("\n<p>" + o + "</p>\n");
    }
    public void p() throws IOException {
        skrivare.append("\n<p></p>\n");
    }
    public void li(Object o) throws IOException {
        skrivare.append("\n<li>" + o + "</li>\n");
    }
    public void li() throws IOException {
        skrivare.append("\n<li></li>\n");
    }
    public void close(){
        skrivare.close();
    }
    




}