package Book.values;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;

public class Kind {
	JsonNode js;

	public Kind(JsonNode json) {

		this.js = json;
	}

	public String kindData() throws IOException {

		String kind = js.get("kind").asText().toString();
		return kind;

	}

}
