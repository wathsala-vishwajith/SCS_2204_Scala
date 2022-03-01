import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine


object CC extends App {
  val list: List[Char] = List(
    'A',
    'B',
    'C',
    'D',
    'E',
    'F',
    'G',
    'H',
    'I',
    'J',
    'K',
    'L',
    'M',
    'N',
    'O',
    'P',
    'Q',
    'R',
    'S',
    'T',
    'U',
    'V',
    'W',
    'X',
    'Y',
    'Z',
    ' '
  )
  println("Enter the String:")
  val input:String = readLine().toUpperCase()
  println("Enter the shift:")
  val shift:Int = readLine().toInt
  
  val Encrypt = (ch:Char,alphabet:List[Char],shift:Int)=> alphabet((alphabet.indexOf(ch)+shift)%alphabet.size) //get the current alphabet position + shift it % and make the aplpahbet a circle by doing modulus
//  val Decrypt = (ch:Char,alphabet:List[Char],shift:Int)=> alphabet((alphabet.indexOf(ch)-shift)%alphabet.size) // - shift

  val Decrypt = (ch:Char,alphabet:List[Char],shift:Int)=> alphabet(((alphabet.indexOf(ch)-shift)+alphabet.size)%alphabet.size) // - shift again
  //((dividend % divisor) + divisor) % divisor

  //take the input string and apply the above functions character by character.
  val cipher = (algorithm: (Char, List[Char], Int) => Char, input_string: String, shift: Int, alphabet:List[Char]) => input_string.map(algorithm(_, alphabet,shift))

  val encrypted:String = cipher(Encrypt, input, shift, list);
  val decrypted:String = cipher(Decrypt, encrypted, shift, list)
  println("Encrypted:"+ encrypted)  // encrypt given string
  println("Decrypted:"+ decrypted) // decrypt encrypted string
 

}
