/**
 * @param {number[]} coins
 * @param {number} amount
 * @return {number}
 */
//greedy algorithm O(nlogn)
var coinChange = function (coins, amount) {
  coins.sort((a, b) => b - a);

  let count = 0;
  let remainingAmount = amount;

  for (let i = 0; i < coins.length; i++) {
    if (coins[i] <= remainingAmount) {
      let numCoins = Math.floor(remainingAmount / coins[i]);
      count += numCoins;
      remainingAmount -= numCoins * coins[i];
    }
  }

  if (remainingAmount !== 0) {
    return -1;
  }

  return count;
};
