/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    var a = String(x);
    var b = String(a.split('').reverse().join(""));
    if (a == b) {
        return true;
    }
    return false;
};