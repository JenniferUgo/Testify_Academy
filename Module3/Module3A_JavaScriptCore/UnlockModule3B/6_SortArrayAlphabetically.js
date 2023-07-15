//Sort an array of strings in alphabetical order

function sortAlphabetically(arr) {
    return arr.sort(function(a, b) {
      return a.localeCompare(b);
    });
  }

var strings = ['python', 'ruby', 'java', 'c#', 'javascript'];
var sortedStrings = sortAlphabetically(strings);
console.log(sortedStrings); 
