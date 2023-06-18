package org.example;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;


public class Main {
    public static void main(String[] args) {
        SparkSession spark = SparkSession.builder()
                .appName("Snake Data Analysis")
                .master("local[*]")
                .getOrCreate();

        Dataset<Row> dataset = spark.read().format("csv")
                .option("header", "true")
                .load("/path/to/snake_dataset.csv");
        dataset.createOrReplaceTempView("snakes");

        spark.sql("SELECT * FROM snakes").show();
        spark.sql("SELECT * FROM snakes WHERE binomial = 'Agkistrodon contortrix'").show();
        spark.sql("SELECT * FROM snakes WHERE country = 'United States of America'").show();
        spark.sql("SELECT * FROM snakes WHERE poisonous = '1'").show();
        spark.sql("SELECT * FROM snakes WHERE family LIKE 'V%'").show();
        spark.sql("SELECT * FROM snakes WHERE age <= 5").show();
        spark.sql("SELECT * FROM snakes WHERE name LIKE '%cobra%'").show();
        spark.sql("SELECT * FROM snakes WHERE binomial LIKE 'B%'").show();
        spark.sql("SELECT * FROM snakes WHERE poisonous = '0'").show();
        spark.stop();
    }
}