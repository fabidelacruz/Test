package test.marvel.domain.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.marvel.domain.connector.MarvelConnector;

@Service
public class MarvelService {

	@Autowired
	private MarvelConnector connector;

	public Object get() throws ClientProtocolException, IOException {
		return connector.getCharacters();
	}
}
