// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
    let join1 = array1.join();
    let join2 = array2.join();
    let aux1 = join1[0];
    let aux2 = join2[0];
    
    for (let i = 1; i < join1.length; i++) {
      if (join1[i] !== ',') {
        aux1 += join1[i];
      }
    }
    for (let i = 1; i < join2.length; i++) {
      if (join2[i] !== ',') {
        aux2 += join2[i];
      }
    }
  
    return Number(aux1)+Number(aux2);
  }
  
  /**
   * Checks whether a number is a palindrome.
   *
   * @param {number} value
   * @returns {boolean} whether the number is a palindrome or not
   */
  export function luckyNumber(value) {
    let valueString = String(value);
    let end = valueString.length-1;
    let begin = 0;
    
    while (begin < end) {
      if (valueString[begin] !== valueString[end]) {
        return false;
      }
      end--;
      begin++;
    }
    
    return true;
  }
  
  /**
   * Determines the error message that should be shown to the user
   * for the given input value.
   *
   * @param {string|null|undefined} input
   * @returns {string} error message
   */
  export function errorMessage(input) {
    if (Boolean(input) === false) {
      return "Required field"
    }
    if (Boolean(Number(input)) === false) {
      return "Must be a number besides 0"
    }
    return "";
  }
  