package cn.linc.spark.scala

/**
  * 匿名函数
  */

object Demo08 {

  def main(args: Array[String]): Unit = {
    val nickMethod = (a: Int, b: Int) => a + b
    println(nickMethod(1, 2))
  }


}
