// @ts-check

/*
 * Double every card in the deck.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} deck with every card doubled
 */
export function seeingDouble(deck) {
    const newDeck = deck.map((card) => card*2);
    return newDeck;
}
  
/*
*  Creates triplicates of every 3 found in the deck.
*
* @param {number[]} deck
*
* @returns {number[]} deck with triplicate 3s
*/
export function threeOfEachThree(deck) {
    const result = deck.reduce(
      (accumulator, currentValue) => {
        if (currentValue !== 3) {
          accumulator.newDeck.push(currentValue);
        } else {
          accumulator.newDeck.push(currentValue, currentValue, currentValue);
        }
  
        return accumulator;
      },
      {newDeck: []},
    );
  
    return result.newDeck;
}

/*
* Extracts the middle two cards from a deck.
* Assumes a deck is always 10 cards.
*
* @param {number[]} deck of 10 cards
*
* @returns {number[]} deck with only two middle cards
*/
export function middleTwo(deck) {
    let newDeck = deck.slice(4, 6);
  
    return newDeck;
}

/*
* Moves the outside two cards to the middle.
*
* @param {number[]} deck with even number of cards
*
* @returns {number[]} transformed deck
*/

export function sandwichTrick(deck) {
    let edgesDeck = [deck[deck.length-1], deck[0]];
    let removedDeck = deck.slice(1, deck.length-1);
    removedDeck.splice(deck.length/2-1, 0, edgesDeck[0], edgesDeck[1]);
    
    return removedDeck;
}

/*
* Removes every card from the deck except 2s.
*
* @param {number[]} deck
*
* @returns {number[]} deck with only 2s
*/
export function twoIsSpecial(deck) {
    const newDeck = deck.filter((card) => card === 2);
  
    return newDeck;
}

/*
* Returns a perfectly order deck from lowest to highest.
*
* @param {number[]} deck shuffled deck
*
* @returns {number[]} ordered deck
*/
export function perfectlyOrdered(deck) {
    let newDeck = deck;
    newDeck.sort((a, b) => a-b);
  
    return newDeck;
}
  
/*
* Reorders the deck so that the top card ends up at the bottom.
*
* @param {number[]} deck
*
* @returns {number[]} reordered deck
*/
export function reorder(deck) {
    let newDeck = deck.reverse();
    
    return newDeck;
}
  