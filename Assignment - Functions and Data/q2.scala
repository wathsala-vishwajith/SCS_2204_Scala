object q2 extends App{

  val r1 = new Rational(1,5)
  r1.neg.print

  def x = new Rational(1,5)
  def y = new Rational(3,40)
  def z = new Rational(2,15)

  (x-y-z).print

  def a = new Rational(1,5)
  def b = new Rational(1,25)
  def c = new Rational(1,75)

  (a-b-c).print
}

class Rational(x:Int,y:Int){

  private def gcd(x:Int,y:Int):Int = if(y==0) x else gcd(y,x%y)
  private def numer = x/gcd(x,y)
  private def denom = y/gcd(x,y)

  def neg = new Rational(-1 * this.numer, this.denom)
  def print = println(this.numer+"/"+this.denom)


  def -(r:Rational): Rational ={
    new Rational(this.numer*r.denom - r.numer*this.denom ,this.denom*r.denom )
  }
  def +(r:Rational): Rational ={
    new Rational(this.numer*r.denom + r.numer*this.denom ,this.denom*r.denom )
  }
}
