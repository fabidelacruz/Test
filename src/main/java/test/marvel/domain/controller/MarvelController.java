package test.marvel.domain.controller;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import test.marvel.domain.service.MarvelService;

@RestController
public class MarvelController {

	@Autowired
	private MarvelService marvelService;

	@RequestMapping(value = "", method = GET)
	public ModelAndView main() {
		ModelAndView model = new ModelAndView("main.html");
		return model;
	}

	@ResponseBody
	@RequestMapping(value = "/characters", method = GET)
	public ResponseEntity<Object> value() throws ClientProtocolException, IOException {
		return new ResponseEntity<Object>(marvelService.get(), OK);
	}
}
