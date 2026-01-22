function majorityElement(nums: number[]): number {
    let count : number = 0;
    let num : any = NaN;
    for (let i of nums) {
        if (count == 0) num = i;
        num == i ? count++ : count--;
    }
    return num;
};