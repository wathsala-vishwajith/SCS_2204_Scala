val a = scala.io.StdIn.readInt()

a match {
    case 1|2|5 => println("Winter")
    case 4|6|7 => println("Summer")
    case _ => println("Other")
}

val a=0

for(a <- 1 to 10){
println(a)
}

val nums = Seq(1,2,3)
for (n <- nums) println(n)

val people = List(
    "Bill", 
    "Candy", 
    "Karen", 
    "Leo", 
    "Regina"
)

people.foreach(println)

val a1= Array(1,3,4)
val a2 = a1.map(_*3)
a2.foreach(println)

val ary = new Array[Int](5) //new Array in size of 5

var a = 0; 
val numList = List(1,2,3,4,5,6,7,8,9,10); 
// for loop execution with a yield 
var retVal = for{ a <- numList 
if a != 3; if a < 8 
}yield a //adds the a to the retVal
// Now print returned values using another loop. 
for( a <- retVal){ 
println( "Value of a: " + a ); 
} 


//breaks
// import following package 
import scala.util.control._ 
// create a Breaks object as follows 
val loop = new Breaks; 
// Keep the loop inside breakable as follows 

var a = 0; 
val numList = List(1,2,3,4,5,6,7,8,9,10); 
// for loop execution with a yield 
var retVal = for{ a <- numList 
if a != 3; if a < 8 
}yield a //adds the a to the retVal
// Now print returned values using another loop. 
loop.breakable{ 
// Loop will go here 
for( a <- retVal){ 
if(a  == 5){
  loop.break;
}
println( "Value of a: " + a ); 
}
} 
 
//breaks
