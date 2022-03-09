package sergiowill.api_beer.service;

import sergiowill.api_beer.dto.BeerDTO;
import sergiowill.api_beer.exceptions.BeerAlreadyRegisteredException;
import sergiowill.api_beer.exceptions.BeerNotFoundException;
import sergiowill.api_beer.exceptions.BeerStockExceededException;

import java.util.List;

public interface BeerService {

    public BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException;

    public BeerDTO findByName(String name) throws BeerNotFoundException;

    public List<BeerDTO> listAll();

    public void deleteById(Long id) throws BeerNotFoundException;

    public BeerDTO increment(Long id, int quantityToIncrement) throws BeerNotFoundException, BeerStockExceededException;
}
