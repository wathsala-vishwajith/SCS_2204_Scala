object q4 extends App{

  var AccList = List(new Account(10, 123), new Account(11, 200), new Account(3, -100), new Account(4, 100))
  var negativeBalances = AccList.filter((x) => x.accbalance < 0)
  var sumOfAccounts = AccList.map(x => x.accbalance).reduce((x,y) => x + y)
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
  var accbalance = balance


  def applyInterest(): Account = {
    if(accbalance > 0 ){
      accbalance  = accbalance * 1.05
      return this
    }
    else {
      accbalance = accbalance * 1.1
      return this
    }
  }
  override def toString = "id:" +accid + " balance:" + accbalance

}
