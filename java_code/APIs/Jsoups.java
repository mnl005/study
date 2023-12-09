package APIs;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// Jsoup로 HTML문서 파싱해서 데이터 추출 가능

public class Jsoups {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://en.wikipedia.org/").get();

            System.out.println("가져올 문서 타입 : " + doc.documentType());

            Elements newsHeadlines = doc.select("#mp-itn b a");
            System.out.println(newsHeadlines);

            for (Element headline : newsHeadlines) {
                System.out.println("제목 : " + headline.attr("title"));
                System.out.println("링크 : " + headline.absUrl("href"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
