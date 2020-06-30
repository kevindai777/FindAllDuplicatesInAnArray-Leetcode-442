//Objective is to return all of the duplicates in an array.

let nums = [1,3,2,1,3,2,4]


//O(n) solution that uses a hashset

let set = new Set()
let ans = []

for (let num of nums) {
    if (set.has(num)) {
        ans.push(num)
    } else {
        set.add(num)
    }
}

return ans