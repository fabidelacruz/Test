package test.marvel.domain.connector;

import static com.google.common.collect.Maps.newHashMap;
import static java.lang.String.format;
import static org.springframework.http.HttpMethod.GET;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MarvelConnector {

	private static final ParameterizedTypeReference<String> TYPE_REFERENCE = new ParameterizedTypeReference<String>() {
	};

	private static final String URL_PATTERN = "http://gateway.marvel.com/v1/public/%s?ts=1&apikey=c15991866332f7e1584ee997f0d7f277&hash=2d133d60460b838fee36b4b114b577d3";

	private RestTemplate rt = new RestTemplate();

	public Object getCharacters() {
		String url = format(URL_PATTERN, "characters");

		try {
			ResponseEntity<String> response = rt.exchange(url, GET, null, TYPE_REFERENCE, newHashMap());
			return response.getBody();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}