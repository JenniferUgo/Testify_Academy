//Create a function that reverses an array

function reverseArray(arr) {
    var reversedArr = [];
    for (var i = arr.length - 1; i >= 0; i--) {
      reversedArr.push(arr[i]);
    }
    return reversedArr;
  }

  var array = [5, 4, 3, 2, 1];
var reversedArray = reverseArray(array);
console.log(reversedArray); 
  