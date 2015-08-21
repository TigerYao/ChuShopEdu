package com.dachuwang.software.yaohu.chushopedu.utils;

import android.net.Uri;

/**
 * Created by yaohu on 15/8/21.
 * email yaohu@dachuwang.com
 */
public class ConstantUtils {
    public static final String AUTHORITIES="content://com.dachuwang.tiger.child.edu";
    public static final String SETTINGSTABLENAME= "setting_table";
    public static final String RECENTTABLENAME= "recent_table";
    public static final String BOOKTABLENAME= "book_table";
    public static final String APPINFOTABLENAME = "appinfo_table";
    public static final String CATALOGTABLENAME = "catalog_table";
    public static final Uri SETTINGSTABLE= Uri.parse(AUTHORITIES+"/setting_table");
    public static final Uri RECENTTABLE= Uri.parse(AUTHORITIES+"/recent_table");
    public static final Uri BOOKTABLE= Uri.parse(AUTHORITIES+"/book_table");
    public static final Uri APPINFOTABLE = Uri.parse(AUTHORITIES+"/appinfo_table");
    public static final Uri CATALOGTABLE = Uri.parse(AUTHORITIES+"/catalog_table");



}
