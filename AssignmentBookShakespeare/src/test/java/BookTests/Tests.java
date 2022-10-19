package BookTests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;


import Book.values.Kind;

public class Tests extends BaseTest {

	@Test
	public void kindValidationTest() throws IOException, InterruptedException {
		JsonNode js=jsonNodeofUrl();
		
		Kind kind=new Kind(js);
		String kindValue=kind.kindData().toString();
		System.out.println(kindValue);
		Assert.assertEquals(kindValue, "books#volumes");
	}
}
		
/*	@Test
	public void idShakespeareValidationTest() throws IOException, InterruptedException {
		JsonNode js = jsonNodeofUrl();
		Items items = new Items(js);
		JsonNode jsItems = items.itemsData();
		Set<String> itemsIdList = new HashSet<String>();
		if (jsItems.isArray()) {
			for (JsonNode item : jsItems) {
				Id id = new Id(item);
				String idValue = id.idData().toString();
				itemsIdList.add(idValue);
			}
		}
		System.out.println(itemsIdList);

		Set<String> expectedID = new HashSet<String>(
				Arrays.asList("eQtREAAAQBAJ", "jipZDwAAQBAJ", "xlidBgAAQBAJ", "9ywoprpGOBoC", "bgAcDAAAQBAJ",
						"9BjVIpZHKGwC", "qvxwBgAAQBAJ", "7jyDIfY02KEC", "IIMEEAAAQBAJ", "miSeN4lkDbsC"));
		Assert.assertEquals(itemsIdList, expectedID);

	}*/


