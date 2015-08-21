package com.dachuwang.software.yaohu.chushopedu.modules.wallpaper;

import android.os.Bundle;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;

/**
 * @author Tian
 */
public class LiveWallpaper extends WallpaperService {


    // 实现WallpaperService必须实现的抽象方法
    public Engine onCreateEngine() {
        // 返回自定义的Engine
        return new LieveEngine();
    }

    public void changeWall() {

    }

    class LieveEngine extends Engine {
        @Override
        public boolean isVisible() {
            return super.isVisible();
        }

        @Override
        public void onCreate(SurfaceHolder surfaceHolder) {
            super.onCreate(surfaceHolder);
        }

        @Override
        public void onDesiredSizeChanged(int desiredWidth, int desiredHeight) {
            super.onDesiredSizeChanged(desiredWidth, desiredHeight);
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
        }

        @Override
        public Bundle onCommand(String action, int x, int y, int z, Bundle extras, boolean resultRequested) {
            return super.onCommand(action, x, y, z, extras, resultRequested);
        }

        @Override
        public void onVisibilityChanged(boolean visible) {
            super.onVisibilityChanged(visible);
        }
    }

}