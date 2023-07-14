//Return the number of vowels in a string

function countVowels(str) {
    var vowelCount = 0;
    var vowels = ['a', 'e', 'i', 'o', 'u'];
  
    for (var i = 0; i < str.length; i++) {
      var char = str[i].toLowerCase();
      if (vowels.includes(char)) {
        vowelCount++;
      }
    }
  
    return vowelCount;
  }

// console.log(countVowels("Testify Limited is the best")); 
// console.log(countVowels("Jennifer Ugo"));  
// console.log(countVowels("Software Quality Assurance Engineer"));

var strings = ["Jennifer Ugo", "Software Quality Assurance Engineer", "Testify Limited is the best"];
var vowelCounts = strings.map(countVowels);
console.log(vowelCounts); 
