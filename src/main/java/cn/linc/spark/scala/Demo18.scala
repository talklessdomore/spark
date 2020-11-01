package cn.linc.spark.scala

/**
  * 正则表达式
  */

object Demo18 {

  def main(args: Array[String]): Unit = {
    val str = "hello world".r
    val wholeStr = "hello world i`m scala"
    println(str.findFirstIn(wholeStr))


  }
}
