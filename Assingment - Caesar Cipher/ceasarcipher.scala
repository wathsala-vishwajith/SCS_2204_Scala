import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer


object CC extends App {
  val listbuffer1: ListBuffer[String] = ListBuffer(
    "A",
    "B",
    "C",
    "D",
    "E",
    "F",
    "G",
    "H",
    "I",
    "J",
    "K",
    "L",
    "M",
    "N",
    "O",
    "P",
    "Q",
    "R",
    "S",
    "T",
    "U",
    "V",
    "W",
    "X",
    "Y",
    "Z",
    " "
  )
  println("Enter the String:")
  val input = readLine().toUpperCase()
  println("Enter the shift:")
  val shift = readLine().toInt
  
  val Encrypt = (ch:Char,alphabet:ListBuffer[String],shift:Int)=> alphabet((alphabet.indexOf(ch)+shift)%alphabet.size) 
  val Decrypt = (ch:Char,alphabet:ListBuffer[String],shift:Int)=> alphabet((alphabet.indexOf(ch)-shift)%alphabet.size) 
  
  //take the input string and apply the above functions character by character.
  val cipher = (algorithm: (Char, ListBuffer[String], Int) => Char, input_string: String, shift: Int, alphabet: ListBuffer[String]) => input_string.map(algorithm(_, alphabet,shift)) 

  val encrypted:String = cipher(Encrypt, input, shift, listbuffer1);
  val decrypted:String = cipher(Decrypt, encrypted, shift, listbuffer1);
  println("Encrypted:"+ encrypted)  // encrypt given string
  println("Decrypted:"+ decrypted) // decrypt encrypted string
 

}
