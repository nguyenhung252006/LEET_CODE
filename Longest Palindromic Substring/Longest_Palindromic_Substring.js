/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    function check(i,j,s) {
        var l = i; 
        var r = j;
        while (l >= 0 && r < s.length && s[l] == s[r]) {
            l -= 1;
            r += 1;
        }
        return s.substring(l+1,r);
    }
    var result = "";
    for (var i = 0; i < s.length; i++) {
        var old = check(i,i,s);
        var after = check(i,i+1,s);
        if (old.length > result.length) {
            result = old;
        }
        if (after.length > result.length) {
            result = after;
        }
    }
    return result;
};