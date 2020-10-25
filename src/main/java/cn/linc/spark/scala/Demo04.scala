package cn.linc.spark.scala

/**
  * 递归函数
  */

object Demo04 {

  def main(args: Array[String]): Unit = {
    println(for (i <- 1 to 10) println(f2(i)))
  }

  def f2(xs: BigInt): BigInt = {
    if (xs <= 1) {
      1
    } else {
      xs * f2(xs - 1)
    }
  }


}
