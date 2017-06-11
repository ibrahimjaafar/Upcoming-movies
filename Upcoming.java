
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Upcoming {
    public static void main(String[] args) throws IOException {
       
        String url = "http://www.imdb.com/movies-coming-soon/?ref_=inth_cs";
        print("Fetching %s...", url);
        String result;
        Document doc = Jsoup.connect(url).get();
   

     
        for(Element row : doc.select("tbody tr")) {

            final String title = row.select(".overview-top h4").text();
          
            result = (title );
            
            System.out.println(result);
            

}
    }

    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width-1) + ".";
        else
            return s;
    }
}
