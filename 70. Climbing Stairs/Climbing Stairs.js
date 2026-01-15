/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function (n) {

    if (n <= 2) return n;
    var list = new Array(n + 1).fill(0);
    list[1] = 1;
    list[2] = 2;
    for (var i = 3; i < n + 1; i++) {
        list[i] = list[i - 1] + list[i - 2];
    }
    return list[n];

};