package HTML_Maker;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File fil = new File("index.html");
        fil.delete();
        fil.createNewFile();

        FileWriter skrivare = new FileWriter("index.html", true);

        Görare html = new Görare(skrivare, fil);

        html.start("Johan");
        html.h1("Bästa sidan");
        html.h2("Ålder");
        html.li("18");
        html.p("Johan är född 28 maj 2004 och är därmed 18 ");
        html.divid(html.p("ojsan"), "div1");
        html.slut();

        skrivare.close();


    }
}
