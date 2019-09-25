package fdbst.springcourse.msscbeerservice.service;

import fdbst.springcourse.msscbeerservice.web.model.BeerDTO;

import java.util.UUID;

/**
 * Interface BeerService
 * <p>
 * Essa intereface é responsável por...
 *
 * @author Felipe Di Bernardi S Thiago
 */
public interface BeerService {
    BeerDTO getBeerById(UUID id);

    BeerDTO saveNewBeer(BeerDTO beer);

    BeerDTO updateBeer(UUID id, BeerDTO beer);
}
