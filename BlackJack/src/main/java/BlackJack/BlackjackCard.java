package BlackJack;

import CardGames.Card;

public class BlackjackCard extends Card {

    public BlackjackCard(int number, int suit) {
        super(number, suit);
        if(value < 10) value = number;
        else value = 10;
    }
}
