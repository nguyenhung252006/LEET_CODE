/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    var arr = {
        "I" : 1,
        "V" : 5,
        "X" : 10,
        "L" : 50,
        "C" : 100,
        "D" : 500,
        "M" : 1000,
    }
    var count = 0;
    var prev = 0;
    for (var i = s.length-1; i>=0; i--) {
        var curr = arr[s[i]];
        if (curr < prev) {
            count -= curr;
        }
        else {
            count += curr;
            prev = curr;
        }
    }
    return count;
};