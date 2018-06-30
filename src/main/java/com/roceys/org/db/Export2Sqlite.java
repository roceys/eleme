package com.roceys.org.db;

import com.roceys.org.model.DiscountDTO;
import com.roceys.org.model.EOrdersDTO;
import org.apache.commons.dbutils.QueryRunner;
import org.sqlite.SQLiteDataSource;

import java.util.ArrayList;
import java.util.List;

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
    private static final String SQL_DISCOUNTS = "INSERT INTO Discounts (\n" +
            "                          category_id,\n" +
            "                          name,\n" +
            "                          price,\n" +
            "                          quantity,\n" +
            "                          unique_id,\n" +
            "                          id\n" +
            "                      )\n" +
            "                      VALUES (\n" +
            "                          'category_id',\n" +
            "                          'name',\n" +
            "                          'price',\n" +
            "                          'quantity',\n" +
            "                          'unique_id',\n" +
            "                          'id'\n" +
            "                      );\n";

/*
    public int insertDTO(EOrdersDTO eOrdersDTO, List<DiscountDTO> discountDTOList) throws Exception {
        return this.insert(eOrdersDTO,discountDTOList);
    }
*/

 /*   public int insertObj(Object[] orders, Object[] discounts) throws Exception {
       return this.insert(orders,discounts);
    }*/

    public int insert(Object orders, List<Object> discounts) throws Exception {
        sqLiteDataSource = new SQLiteDataSource();
        sqLiteDataSource.setUrl(SQLITE_DB);
        queryRunner = new QueryRunner(sqLiteDataSource);
        //Statement statement = sqLiteDataSource.getConnection().createStatement();
        //return statement.executeUpdate(SQL_ELEME_ORDER);
        int result = 0;
        int o = queryRunner.update(SQL_ELEME_ORDER, orders);
        if (o != 0 && discounts.size() > 0) {
            result += o;
            for (Object obj : discounts) {
                int d = queryRunner.update(SQL_DISCOUNTS, obj);
                result += d;
            }
        }
        return result;
    }
}
