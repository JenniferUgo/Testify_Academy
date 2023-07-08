/**
 * 
 You now have more books in your library. You should manage them all in one place. Any idea how you can achieve that?... Arrays!


Create a books array. 

Each element of this array will be a book object. 

Each book object will have the following properties

title (string)

description (string)

numberOfPages (number)

authour (string)

reading (boolean)

       3. Use a for-loop to loop through the books array and log all books where the reading status is true to the console
 */


       const books = {
        twilightbooks: [
            {

                 title: "Twilight",
                 description: "Romantic vampire fantasy story",
                 numberOfPages: 500,
                 author: "Stephanie Meyer",
                 readingStatus: true,
            },
            {

                title: "New Moon",
                description: "Romantic vampire fantasy story",
                numberOfPages: 464,
                author: "Stephanie Meyer",
                readingStatus: true,
            },
            {

                title: 'Eclipse',
                description: "Romantic vampire fantasy story",
                numberOfPages: 640,
                author: "Stephanie Meyer",
                readingStatus: false,
            },   
            {

                title: 'Breaking Dawn',
                description: "Romantic vampire fantasy story",
                numberOfPages: 656,
                author: "Stephanie Meyer",
                readingStatus: true,
            }
        ]
       };
       
       for (let i = 0; i < books.twilightbooks.length; i++) {
        if (books.twilightbooks[i].readingStatus) {
          console.log(books.twilightbooks[i]);
        }
      }
    // books.toggleReadingStatus()
    
    // console.log(books.readingStatus)