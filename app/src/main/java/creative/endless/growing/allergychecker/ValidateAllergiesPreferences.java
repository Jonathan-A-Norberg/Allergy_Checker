package creative.endless.growing.allergychecker;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * must preserve order. last insert
 * @author Jonathan Alexander Norberg
 * @version 2018-03-23
 */

public class ValidateAllergiesPreferences {
    private static HashMap<Integer, Integer> allergyKey = new HashMap<>();
     private static HashMap<Integer, Integer> keyAllergy = new HashMap<>();


    static HashMap<Integer, Integer> setupAllergy() {
        if(!allergyKey.isEmpty()){
            return allergyKey;
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        allergyKey.put(R.string.abalone, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.acerola, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.almond, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.anchovies, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.anis, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.apple, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.apricot, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.artichoke, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.aspargus, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.avocado, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.bacon, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.banana, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.barley, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.barnacle, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.bass, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.beef, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.bellPepper, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.brazil, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.buckwheat, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.butter, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.cabbage, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.carrot, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.casein, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.catfish, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.caviar, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.celery, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.cherry, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.chicken, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.chickpea, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.choletsorol, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.citrus, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.clams, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.cockle, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.cocoa, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.coconut, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.cod, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.coriander, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.crab, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.crawfish, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.cream, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.cumin, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.custard, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.dairy, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.dandelions, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.demiVegetarian, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.duck, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.durum, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.echinacea, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.egg, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.einkorn, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.emmer, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.english, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.farina, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.farro, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.fennel, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.fig, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.fish, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.flounder, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.fruit, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.garlic, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.gelatin, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.gluten, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.glycerol, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.goat, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.graham, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.grape, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.grapefruit, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.haddock, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.hake, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.halibut, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.halal, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.hazelnut, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.herring, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.hibiscus, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.honey, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.kamut, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.kiwi, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.krill, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lactoOvoVegetarian, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lactoOvoVegetarian, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lactose, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lactoVegetarian, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lamb, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lard, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.legumes, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lemon, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lentil, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lettuce, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lime, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.limpet, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lobster, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lupin, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.lychee, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.macadamia, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.magnesiumStearate, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.mahi, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.maize, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.malt, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.mango, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.meat, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.melon, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.milk, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.monoGlycerides, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.mussels, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.mustardSeed, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.nuts, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.octopus, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.orange, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.oysters, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.parsley, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pea, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.peach, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.peanut, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pear, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pecans, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pepsin, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.perch, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.periwinkle, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.persimmon, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pig, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pike, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pili, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pinapple, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pine, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pistachios, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pollock, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.polloVegetarian, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pomegranate, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.poppySeed, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.potato, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.poultry, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.prune, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pumpkin, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pumpkinSeed, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.ragweed, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.rye, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.salmon, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.sausage, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.scallops, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.scampi, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.seeds, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.semolina, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.sesame, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.shellfish, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.shrimp, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.snails, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.snapper, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.sole, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.soy, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.soybean, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.spelt, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.spice, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.strawberry, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.sunflowerSeed, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.surimi, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.swordfish, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.tiger, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.tilapia, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.tomato, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.triticale, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.trout, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.tuna, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.urchin, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.walnuts, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.veal, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.vegan, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.vegetables, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.vegetarian, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.wheat, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.whelk, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.yoghurt, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.zucchini, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.date, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.nightshade, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.aubergine, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.solanum, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.physalis, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pepino, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.naranjilla, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.chineseLantern, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.tamarillo, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.peppers, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.cayenne, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.jalapeño, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.birdsEyeChili, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.capsicum, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.madameJeanette, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.newMexicochile, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.cashew, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.panulirus, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.mollusc, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.ormer, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.cellena, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.trueLimpets, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.winkle, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.conchs, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.rockSnail, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.buccinidae, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.chiton, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.mactridae, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.pharidae, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.donacidae, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.crustaceans, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.onion, atomicInteger.addAndGet(1));
        allergyKey.put(R.string.oat, atomicInteger.addAndGet(1));
        return allergyKey;
    }

    static HashMap<Integer, Integer> setupKey() {
        if(!keyAllergy.isEmpty()){
            return keyAllergy;
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.abalone);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.acerola);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.almond);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.anchovies);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.anis);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.apple);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.apricot);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.artichoke);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.aspargus);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.avocado);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.bacon);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.banana);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.barley);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.barnacle);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.bass);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.beef);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.bellPepper);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.brazil);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.buckwheat);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.butter);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.cabbage);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.carrot);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.casein);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.catfish);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.caviar);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.celery);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.cherry);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.chicken);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.chickpea);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.choletsorol);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.citrus);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.clams);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.cockle);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.cocoa);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.coconut);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.cod);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.coriander);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.crab);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.crawfish);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.cream);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.cumin);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.custard);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.dairy);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.dandelions);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.demiVegetarian);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.duck);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.durum);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.echinacea);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.egg);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.einkorn);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.emmer);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.english);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.farina);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.farro);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.fennel);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.fig);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.fish);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.flounder);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.fruit);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.garlic);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.gelatin);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.gluten);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.glycerol);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.goat);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.graham);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.grape);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.grapefruit);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.haddock);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.hake);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.halibut);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.halal);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.hazelnut);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.herring);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.hibiscus);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.honey);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.kamut);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.kiwi);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.krill);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lactoOvoVegetarian);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lactoOvoVegetarian);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lactose);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lactoVegetarian);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lamb);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lard);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.legumes);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lemon);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lentil);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lettuce);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lime);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.limpet);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lobster);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lupin);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.lychee);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.macadamia);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.magnesiumStearate);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.mahi);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.maize);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.malt);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.mango);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.meat);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.melon);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.milk);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.monoGlycerides);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.mussels);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.mustardSeed);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.nuts);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.octopus);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.orange);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.oysters);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.parsley);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pea);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.peach);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.peanut);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pear);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pecans);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pepsin);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.perch);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.periwinkle);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.persimmon);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pig);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pike);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pili);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pinapple);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pine);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pistachios);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pollock);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.polloVegetarian);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pomegranate);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.poppySeed);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.potato);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.poultry);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.prune);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pumpkin);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.pumpkinSeed);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.ragweed);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.rye);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.salmon);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.sausage);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.scallops);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.scampi);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.seeds);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.semolina);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.sesame);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.shellfish);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.shrimp);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.snails);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.snapper);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.sole);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.soy);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.soybean);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.spelt);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.spice);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.strawberry);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.sunflowerSeed);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.surimi);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.swordfish);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.tiger);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.tilapia);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.tomato);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.triticale);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.trout);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.tuna);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.urchin);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.walnuts);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.veal);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.vegan);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.vegetables);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.vegetarian);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.wheat);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.whelk);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.yoghurt);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.zucchini);
        keyAllergy.put(atomicInteger.addAndGet(1),R.string.date);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.nightshade);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.aubergine);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.solanum);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.physalis);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.pepino);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.naranjilla);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.chineseLantern);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.tamarillo);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.peppers);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.cayenne);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.jalapeño);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.birdsEyeChili);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.capsicum);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.madameJeanette);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.newMexicochile);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.cashew);

        keyAllergy.put(atomicInteger.addAndGet(1), R.string.panulirus);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.mollusc);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.ormer);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.cellena);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.trueLimpets);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.winkle);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.conchs);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.rockSnail);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.buccinidae);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.chiton);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.mactridae);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.pharidae);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.donacidae);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.crustaceans);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.onion);
        keyAllergy.put(atomicInteger.addAndGet(1), R.string.oat);
        return keyAllergy;
    }

}
