package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import net.engineeringdigest.journalApp.cache.AppCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    private static final String api = "https://api.weatherstack.com/current?access_key=API_KEY&query=CITY";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppCache appCache;

    public WeatherResponse getWeather(String city){

        String finalAPI = appCache.APP_CACHE.get("weather_api").replace("<city>",city).replace("<apiKey>",apiKey);
//        String finalAPI = api.replace("CITY",city).replace("API_KEY",apiKey);

//        External post api call

//        String requestBody = "{\n"+
//                " \"userName\":\"Abc\",\n" +
//                " \"password\":\"Abc\"\n" +
//                "}";
//        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody);
//        User user = User.builder().userName("Abc").password("Abc").build();
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.set("Authorization", "Bearer " + finalAPI);
//        HttpEntity<User> requestEntity = new HttpEntity<>(user,httpHeaders);
//        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.POST, requestEntity, WeatherResponse.class);


        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.GET, null, WeatherResponse.class);
        WeatherResponse body = response.getBody();
        return body;
    }
}