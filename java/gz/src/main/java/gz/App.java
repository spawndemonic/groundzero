package gz;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
//this is what the class name of the feedd is.
// class="rpBJOHq2PR60pnwJlUyP0" 
//for the item itself, each article has its own class but it's two words
//example:class="_1poyrkZ7g36PawDueRza-J _2uazWzYzM0Qndpz5tFu3EX"
// after looking at another item/article 
//example:class="_1poyrkZ7g36PawDueRza-J _11R7M_VOgKO1RJyRSRErT3 "
// the first part of the classs name doesn't change but the second part does for each article.
//article are in <article></article>
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Document d = Jsoup.connect("https://duckduckgo.com/?t=ffab&q=witchcraft&atb=v229-5rk&ia=web").get();
        Elements ele = d.select("div#links");
        for(Element element : ele.select("div.result"))
        {
            String title= element.select("dev.result__title a.result__a").text();
            System.out.println(title);
        }
    }
}
