package fdbst.springcourse.msscbeerservice.repositories;

/**
 * Interface BeerRepository
 * <p>
 * Essa intereface é responsável por...
 *
 * @author Felipe Di Bernardi S Thiago
 */

import fdbst.springcourse.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
