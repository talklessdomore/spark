package cn.linc.spark.demo1

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount {

  def main(args: Array[String]): Unit = {
    // 1. 创建 Spark Context
    val conf = new SparkConf().setMaster("local[2]").setAppName("wordCountTest")
    val sc: SparkContext = new SparkContext(conf)
    // 2. 读取文件并计算词频
    val source: RDD[String] = sc.textFile("D:\\bigdata\\spark\\src\\main\\resources\\wordcount.txt", 2)
    val words = source.flatMap(line=>line.split(" "))
    val wordTuple = words.map{word => (word,1)}
  }

}
