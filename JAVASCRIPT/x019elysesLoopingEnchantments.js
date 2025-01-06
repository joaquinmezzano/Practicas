// @ts-check

/*
 * Determine how many cards of a certain type there are in the deck
 *
 * @param {number[]} stack
 * @param {number} card
 *
 * @returns {number} number of cards of a single type there are in the deck
 */
export function cardTypeCheck(stack, card) {
    let sum = 0;
    for (const elem of stack) {
      if (elem === card) {
        sum++
      }
    }
  
    return sum;
}

/*
 * Determine how many cards are odd or even
 *
 * @param {number[]} stack
 * @param {boolean} type the type of value to check for - odd or even
 * @returns {number} number of cards that are either odd or even (depending on `type`)
 */
export function determineOddEvenCards(stack, type) {
    let sum = 0;
    for (const elem of stack) {
      if (type === true && elem%2 === 0) {
        sum++;
      } else if (type === false && elem%2 !== 0) {
        sum++;
      }
    }
  
    return sum;
}
  