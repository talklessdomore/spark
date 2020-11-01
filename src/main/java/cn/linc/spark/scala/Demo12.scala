package cn.linc.spark.scala

/**
  * 字符串
  */

object Demo12 {

  def main(args: Array[String]): Unit = {
    applicationFunction()
  }

  def applicationFunction(): Unit = {
    var s = "hello world"
    s = "world"
    val s1 = "hello world"
    println("-----" + s + "---------" + s1)
  }


}
