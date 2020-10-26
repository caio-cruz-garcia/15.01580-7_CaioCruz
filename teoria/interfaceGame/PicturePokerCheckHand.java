package teoria.interfaceGame;

import teoria.modelsgame.PicturePokerCard;
import teoria.modelsgame.PicturePokerHandValues;

import java.util.List;

public interface PicturePokerCheckHand {
    PicturePokerHandValues checkHand(List<PicturePokerCard> cardList);
}
