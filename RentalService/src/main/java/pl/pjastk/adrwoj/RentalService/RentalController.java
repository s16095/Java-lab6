package pl.pjastk.adrwoj.RentalService;

import org.springframework.web.bind.annotation.*;
import pl.pjastk.adrwoj.RentalService.Movie;
import pl.pjastk.adrwoj.RentalService.RentalService;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/movies")
public class RentalController {

    private final RentalService rentalService;

    public RentalController(RentalService rentalService){
        this.rentalService = rentalService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable("id") Long id){
        return ResponseEntity.ok(rentalService.getMovie(id));
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> availability(@PathVariable("id") Long id) {
        rentalService.availability(id);
        return ResponseEntity.ok().build();
    }
}

