const prompt=require("prompt-sync")();
const arr = [];
const size = prompt("Enter size of array : ");

for (let i = 0; i < size; i++) {
    const element = prompt("Enter element ${i + 1} : ");
    arr.push(element);
}

console.log("Array elements before sort : ", arr);

arr.sort(function(a, b) {
    return b - a;
});

console.log("Array elements after sort : ",arr);
