/**
 * @param {string} columnTitle
 * @return {number}
 */
var titleToNumber = function(columnTitle) {
    let result = 0;
    for (let c of columnTitle) {
        result = result * 26 + (c.charCodeAt(0) - 64);
    }
    return result;
};
