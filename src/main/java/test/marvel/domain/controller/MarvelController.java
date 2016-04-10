package test.marvel.domain.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import test.marvel.domain.service.MarvelService;

@RestController
public class MarvelController {

	@Autowired
	private MarvelService marvelService;

	@ResponseBody
	@RequestMapping(value = "/char", method = GET, produces = "application/json")
	public Object value() throws ClientProtocolException, IOException {
		return marvelService.get();
	}
}
