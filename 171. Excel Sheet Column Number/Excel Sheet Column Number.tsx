function titleToNumber(columnTitle: string): number {
    let result : number = 0;
    for (let c of columnTitle) {
        result = result * 26 + (c.charCodeAt(0) - 64);
    }
    return result;
};