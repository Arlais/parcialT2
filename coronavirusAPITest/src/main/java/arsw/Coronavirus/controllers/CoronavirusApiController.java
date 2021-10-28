package arsw.Coronavirus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mashape.unirest.http.JsonNode;

import arsw.Coronavirus.services.CoronavirusServices;

@RestController
@RequestMapping(value = "/coronavirus")
public class CoronavirusApiController {

	@Autowired
    CoronavirusServices cs= null;

	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> GetAllData(){
		return new ResponseEntity<String>(cs.GetAllData().getBody().toString(),HttpStatus.ACCEPTED) ;
    }
	
	@RequestMapping("/{country}")
	public ResponseEntity<?> GetDatabyCountry(){
		return new ResponseEntity<String>(cs.GetDatabyCountry().getBody().toString(),HttpStatus.ACCEPTED) ;
    }
}
