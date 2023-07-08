/** 
My Personal Library 2

Task

Add a toggleReadingStatus method to your books objects. 

The method should update the value of the reading property of the book object.
*/

const twilightPart1 = {
    title: "Twilight",
    description: "Romantic vampire fantasy story",
    numberOfPages: 500,
    author: "Stephanie Meyer",
    readingStatus: true,
}
//console.log(twilightPart1['title'])

const newMoonPart2 = {
    title: "New Moon",
    description: "Romantic vampire fantasy story",
    numberOfPages: 464,
    author: "Stephanie Meyer",
    readingStatus: true,
    toggleReadingStatus: function(){
        if(newMoonPart2.readingStatus===true) {
            newMoonPart2.readingStatus = false
        } else {
            newMoonPart2.readingStatus = true
        }
    }
}

books.toggleReadingStatus()

console.log(books.readingStatus)




// const person = {
//     name: 'Junn',
//     gender: 'Female',
//     visitedStates: ['Lagos', 'Abuja', 'Abia'],
//     addState: function(name){
//         person.visitedStates.push(name)
//     }
// }
// //Add dynamically to the Object
// person.addState('Nasarawa')
// person.tribe = 'Igbo'
// console.log(person)