/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function (haystack, needle) {
    let index = -1;
    const lenCheck = needle.length;
    for (let i = 0; i < haystack.length; i++) {
        if (i + lenCheck > haystack.length) return index;
        if (haystack.substring(i, i + lenCheck) == needle) {
            index = i;
            return index;
        }
        else {
            continue;
        }
    }
    return index;
};