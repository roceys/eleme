package com.roceys.org.db;

import com.roceys.org.model.Orders;
import org.apache.commons.dbutils.QueryRunner;
import org.sqlite.SQLiteDataSource;

import java.sql.Statement;

public class Export2Sqlite {
    private static SQLiteDataSource sqLiteDataSource;
    private static QueryRunner queryRunner;
    private static final String SQLITE_DB = "jdbc:sqlite:D:\\SQLiteStudio\\eleme";
    private static final String SQL_ELEME_ORDER = "";

    public int insert(Orders orders) throws Exception {
        sqLiteDataSource = new SQLiteDataSource();
        sqLiteDataSource.setUrl(SQLITE_DB);
        queryRunner = new QueryRunner(sqLiteDataSource);
        //Statement statement = sqLiteDataSource.getConnection().createStatement();
        //return statement.executeUpdate(SQL_ELEME_ORDER);
        return queryRunner.update(SQL_ELEME_ORDER);
    }
}
