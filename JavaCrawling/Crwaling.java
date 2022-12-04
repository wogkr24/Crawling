import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

//구룡과학 전문 크롤링

public class Crwaling {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://kuryong.co.kr/category/%EC%8B%A4%ED%97%98%EC%8B%A4-%EC%95%88%EC%A0%84%EC%9A%A9%ED%92%88/24/").get(); //링크는 페이지별로 바꾸기
		
			for(int i = 0; i<40; i = i+=1) {
				String ProductInfo = doc.getElementsByClass("description").get(i).text();
				System.out.println(ProductInfo); // 상품명, 코드, 가격 불러오기
			}
			for(int i = 0; i<40; i = i+=2) {
				String selectTags = ".prdImg a img";
				Element Imagelink = doc.select(selectTags).get(i);
				System.out.println(Imagelink);
				System.out.println("------------------------------------------------"); //제품이미지 불러오기
			}

		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
