package cn.linc.spark.scala

/**
  * 可变参数
  */

object Demo03 {

  def main(args: Array[String]): Unit = {
    parameter(1,2,3)
  }

  def parameter(xs: Int*): Unit = {
    for (x <- xs) {
      println(x)
    }
  }


}
