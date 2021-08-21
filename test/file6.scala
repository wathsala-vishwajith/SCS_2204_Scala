class Rational(x:Int,y:Int){
  def this(x:Int)=this(x,1) //real numbers
  def numer = x
  def denom = y
  
  override def toString:String= {
    if(denom==1){
      numer.toString()
    }else{
       numer.toString() + "/"+denom.toString()
    }
  }
}

object test extends App{
  val num1 = new Rational(5)
  val num2 = new Rational(5,4)
  
  println(num1)
  println(num2)
}
