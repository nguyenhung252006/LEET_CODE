/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function (x) {
    if (x < 2) {
        return x;
    }
    var l = 1;
    var r = Math.floor(x / 2);
    while (l <= r) {
        var m = Math.floor((r + l) / 2);
        if (m * m == x) {
            return Math.floor(m);
        }
        else if (m * m < x) {
            l = m + 1;
        }
        else {
            r = m - 1;
        }

    }
    return r;
};