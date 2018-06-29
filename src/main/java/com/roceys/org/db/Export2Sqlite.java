package com.roceys.org.db;

import com.roceys.org.model.Orders;
import org.apache.commons.dbutils.QueryRunner;
import org.sqlite.SQLiteDataSource;

import java.sql.Statement;

public class Export2Sqlite {
    private static SQLiteDataSource sqLiteDataSource;
    private static QueryRunner queryRunner;
    private static final String SQLITE_DB = "jdbc:sqlite:D:\\SQLiteStudio\\eleme";
    private static final String SQL_ELEME_ORDER = "INSERT INTO Eorder (\n" +
            "                       image_hash,\n" +
            "                       name,\n" +
            "                       price,\n" +
            "                       quantity,\n" +
            "                       marks,\n" +
            "                       unique_id,\n" +
            "                       restaurant_name,\n" +
            "                       restaurant_image_hash,\n" +
            "                       restaurant_id,\n" +
            "                       restaurant_type,\n" +
            "                       restaurant_valid,\n" +
            "                       total_amount,\n" +
            "                       total_quantity,\n" +
            "                       rated_point,\n" +
            "                       operation_rate,\n" +
            "                       is_brand,\n" +
            "                       is_deletable,\n" +
            "                       is_from_openapi,\n" +
            "                       is_new_pay,\n" +
            "                       id,\n" +
            "                       courier_phone,\n" +
            "                       created_timestamp,\n" +
            "                       packing_quantity,\n" +
            "                       packing_total_price,\n" +
            "                       deliver_price\n" +
            "                   )\n" +
            "                   VALUES (\n" +
            "                       'image_hash',\n" +
            "                       'name',\n" +
            "                       'price',\n" +
            "                       'quantity',\n" +
            "                       'marks',\n" +
            "                       'unique_id',\n" +
            "                       'restaurant_name',\n" +
            "                       'restaurant_image_hash',\n" +
            "                       'restaurant_id',\n" +
            "                       'restaurant_type',\n" +
            "                       'restaurant_valid',\n" +
            "                       'total_amount',\n" +
            "                       'total_quantity',\n" +
            "                       'rated_point',\n" +
            "                       'operation_rate',\n" +
            "                       'is_brand',\n" +
            "                       'is_deletable',\n" +
            "                       'is_from_openapi',\n" +
            "                       'is_new_pay',\n" +
            "                       'id',\n" +
            "                       'courier_phone',\n" +
            "                       'created_timestamp',\n" +
            "                       'packing_quantity',\n" +
            "                       'packing_total_price',\n" +
            "                       'deliver_price'\n" +
            "                   )";

    public int insert(Orders orders) throws Exception {
        sqLiteDataSource = new SQLiteDataSource();
        sqLiteDataSource.setUrl(SQLITE_DB);
        queryRunner = new QueryRunner(sqLiteDataSource);
        //Statement statement = sqLiteDataSource.getConnection().createStatement();
        //return statement.executeUpdate(SQL_ELEME_ORDER);
        return queryRunner.update(SQL_ELEME_ORDER);
    }
}
