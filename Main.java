package HTML_Maker;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File fil = new File("index.html");
        fil.createNewFile();

        FileWriter skrivare = new FileWriter("index.html", true);


        skrivare.append("<div></div>");

        Görare html = new Görare(skrivare, fil);

        html.div("hejsan");

        skrivare.close();
    }
}
