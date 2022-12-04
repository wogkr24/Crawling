import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

//������� ���� ũ�Ѹ�

public class Crwaling {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://kuryong.co.kr/category/%EC%8B%A4%ED%97%98%EC%8B%A4-%EC%95%88%EC%A0%84%EC%9A%A9%ED%92%88/24/").get(); //��ũ�� ���������� �ٲٱ�
		
			for(int i = 0; i<40; i = i+=1) {
				String ProductInfo = doc.getElementsByClass("description").get(i).text();
				System.out.println(ProductInfo); // ��ǰ��, �ڵ�, ���� �ҷ�����
			}
			for(int i = 0; i<40; i = i+=2) {
				String selectTags = ".prdImg a img";
				Element Imagelink = doc.select(selectTags).get(i);
				System.out.println(Imagelink);
				System.out.println("------------------------------------------------"); //��ǰ�̹��� �ҷ�����
			}

		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
