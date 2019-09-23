package fdbst.springcourse.msscbeerservice.web.controller;

import fdbst.springcourse.msscbeerservice.web.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * Classe BeerController
 * <p>
 * Essa classe é responsável por...
 *
 * @author Felipe Di Bernardi S Thiago
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{id}")
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@Valid @RequestBody BeerDTO beer) {
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateBeer(@PathVariable("id") UUID id, @Valid @RequestBody BeerDTO beer) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
