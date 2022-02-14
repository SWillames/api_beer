package sergiowill.api_beer.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sergiowill.api_beer.dto.BeerDTO;
import sergiowill.api_beer.exceptions.BeerAlreadyRegisteredException;
import sergiowill.api_beer.exceptions.BeerNotFoundException;
import sergiowill.api_beer.exceptions.BeerStockExceededException;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        return null;
    }

    @Override
    public BeerDTO findByName(String name) throws BeerNotFoundException {
        return null;
    }

    @Override
    public List<BeerDTO> listAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) throws BeerNotFoundException {

    }

    @Override
    public BeerDTO increment(Long id, int quantityToIncrement) throws BeerNotFoundException, BeerStockExceededException {
        return null;
    }
}
