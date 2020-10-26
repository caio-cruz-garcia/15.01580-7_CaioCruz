package teoria.modelsgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PicturePokerDeck {
    private List<PicturePokerCard> decklist;

    public PicturePokerDeck() {
        this.decklist = createNewDeck();
    }

    private List<PicturePokerCard> createNewDeck(){
        List<PicturePokerCard> newDeck = new ArrayList<>();
        for (PicturePokerCardValues value: PicturePokerCardValues.values()) {
            for(int myID = 1; myID<=5; myID++)
                newDeck.add(new PicturePokerCard(value, myID));
        }

        return newDeck;
    }


    public List<PicturePokerCard> getDecklist() {
        return decklist;
    }

    public PicturePokerCard getRamdonCard() {
        return decklist.remove(new Random().nextInt(decklist.size()));
    }
}
