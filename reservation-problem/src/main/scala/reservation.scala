package com.cs24

object reservation extends App {
  def initialize(column:Int,row:Int): Array[Array[Int]] ={ //initial reservation here.
    //return Array.ofDim[Int](row,column)
    Array.fill[Int](column,row){0}
  }
  def print(a:Array[Array[Int]]): Array[Array[Int]] ={
    a.foreach(row => println(row.mkString(" ")))
    a
  }

//  Seat numbering as (column,row)
// so first seat first column first row (0,0)
//  second seat first row second column (0,1)

// Enter number of Stops
// first allocate on first stop initialize to zero
// then for each stop
// 1. Enter the seats that are going to be vacant eg (0,1) (0,5) (10,100)
// 2. Enter the number of passengers on boarding, eg 10
// then print the allocated seats for the passengers eg "passengers allocated on seats (0,1) (0,5)

  def reserve(a:Array[Array[Int]]):Array[Array[Int]] = { //onboarding

  }

  def disembark(a:Array[Array[Int]]):Array[Array[Int]]={ //offboarding

  }

  print(initialize(4,50))

}
