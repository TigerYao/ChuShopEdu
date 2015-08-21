
package com.dachuwang.software.yaohu.chushopedu.usb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.StatFs;
import android.text.format.Formatter;

import java.io.File;

//private USBBroadCastReceiver mBroadcastReceiver;
//        IntentFilter iFilter = new IntentFilter();
//        iFilter.addAction(Intent.ACTION_MEDIA_EJECT);
//        iFilter.addAction(Intent.ACTION_MEDIA_MOUNTED);
//        iFilter.addAction(Intent.ACTION_MEDIA_REMOVED);
//        iFilter.addAction(Intent.ACTION_MEDIA_UNMOUNTED);
//        iFilter.addDataScheme("file");
//        mBroadcastReceiver = new USBBroadCastReceiver();
//        registerReceiver(mBroadcastReceiver, iFilter);
public class USBBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (action.equals(Intent.ACTION_MEDIA_EJECT)) {
            //USB设备移除，更新UI
        } else if (action.equals(Intent.ACTION_MEDIA_MOUNTED)) {
            //USB设备挂载，更新UI
        }
    }
    //获得挂载的USB设备的存储空间使用情况
    public static String getUSBStorage(Context context){
        // USB Storage
        //storage/udisk为USB设备在Android设备上的挂载路径.不同厂商的Android设备路径不同。
        //这样写同样适合于SD卡挂载。
        File path = new File("/storage/udisk");
        StatFs stat = new StatFs(path.getPath());
        long blockSize = stat.getBlockSize();
        long totalBlocks = stat.getBlockCount();
        long availableBlocks = stat.getAvailableBlocks();
        String usedSize = Formatter.formatFileSize(context, (totalBlocks - availableBlocks) * blockSize);
        String availableSize = Formatter.formatFileSize(context, availableBlocks * blockSize);
        return usedSize + " / " + availableSize;//空间:已使用/可用的
    }
}