// <reference path="./global.d.ts" />
// @ts-check

/**
 * Implement the functions needed to solve the exercise here.
 * Do not forget to export them so they are available for the
 * tests. Here an example of the syntax as reminder:
 *
 * export function yourFunction(...) {
 *   ...
 * }
 */

/*
In this exercise, you are going to write some more code related to preparing and cooking your brilliant lasagna from your favorite cookbook.

You have five tasks. The first one is related to the cooking itself, the other four are about the perfect preparation.

1. When you have lasagna in the oven, you want to know whether you can already take it out or not. To make sure the lasagna does not burn in the oven, you usually set a timer. But sometimes you forget about that.

Write a function cookingStatus that accepts the remaining time on the timer in minutes as a parameter. The function has three possible results.

    If the timer shows 0, it should return 'Lasagna is done.'.
    If the timer shows any other number, the result should be 'Not done, please wait.'.
    If the function is called without a timer value, the result should be 'You forgot to set the timer.'.

The timer will never show a value below 0.
*/

export function cookingStatus(leftTime) {
    switch(leftTime) {
        case undefined:
        return "You forgot to set the timer.";
        break;
        case 0:
        return "Lasagna is done.";
        break;
        default:
        return "Not done, please wait.";
        break;
    }
}

/*
2. For the next lasagna that you will prepare, you want to make sure you have enough time reserved so you can enjoy the cooking. You already made a plan with all the layers your lasagna will have. Now you want to estimate how long the preparation will take based on that.

Implement a function preparationTime that accepts an array of layers and the average preparation time per layer in minutes. The function should return the estimate for the total preparation time based on the number of layers. If the function is called without providing the average preparation time, 2 minutes should be assumed instead.
*/

export function preparationTime(layers, timePerLayer) {
    if (timePerLayer === undefined) {
        return 2*layers.length;
    }

    return timePerLayer*layers.length;
}

/*
3. Besides reserving the time, you also want to make sure you have enough sauce and noodles to cook the lasagna of your dreams. For each noodle layer in your lasagna, you will need 50 grams of noodles. For each sauce layer in your lasagna, you will need 0.2 liters of sauce.

Define the function quantities that takes an array of layers as a parameter. The function will then determine the quantity of noodles and sauce needed to make your meal. The result should be returned as an object with keys noodles and sauce.
*/

export function quantities(layers) {
    const amounts = {
        noodles: 0,
        sauce: 0,
    };

    for(let layer of layers) {
        if (layer === 'noodles') {
        amounts.noodles += 50;
        } else if (layer === 'sauce') {
        amounts.sauce += 0.2;
        }
    }

    return amounts;
}

/*
4. A while ago you visited a friend and ate lasagna there. It was amazing and had something special to it. The friend sent you the list of ingredients and told you the last item on the list is the "secret ingredient" that made the meal so special. Now you want to add that secret ingredient to your recipe as well.

Write a function addSecretIngredient that accepts two arrays of ingredients as parameters. The first parameter is the list your friend sent you and the second is the ingredient list for your own recipe. The function should add the last item from your friend's list to the end of your list. The array that represents your recipe should be modified directly and the function should not return anything. However, the first argument should not be modified.
*/

export function addSecretIngredient(friendList, myList) {
    const secretIngredient = friendList[friendList.length-1];
    myList[myList.length] = secretIngredient;
    }

/*
5. The amounts listed in your cookbook only yield enough lasagna for two portions. Since you want to cook for more people next time, you want to calculate the amounts for different numbers of portions.

Implement a function scaleRecipe that takes two parameters.

    A recipe object that holds the amounts needed for 2 portions. The format of the object can be seen in the example below.
    The number of portions you want to cook.

The function should return a recipe object with the amounts needed for the desired number of portions. You want to keep the original recipe though. This means, in this task the recipe argument should not be modified.
*/

export function scaleRecipe(recipe, portions) {
    if (portions === 2) {
        return recipe;
    }

    const scaled = {};
    let scale = 1;

    for (let ingredient in recipe) {
        scale = (recipe[ingredient]/2)*portions;
        scaled[ingredient] = scale;
    }

    return scaled;
}  