case class Point(a:Int, b:Int){
  def x:Int =a
  def y:Int =b
}

val p1 = Point(1,2)

println(p1) //has a to_String function inbuilt.

val p2 = Point(2,3)

println(p1==p2) //inbuilt comparing functions.

val p3=p1.copy() //copy function 
val p4=p1.copy(b=9)  //copy function with changing variables
println(p3.toString()+" "+p4.toString())

//match-case
val p5 = Point(0,0)

val pType =(p:Point) => p match {
  case Point(0,0) => "Point Origin"
  case Point(x,0)=> "Point on x axis"
  case Point(0,y)=> "Point on y axis"
  case Point(x,y)=> if(x>y) "X>Y" else "X<Y"
}


println("Point 1:"+pType(p1) + " Point 5:" + pType(p5))
