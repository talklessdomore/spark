package cn.linc.spark.scala

import java.io.{File, PrintWriter}

/**
  * 提取器
  */

object Demo21 {

  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("test.txt" ))
    writer.write("菜鸟学成")
    writer.close()
  }




}
