object Q4 extends App{
  // You don't need to write a recursive function to find out if a number is even or odd.
  def iseven(num:Int):Boolean ={
    if(num%2 == 0){
      return true
    }
    return false
  }

  def evenaddition(num:Int):Int = {
//    println(num)
    if(num < 1){
      return 0
    }else{
      if(iseven(num)){
        return num + evenaddition(num - 2)
      }else{
        return (num - 1) + evenaddition(num - 3)
      }
    }

  }

  println(evenaddition(10))
  println(evenaddition(9))
}
