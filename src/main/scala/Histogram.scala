import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Histogram {
  def main ( args: Array[ String ] ) {
    val config = new SparkConf().setAppName("Histogram");
    val sc = new SparkContext(config);
    val tuples = sc.textFile(args(0)).flatMap( line => { val a = line.split(",")
                                                Seq(((1,a(0).toInt),1),((2,a(1).toInt),1),((3,a(2).toInt),1))})
    tuples.reduceByKey((a,b) => a+b)
    .collect().foreach(rec => println(s"${rec._1._1}    ${rec._1._2}     ${rec._2}"))
    sc.stop()
  }
}
