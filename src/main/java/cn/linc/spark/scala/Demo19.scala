package cn.linc.spark.scala

import java.io.FileReader

/**
  * 异常处理
  */

object Demo19 {

  def main(args: Array[String]): Unit = {
    try {
      val file = new FileReader("D:/ttt.txt")
    }catch {
      case ex: Exception =>{
        println("异常处理方法")
      }
    }finally {
      println("异常处理方法最后处理方式")
    }



  }
}
