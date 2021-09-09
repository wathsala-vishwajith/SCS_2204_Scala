object q4 extends App{
  println("3 ")
  val acc1=new Account(10,100.5)
  val acc2=new Account(20,200)

  println(acc1)
  println(acc2)

  acc1.trasfer(acc2,10)

  println(acc1)
  println(acc2)

println()

  var AccList = List(new Account(10, 123), new Account(11, 200), new Account(3, -100), new Account(4, 100))
  var negativeBalances = AccList.filter((x) => x.accbalance < 0)
//  var sumOfAccounts = AccList.map(x => x.accbalance).reduce((x,y) => x + y)
  var sumOfAccounts = AccList.map(x => x.accbalance).sum
  var applyInterest = AccList.map((x) => x.applyInterest())

  println(" 4.1 negative balance ")
  println(negativeBalances+"\n")

  println(" 4.2 sum ")
  println(sumOfAccounts+"\n")

  println(" 4.3 apply interest ")
  println(applyInterest+"\n")
}

class Account(id:Int,balance:Double){
  val accid:Int  = id
  var accbalance: Double = balance

  def deposit(amount:Double): Unit ={
    this.accbalance += amount
  }
  def withdraw(amount:Double): Double ={
    if(amount < accbalance ){
      this.accbalance -= amount;
      return amount
    }
    return 0
  }
  def trasfer(acc:Account,amount:Double): Unit ={
    acc.deposit(this.withdraw(amount))
  }

  def applyInterest(): Account = {
    if(accbalance > 0 ){
      accbalance  = accbalance * 1.05
      this
    }
    else {
      accbalance = accbalance * 1.1
      this
    }
  }
  override def toString: String = "id:" +accid + " balance:" + accbalance

}
