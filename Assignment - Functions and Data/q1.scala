
object q1 extends App{
  val r1 = new Rational(1,5)
  r1.neg.print
}

class Rational(x:Int,y:Int){
  private def numer = x
  private def denom = y

  def neg = new Rational(-1 * this.numer, this.denom)
  def print = println(this.numer+"/"+this.denom)
}