package fdbst.springcourse.msscbeerservice.web.controller;

import fdbst.springcourse.msscbeerservice.service.BeerService;
import fdbst.springcourse.msscbeerservice.web.model.BeerDTO;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{id}")
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(beerService.getBeerById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@Valid @RequestBody BeerDTO beer) {
        return new ResponseEntity<>(beerService.saveNewBeer(beer), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateBeer(@PathVariable("id") UUID id, @Valid @RequestBody BeerDTO beer) {
        return new ResponseEntity<>(beerService.updateBeer(id, beer), HttpStatus.NO_CONTENT);
    }

}
