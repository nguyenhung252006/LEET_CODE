/**
 * @param {number} n
 * @return {number}
 */
var totalMoney = function (n) {
    var week = Math.floor(n / 7);
    var days = n % 7;
    var total = Number(0);

    total += 28 * week + 7 * (week * (week - 1) / 2);

    var startDay = week + 1;

    for (var i = 0; i < days; i++) {
        total += startDay + i;
    }

    return total;
};