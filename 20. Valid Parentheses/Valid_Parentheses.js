/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    var stack = [];
    var mapping = {')': '(', '}': '{', ']': '['};
    for (var char of s) {
        if (char in mapping) {
            if (stack) {
                var topElement = stack.pop();
            }
            else topElement = "#";
            if(mapping[char] != topElement) return false;
        }else stack.push(char)
    }
    return stack.length == 0;
};