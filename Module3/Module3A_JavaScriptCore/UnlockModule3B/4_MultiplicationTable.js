//Print a table containing multiplication tables

function printMultiplicationTable() {
    for (var i = 1; i <= 10; i++) {
      var row = '';
      for (var j = 1; j <= 10; j++) {
        var product = i * j;
        row += product + '\t';
      }
      console.log(row);
    }
  }

  printMultiplicationTable();

 
  