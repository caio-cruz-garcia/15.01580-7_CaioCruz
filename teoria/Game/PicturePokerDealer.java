package teoria.Game;

import teoria.modelsgame.PicturePokerCard;
import teoria.modelsgame.PicturePokerDeck;

import java.util.ArrayList;
import java.util.List;

public class PicturePokerDealer {
    private String name;
    private PicturePokerDeck deck;

    public PicturePokerDealer(String name) {
        this.name = name;
        this.deck = new PicturePokerDeck();
    }

    public String getName() {
        return name;
    }

    public PicturePokerDeck getDeck() {
        return deck;
    }

    public List<PicturePokerCard> deal(){
        List<PicturePokerCard> newHand = new ArrayList<PicturePokerCard>();
        for (int card = 0; card < 5; card++){
            newHand.add(deck.getRamdonCard());
        }
        return newHand;
    }
}
