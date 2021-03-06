package com.dachuwang.software.yaohu.chushopedu.db;

import android.content.Context;

import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.exception.DbException;

/**
 * Created by yaohu on 15/8/21.
 * email yaohu@dachuwang.com
 */
public  class DbUtilsHelper {
    private static DbUtils dbUtils;

    public DbUtilsHelper(Context ctx,String dbName) {
        DbUtils.DaoConfig daoConfig = new DbUtils.DaoConfig(ctx);
        daoConfig.setDbName(dbName);
        this.dbUtils =  DbUtils.create(daoConfig);
    }

    public static DbUtils getDbUtils() {
        return dbUtils;
    }



}
