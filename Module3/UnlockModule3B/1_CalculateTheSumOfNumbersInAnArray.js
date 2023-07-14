function annualSalary(arr) {
    var sum = 0;
    for (var i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  var monthlySalary = [400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400, 400];
var result = annualSalary(monthlySalary);
console.log(result); 
