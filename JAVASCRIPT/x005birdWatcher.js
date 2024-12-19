// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Calculates the total bird count.
 *
 * @param {number[]} birdsPerDay
 * @returns {number} total bird count
 */
export function totalBirdCount(birdsPerDay) {
    let total = 0;
    
    for(let i = 0; i < birdsPerDay.length; i++) {
      total += birdsPerDay[i];
    }
  
    return total;
  }
  
  /**
   * Calculates the total number of birds seen in a specific week.
   *
   * @param {number[]} birdsPerDay
   * @param {number} week
   * @returns {number} birds counted in the given week
   */
  export function birdsInWeek(birdsPerDay, week) {
    let total = 0;
    let daysCounter = 0;
    let actualWeek = 1;
    
    for (let i = 0; i < birdsPerDay.length; i++) {
      if (daysCounter === 7) {
        actualWeek++;
        daysCounter = 0;
      }
      
      if (week === actualWeek) {
        total += birdsPerDay[i]; 
      }
  
      daysCounter++;
    }
  
    return total;
  }
  
  /**
   * Fixes the counting mistake by increasing the bird count
   * by one for every second day.
   *
   * @param {number[]} birdsPerDay
   * @returns {number[]} corrected bird count data
   */
  export function fixBirdCountLog(birdsPerDay) {
    let isPair = true;
    let counter = 0;
    
    for (let i = 0; i < birdsPerDay.length; i++) {
      if (isPair) {
        birdsPerDay[i] = birdsPerDay[i]+1;
      }
  
      counter++;
      isPair = counter%2 === 0;
    }
  
    return birdsPerDay;
  }
  