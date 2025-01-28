package com.balram.demo.actions.BB;

import java.util.*;
import java.util.stream.Collectors;

public class Deck {
    private Stack<Card> cards;

    private Deck(Collection<Card> cards) {
        this.cards = new Stack<>();
        this.cards.addAll(cards);
    }

    public static Deck newDeck() {
//        List<Card> cards = Arrays.stream(Suit.values())
//                .flatMap(suit ->
//                        Arrays.stream(Rank.values())
//                                .map(rank -> new Card(rank, suit))
//                ).collect(Collectors.toList());

        List<Card> cards = new ArrayList<>();
        for (Suit value : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card c = new Card(rank, value);
                cards.add(c);
            }
        }

        return new Deck(cards);
    }

    public void shuffle(int times) {
        for (int i = 0; i < times; i++) {
            Collections.shuffle(cards);
        }
    }

    public int countRemainingCards() {
        return cards.size();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Card nextCard() {
        if (isEmpty() == false) {
            return cards.pop();
        } else {
            return null;
        }
    }
}