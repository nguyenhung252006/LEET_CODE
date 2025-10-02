/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    var i = a.length - 1;
    var j = b.length - 1;
    var sodu = 0;
    var result = [];
    function check (a) {
        if (a == 0) return false;
        return true;
    }
    while ( i>= 0 || j >= 0 || check(sodu)) {
        var tong = sodu;
        if (i >= 0) {
            tong += Number(a[i]);
            i--;
        }
        if (j >= 0) {
            tong += Number(b[j]);
            j--;
        }
        result.push(tong % 2);
        sodu = Math.floor(tong / 2);

    }
    return result.reverse().join("");
};