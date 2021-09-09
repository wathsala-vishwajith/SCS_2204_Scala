import scala.math.sqrt
import scala.math.pow
case class Point(a:Int, b:Int){
  def x:Int =a
  def y:Int =b
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  def +(that:Point) = Point(this.x+that.x,this.y+that.y)
  def distance(that:Point) = sqrt(pow((this.x-that.x),2) + pow((this.y-that.y),2))
  def invert() = Point(this.y,this.x)
  
}

val p1 = Point(0,0)
val p2 = p1.move(2,3)

println(p2)

println(p1.distance(p2))

println(p2.invert())


