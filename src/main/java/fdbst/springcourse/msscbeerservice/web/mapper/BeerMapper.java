package fdbst.springcourse.msscbeerservice.web.mapper;

import fdbst.springcourse.msscbeerservice.domain.Beer;
import fdbst.springcourse.msscbeerservice.web.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * Interface BeerMapper
 * 
 * Essa interface ...
 *
 * @author Felipe Di Bernardi S Thiago
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDTO beerTOBeerDTO(Beer beer);

    Beer beerDTOTOBeer(BeerDTO beerDTO);


}
