package JAVA;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class x018gottaSnatchEmAll {
    static Set<String> newCollection(List<String> cards) {
        Set<String> res = new HashSet<>(cards);

        return res;
    }

    static boolean addCard(String card, Set<String> collection) {
        if (collection.contains(card)) {
            return false;
        }
        
        collection.add(card);
        return true;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        }
    
        boolean myHasUnique = false;
        for (String card : myCollection) {
            if (!theirCollection.contains(card)) {
                myHasUnique = true;
                break;
            }
        }
        
        boolean theirHasUnique = false;
        for (String card : theirCollection) {
            if (!myCollection.contains(card)) {
                theirHasUnique = true;
                break;
            }
        }
        
        return myHasUnique && theirHasUnique;
    }


    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections == null || collections.isEmpty()) {
            return new HashSet<>();
        }

        Set<String> commons = new HashSet<>(collections.get(0));

        for (Set<String> collection : collections) {
            commons.retainAll(collection);
        }

        return commons;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> res = new HashSet<>();

        for (Set<String> deck: collections) {
            res.addAll(deck);
        }
        
        return res;
    }
}

/*
Your nostalgia for Blorkemon™️ cards is showing no sign of slowing down, you even started collecting them again, and you are getting your friends to join you.

In this exercise, you will use the Set interface to help you manage your collection, since duplicate cards are not important when your goal is to get all existing cards:

1. You just found your old stash of Blorkemon™️ cards! The stash contains a bunch of duplicate cards, so it's time to start a new collection by removing the duplicates.

You really want your friends to join your Blorkemon™️ madness, and the best way is to kickstart their collection by giving them one card.

Implement the newCollection method, which transforms a list of cards into a Set representing your new collection.

2. Once you have a collection, it takes a life of its own and must grow.

Implement the addCard method, which takes a new card and your current set of collected cards. The method should add the new card to the collection if it isn't already present, and should return a boolean indicating whether the collection was updated.

3. You really want your friends to join your Blorkemon™️ madness, so it's time to start trading!

When trading with friends not every trade is worth doing, or can be done at all. You should only trade if both you and your friend have a card the other does not have.

Implement the canTrade method, that takes your current collection and the collection of one of your friends. It should return a boolean indicating whether a trade is possible, following the rules above.

4. You and your Blorkemon™️ enthusiast friends gather and wonder which cards are the most common.

Implement the commonCards method, which takes a list of collections and returns a collection of cards that all collections have.

5. Do you and your friends collectively own all of the Blorkemon™️ cards?

Implement the allCards method, which takes a list of collections and returns a collection of all different cards in all the collections combined.
 */