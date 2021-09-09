//object q3 extends App{
//  val acc1=new Account(10,100.5,0)
//  val acc2=new Account(20,200,0)
//
//  acc1.print
//  acc2.print
//
//  acc1.trasfer(acc2,10)
//
//  acc1.print
//  acc2.print
//
//}

//class Account(id:Int,balance:Double,interest:Double){
//  val accid:Int  = id
//  var accbalance = balance
//  var accinterest= interest

//  def deposit(amount:Double): Unit ={
//    this.accbalance += amount
//  }
//  def withdraw(amount:Double): Double ={
//    if(amount < accbalance ){
//      this.accbalance -= amount;
//      return amount
//    }
//    return 0
//  }
//  def trasfer(acc:Account,amount:Double): Unit ={
//    acc.deposit(this.withdraw(amount))
// }
//  def print = println("id:" +accid + " balance:" + accbalance + " interest:"+ accinterest)
//}

