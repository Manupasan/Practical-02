@main def main() =
  println(Q1())
  println(Q2())
  println("Home salary of an employee is " + Q3())
  println(Q4(29))

def Q1() =
  var k,j,i = 2; var m,n = 5; val f = 12.0f; val g = 4.0f; val c = 'X'
  i += 1

  (k+12*m) + ", " + (m/j) + ", " + (n%j) + ", " + (m/j*j) + ", " + (f+10*5+g) + ", " + (i*n)

def Q2() =
  var a =2; val b = 3; var c = 4; var d = 5; val k = 4.3f; val g = 4.0f
  //println(--b*a+c*d--)
  //println(a++)
  (-2*(g-k)+c)
  //println(c=c++)
  //println(c=++c*a++)

def Q3() =
  val wh = 40; val ot = 30

  wh*250 + ot* 85 - (wh*250 + ot* 85)*0.12

def Q4(price : Int) : Int =
  price*(120 + ((15 - price))/5*20) - (500 + 3*(120 + ((15 - price))/5*20))









