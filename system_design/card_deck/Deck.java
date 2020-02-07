package system_design.card_deck;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cardDeck;
    private final int MAXIMUM_FACE_VALUE = 13;

    public Deck() {
        this.cardDeck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (int faceValue = 1; faceValue <= MAXIMUM_FACE_VALUE; faceValue++) {
                this.cardDeck.add(new Card(faceValue, suit));
            }
        }
    }

    public List<Card> getCardDeck() {
        return cardDeck;
    }

    public void setCardDeck(List<Card> cardDeck) {
        this.cardDeck = cardDeck;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int N = cardDeck.size();
        for (int i = 0; i < N; i++) {
            builder.append(cardDeck.get(i).toString());
            if (i < N - 1 && i % MAXIMUM_FACE_VALUE != 0)
                builder.append(" ");
            if ((i + 1) % MAXIMUM_FACE_VALUE == 0)
                builder.append("\n");
        }
        return builder.toString();
    }

}