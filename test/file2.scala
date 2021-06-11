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
