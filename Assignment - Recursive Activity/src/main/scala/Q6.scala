object Q6 extends App {
  def fib(n:Int):Int ={
    if(n <= 1){
//      print(n)
      return n
    }else{
//      print((fib(n-1) + fib(n-2)) + " ")
      return fib(n-1) + fib(n-2)
    }
  }

  def fibhelper(n:Int, count:Int):Unit ={
    if(count == n){
      print(" "+fib(count))
    }else{
      print(" "+fib(count))
      return fibhelper(n,count+1)
    }
  }

  fibhelper(10,0)
}
