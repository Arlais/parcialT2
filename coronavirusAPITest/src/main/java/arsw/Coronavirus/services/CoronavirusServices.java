package arsw.Coronavirus.services;

import org.springframework.stereotype.Service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Service
public class CoronavirusServices {
	
	public HttpResponse<JsonNode> GetDatabyCountry() {
		
		try {
			HttpResponse<JsonNode> response = Unirest.get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats")
					.header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
					.header("x-rapidapi-key", "673e3e3183mshfcaf071cd2c7662p1f699ajsn9b94fa76f880")
					.asJson();
			return response;
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
public HttpResponse<JsonNode> GetAllData() {
		
		try {
			HttpResponse<JsonNode> response = Unirest.get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/total")
					.header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
					.header("x-rapidapi-key", "673e3e3183mshfcaf071cd2c7662p1f699ajsn9b94fa76f880")
					.asJson();
			return response;
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
}
