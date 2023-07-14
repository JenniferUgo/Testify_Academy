//Create a function that filters out negative numbers

function filterNegativeNumbers(arr) {
    return arr.filter(function(num) {
      return num >= 0;
    });
  }

var numbers = [1, - 20, -2, 3, -4, 5, -6, 0, -15];
var filteredNumbers = filterNegativeNumbers(numbers);
console.log(filteredNumbers);  
