package cn.linc.scala.test.demo1

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

object WordCount {

  def main(args: Array[String]): Unit = {
    // 1. 创建 Spark Context
    val conf = new SparkConf().setMaster("local[2]").setAppName("wordCountTest")
    val sc: SparkContext = new SparkContext(conf)
    // 2. 读取文件并计算词频
    val source: RDD[String] = sc.textFile("src/main/dataset/wordcount.txt", 2)
    val words: RDD[String] = source.flatMap { line => line.split(" ") }
    val wordsTuple: RDD[(String, Int)] = words.map { word => (word, 1) }
    val wordsCount: RDD[(String, Int)] = wordsTuple.reduceByKey { (x, y) => x + y }
    // 3. 查看执行结果
    val result = wordsCount.collect;
    result.foreach(item => println(item))
  }

}
