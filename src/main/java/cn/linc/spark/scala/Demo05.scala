package cn.linc.spark.scala

/**
  * 默认函数值
  */

object Demo05 {

  def main(args: Array[String]): Unit = {
    defaultValue()
  }

  def defaultValue(a: Int = 5, b: Int = 7): Unit = {
    println(a + b)
  }


}
