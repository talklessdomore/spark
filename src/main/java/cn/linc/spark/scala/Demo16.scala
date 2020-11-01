package cn.linc.spark.scala

/**
  * trait
  */

object Demo16 {

  def main(args: Array[String]): Unit = {
    val i = new intefaceImpl
    val t = i.add(1,2)
    println(t)
  }

 trait inteface{
   def add(a:Int,b:Int):Int
 }

  class intefaceImpl extends inteface{
     def add(a: Int, b: Int): Int = {
       return a+b
     }
  }



}
