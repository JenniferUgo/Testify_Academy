const side1 = 5
const side2 = 4
const side3 = 6

if(side1===side2 && side2===side3) {
    console.log('This is an Equilateral Triangle')
} else if(side1===side2 || side1===side3 || side2===side3) {
    console.log('This is an Isosceles Triangle') 
} else {
    console.log('This is a Scalene Triangle')
}