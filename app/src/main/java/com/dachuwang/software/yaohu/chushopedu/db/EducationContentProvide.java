package com.dachuwang.software.yaohu.chushopedu.db;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

import com.dachuwang.software.yaohu.chushopedu.utils.ConstantUtils;

/**
 * Created by yaohu on 15/8/21.
 * email yaohu@dachuwang.com
 */
public class EducationContentProvide extends ContentProvider {

    static UriMatcher  sMatcher = new UriMatcher(UriMatcher.NO_MATCH);


    static {
        sMatcher.addURI(ConstantUtils.AUTHORITIES,ConstantUtils.SETTINGSTABLENAME,1);
        sMatcher.addURI(ConstantUtils.AUTHORITIES,ConstantUtils.SETTINGSTABLENAME+"/#",2);
        sMatcher.addURI(ConstantUtils.AUTHORITIES,ConstantUtils.APPINFOTABLENAME,3);
        sMatcher.addURI(ConstantUtils.AUTHORITIES,ConstantUtils.APPINFOTABLENAME+"/#",4);
        sMatcher.addURI(ConstantUtils.AUTHORITIES,ConstantUtils.CATALOGTABLENAME,5);
        sMatcher.addURI(ConstantUtils.AUTHORITIES,ConstantUtils.CATALOGTABLENAME+"/#",6);
        sMatcher.addURI(ConstantUtils.AUTHORITIES,ConstantUtils.BOOKTABLENAME,7);
        sMatcher.addURI(ConstantUtils.AUTHORITIES,ConstantUtils.BOOKTABLENAME+"/#",8);
        sMatcher.addURI(ConstantUtils.AUTHORITIES,ConstantUtils.RECENTTABLENAME,9);
        sMatcher.addURI(ConstantUtils.AUTHORITIES,ConstantUtils.RECENTTABLENAME+"/#",10);
    }

    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings1, String s1) {

        switch (sMatcher.match(uri)){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return null;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
