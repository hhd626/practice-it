/*
write a shorthand text description of a color and prints the longer equivalent
Acceptable color names are B for Blue, G for Green, and R for Red
other types print an error message
*/
Scanner input = new Scanner(System.in);
System.out. print ("What color do you want? ");
String color = input.next();
if ( color.equalsIgnoreCase("B") ) {
System.out. print ("You have chosen Blue." );
} else if ( color.equalsIgnoreCase("R") ) {
System.out. print ("You have chosen Red." );
} else if ( color.equalsIgnoreCase("G") ) {
System.out. print ("You have chosen Green." );
} else {
System.out. print ("Unknown color: " + color );
}
