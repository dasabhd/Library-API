# Library-API

BaseURI : http://216.10.245.166
 
1.	Resource : Library/Addbook.php       Method : POST
 
Input Payload : Json:
{

"name":"Learn Appium Automation with Java",
"isbn":"bcd",
"aisle":"227",
"author":"John foe"
}
 
Output Json 
{
   "Msg": "successfully added",
   "ID": "bcd227"
} 
 
 
1.	Resource : /Library/GetBook.php?AuthorName=somename         Method : GET 
 
Output Json :
Output the array of Json object books with all below  details 
 
{
 
Name : “bookname”   ( String)
Isbn :  “A2fdsf”   (String)
Aisle : 32 (Integer)
 
}
 
 
1.	Resource : Library/GetBook.php?ID=3389      - Method : GET 
 
Output Json :
{
      "book_name": "Selenium automation using Java",
      "isbn": "a23hd738",
      "aisle": "1223"
   } 
 
1.	Resource :/Library/DeleteBook.php      Method : POST
 
Input Payload : Json:
{
 
"ID" : "a23h345122332"
 
} 
Output Response :
{

msg : book is successfully deleted”
 
}
