package sergiowill.api_beer.service;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sergiowill.api_beer.dto.BeerDTO;
import sergiowill.api_beer.exceptions.BeerAlreadyRegisteredException;
import sergiowill.api_beer.exceptions.BeerNotFoundException;
import sergiowill.api_beer.exceptions.BeerStockExceededException;
import sergiowill.api_beer.model.Beer;
import sergiowill.api_beer.repository.BeerRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerServiceImpl implements BeerService{

    private final BeerRepository beerRepository;
    private final ModelMapper modelMapper;

    @Override
    public BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        verifyIfIsAlreadyRegistered(beerDTO.getName());
        Beer beer = modelMapper.map(beerDTO, Beer.class);
        Beer savedBeer = beerRepository.save(beer);
        return modelMapper.map(savedBeer, BeerDTO.class);
    }

    @Override
    public BeerDTO findByName(String name) throws BeerNotFoundException {
        Beer foundBeer = beerRepository.findByName(name)
                .orElseThrow(() -> new BeerNotFoundException(name));
        return modelMapper.map(foundBeer, BeerDTO.class);
    }

    @Override
    public List<BeerDTO> listAll() {
        List<Beer> beers = beerRepository.findAll();
        return beers.stream().map(beer -> modelMapper.map(beer, BeerDTO.class)).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) throws BeerNotFoundException {
        verifyIfExists(id);
        beerRepository.deleteById(id);
    }

    @Override
    public BeerDTO increment(Long id, int quantityToIncrement) throws BeerNotFoundException, BeerStockExceededException {
        Optional<Beer> optBeer = beerRepository.findById(id);
        if(optBeer.isPresent()) {
            Beer beerToIncrementsStock = optBeer.get();
            beerToIncrementsStock.setQuantity(beerToIncrementsStock.getQuantity()+ );
        }
    }

    private void verifyIfIsAlreadyRegistered(String name) throws BeerAlreadyRegisteredException {
        Optional<Beer> optSavedBeer = beerRepository.findByName(name);
        if (optSavedBeer.isPresent()) {
            throw new BeerAlreadyRegisteredException(name);
        }
    }

    private Beer verifyIfExists(Long id) throws BeerNotFoundException {
        return beerRepository.findById(id)
                .orElseThrow(() -> new BeerNotFoundException(id));
    }
}
