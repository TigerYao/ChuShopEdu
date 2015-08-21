package com.dachuwang.software.yaohu.chushopedu.db;

import android.content.Context;

import com.lidroid.xutils.DbUtils;

/**
 * Created by yaohu on 15/8/21.
 * email yaohu@dachuwang.com
 */
public abstract class DbUtilsHelper {
    private DbUtils dbUtils;

    public DbUtilsHelper(Context ctx,String dbName) {
        DbUtils.DaoConfig daoConfig = new DbUtils.DaoConfig(ctx);
        daoConfig.setDbName(dbName);
        this.dbUtils =  DbUtils.create(daoConfig);
    }

    public DbUtils getDbUtils() {
        return dbUtils;
    }

}
