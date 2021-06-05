package pl.pjastk.adrwoj.RentalService;

import pl.pjastk.adrwoj.RentalService.Movie;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

@Service
public class RentalService {
    private RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Long id){
        return restTemplate.getForObject("http:/localhost:8080/" +id,Movie.class);
    }

    public void availability(Long id){
        restTemplate.put("http:/localhost:8080/" +id,Void.TYPE);
    }
}
