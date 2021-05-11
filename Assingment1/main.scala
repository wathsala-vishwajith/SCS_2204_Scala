//19001789
// The temperature is 35C; convert this temperature into Fahrenheit.
// ºF =ºC * 1.8000 + 32.00
import java.lang.Math.PI

def ctof(x: Double): Double = { return x * 1.8000 + 32.0 }

println("12ºC is in ºF is:" + ctof(35))

// The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere with radius 5?

def vol(r: Double): Double = { return (4 / 3) * Math.PI * r * r * r }

println("Volume of a sphere:" + vol(5))

// Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40% discount.
// Shipping costs Rs. 3 for the first 50 copy and 75 cents for each additional copy.
// What is the total wholesale cost for 60 copies?

val discountPrice: Double = (24.95 / 100) * 60
def discount(discountPrice: Double, count: Int): Double = {
  return discountPrice * count
}
def shipping(count: Int): Double = {
  if (count < 50) count * 3 else 150 + (count - 50) * 0.75
}

def wholeCost(dPrice: Double, count: Int): Double = {
  return discount(dPrice, count) + shipping(count)
}

println("Wholesale Cost1:" + wholeCost(discountPrice, 1))
println("Wholesale Cost1:" + wholeCost(discountPrice, 60))
