object Q1 extends App{
  def prime(num: Int,n:Int): Boolean = {
    if(n == 1){
      return true
    }else{
      if(num%n == 0 && num != n){
        return false
      }else{
        return prime(num,n-1)
      }
    }
  }
  def primehelper(num:Int):Boolean={
    return prime(num,9)
  }

  def primeprint(num:Int):Unit ={
    if(num == 1){
      println(num)
    }else{
      if(primehelper(num)){
        println(num)
        //        return num;
      }
      primeprint(num-1)
    }
  }

//  def primeprinthelper(num:Int):Unit = {
//    return primeprint(num)
//  }


  println(primehelper(5))
  println(primehelper(8))
  println(primehelper(34))
  primeprint(20)

}
