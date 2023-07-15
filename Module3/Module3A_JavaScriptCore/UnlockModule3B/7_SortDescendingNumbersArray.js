//Sort an array of numbers in descending order

function sortDescending(arr) {
    return arr.sort(function(a, b) {
      return b - a;
    });
  }
  
  var numbers = [1980, 2001, 1759, 1994, 2017];
  var sortedNumbers = sortDescending(numbers);
  console.log(sortedNumbers);  
  
