// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Determines how long it takes to prepare a certain juice.
 *
 * @param {string} name
 * @returns {number} time in minutes
 */
export function timeToMixJuice(name) {
    switch(name){
      case 'Pure Strawberry Joy':
        return 0.5;
      case 'Energizer':
        return 1.5;
      case 'Green Garden':
        return 1.5;
      case 'Tropical Island':
        return 3;
      case 'All or Nothing':
        return 5;
      default:
        return 2.5;
    }
   }
   
   /**
    * Calculates the number of limes that need to be cut
    * to reach a certain supply.
    *
    * @param {number} wedgesNeeded
    * @param {string[]} limes
    * @returns {number} number of limes cut
    */
   export function limesToCut(wedgesNeeded, limes) {
     let i = 0;
     let limesCutted = 0;
     let wedgesCollected = 0;
     
     while(wedgesNeeded > wedgesCollected && i < limes.length) {
       if (limes[i] === 'small') {
         wedgesCollected += 6;
       } else if (limes[i] === 'medium') {
         wedgesCollected += 8;
       } else {
         wedgesCollected += 10; 
       }
   
       limesCutted++;
       i++;
     }
   
     return limesCutted;
   }
   
   /**
    * Determines which juices still need to be prepared after the end of the shift.
    *
    * @param {number} timeLeft
    * @param {string[]} orders
    * @returns {string[]} remaining orders after the time is up
    */
   export function remainingOrders(timeLeft, orders) {
     let i = 0;
     let totalTime = 0;
     let noTimeOrders = [];
   
     while (i < orders.length) {
       if (totalTime >= timeLeft) {
         noTimeOrders.push(orders[i]);
       } else {
         let item = orders[i];
         
         switch(item){
          case 'Pure Strawberry Joy':
            totalTime += 0.5;
            break;
          case 'Energizer':
            totalTime += 1.5;
            break;
          case 'Green Garden':
            totalTime += 1.5;
            break;
          case 'Tropical Island':
            totalTime += 3;
            break;
          case 'All or Nothing':
            totalTime += 5;
            break;
          default:
            totalTime += 2.5;
         }
       }
       
       i++;
     }
   
     return noTimeOrders;
   }