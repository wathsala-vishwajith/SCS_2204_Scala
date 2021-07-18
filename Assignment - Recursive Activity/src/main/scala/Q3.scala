object Q3 extends App {
  def sum(num:Int): Int ={
    if(num > 0){
      return num + sum(num-1)
    }else{
      return 0
    }
  }

  println(sum(5))

}
