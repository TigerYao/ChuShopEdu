package com.dachuwang.software.yaohu.chushopedu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        WallpaperManager mWallManager= WallpaperManager.getInstance(this);
//        try {
//            mWallManager.setResource(R.raw.circle_indicator_solid);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        final Intent pickWallpaper = new Intent(Intent.ACTION_SET_WALLPAPER);

//        Intent chooser = Intent.createChooser(pickWallpaper,"tese the ACTION_SET_WALLPAPER");

        startActivity(pickWallpaper);
//        startService(new Intent(this, LiveWallpaper.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
