package com.dachuwang.software.yaohu.recycleviewpager.db;

import android.content.Context;

import com.lidroid.xutils.DbUtils;

/**
 * Created by yaohu on 15/8/21.
 * email yaohu@dachuwang.com
 */
public abstract class DbUtilsHelper {
    private static DbUtils dbUtils;

    public DbUtilsHelper(Context ctx, String dbName) {
        DbUtils.DaoConfig daoConfig = new DbUtils.DaoConfig(ctx);
        daoConfig.setDbUpgradeListener(new MyDbUpdateListener());
        daoConfig.setDbName(dbName);
        this.dbUtils =  DbUtils.create(daoConfig);
    }

    public static DbUtils getDbUtils() {
        return dbUtils;
    }

    class MyDbUpdateListener implements DbUtils.DbUpgradeListener{
        @Override
        public void onUpgrade(DbUtils dbUtils, int i, int i1) {

        }
    }


}
