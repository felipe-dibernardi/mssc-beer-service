package fdbst.springcourse.msscbeerservice.service;

import fdbst.springcourse.msscbeerservice.domain.Beer;
import fdbst.springcourse.msscbeerservice.repositories.BeerRepository;
import fdbst.springcourse.msscbeerservice.web.controller.NotFoundException;
import fdbst.springcourse.msscbeerservice.web.mapper.BeerMapper;
import fdbst.springcourse.msscbeerservice.web.model.BeerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Classe BeerServiceImpl
 * <p>
 * Essa classe é responsável por...
 *
 * @author Felipe Di Bernardi S Thiago
 */
@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDTO getBeerById(UUID id) {
        return beerMapper.beerTOBeerDTO(
                beerRepository.findById(id).orElseThrow(NotFoundException::new)
        );
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beer) {
        return beerMapper.beerTOBeerDTO(beerRepository.save(beerMapper.beerDTOTOBeer(beer)));
    }

    @Override
    public BeerDTO updateBeer(UUID id, BeerDTO dto) {
        Beer beer = beerRepository.findById(id).orElseThrow(NotFoundException::new);
        beer.setBeerName(dto.getBeerName());
        beer.setBeerStyle(dto.getBeerStyle().name());
        beer.setPrice(dto.getPrice());
        beer.setUpc(dto.getUpc());

        return beerMapper.beerTOBeerDTO(beerRepository.save(beer));

    }
}
