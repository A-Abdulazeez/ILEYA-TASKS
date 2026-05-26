function mergedArrayOf(firstArray, secondArray) {
    const newArray = [...firstArray, ...secondArray];
    newArray.sort((firstArray, secondArray) => firstArray - secondArray);
    return newArray;
    }
    
let firstArray = [1,2,3]
let secondArray = [4,5,6]

console.log(mergedArrayOf(firstArray, secondArray))
