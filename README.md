# PROJECT DESCRIPTION


The purpose of this project is to re-implement the<b> Histogram of pixels program Apache using Spark and Scala for better performance</b>.

A pixel in an image can be represented using 3 colours: red, green, and blue, where each colour intensity is an integer between 0 and 255. This project has a Spark- Scala program that derives a histogram for each colour. 

For red, for example, the histogram will indicate how many pixels in the dataset have a green value equal to 0, equal to 1, etc (256 values). The pixel file is a text file that has one text line for each pixel.<br /> For example, the line<br />
23,140,45 <br />
represents a pixel with red=23, green=140, and blue=45.


To compile and run the project navigate to the given directory and do the following steps:<br />

mvn install<br />
~/spark-1.5.2-bin-hadoop2.6/bin/spark-submit --class Histogram target/histogram.jar pixels-small.txt
