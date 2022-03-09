package sergiowill.api_beer.loader;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import sergiowill.api_beer.dto.BeerDTO;

import static sergiowill.api_beer.FixtureHelper.MAX_RANGE_ID;
import static sergiowill.api_beer.FixtureHelper.MIN_RANGE_ID;
import static sergiowill.api_beer.enums.BeerType.LAGER;
import static sergiowill.api_beer.enums.BeerType.ALE;
import static sergiowill.api_beer.enums.BeerType.IPA;
import static sergiowill.api_beer.enums.BeerType.MALZBIER;
import static sergiowill.api_beer.enums.BeerType.STOUT;
import static sergiowill.api_beer.enums.BeerType.WEISS;
import static sergiowill.api_beer.enums.BeerType.WITBIER;

public class BeerLoader implements TemplateLoader {

    @Override
    public void load(){

        Fixture.of(BeerDTO.class).addTemplate("valid", new Rule() {
            {
                add("id", random(Long.class, range(MIN_RANGE_ID, MAX_RANGE_ID)));
                add("name", random("Lager", "Malzbier", "Witbier", "Weiss", "Ale", "IPA", "Stout"));
                add("brand", random("BeerTest1", "BeerTest2", "BeerTest3", "BeerTest4"));
                add("max", random(Integer.class, range(MIN_RANGE_ID, 50)));
                add("quantity", random(Integer.class, range(MIN_RANGE_ID, 100)));
                add("type", random(LAGER, MALZBIER, WEISS, STOUT, WITBIER, ALE, IPA));
            }
        });
    }
}
