package cn.linc.spark.scala

/**
  * 数组
  */

object Demo13 {

  def main(args: Array[String]): Unit = {
   /* //0.遍历
    val z = Array(1, 2, 3, 4, 5)
    for (item <- z) {
      println(item)
    }
    //1.计算综合
    var total = 0
    for (item <- z) {
      total += item
    }
    println(total)

    //2.获取最大值
    var max = 0
    for (item <- z) {
      if (item > max) {
        max = item
      }
    }
    print(max)*/

    //3.多为数组
    var ar = Array.ofDim[Int](3, 4)
    for (i <- 0 to 2) {
      for (j <- 0 to 3) {
        ar(i)(j) = j
      }
    }

    for (i <- 0 to 2) {
      for (j <- 0 to 3) {
         print(ar(i)(j))
      }
      println()
    }


  }


}
