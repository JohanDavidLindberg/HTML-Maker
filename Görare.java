package HTML_Maker;
import java.io.*;

public class Görare{
    FileWriter skrivare;
    File fil;

    public Görare(FileWriter skrivare, File fil) {
        this.skrivare = skrivare;
        this.fil = fil;
    }

    public void div(Object o) throws IOException {
        skrivare.append("<div>" + o + "</div>");
    }
    public void div() throws IOException {
        skrivare.append("<div></div>");
    }
    public void close(){
        skrivare.close();
    }
    




}