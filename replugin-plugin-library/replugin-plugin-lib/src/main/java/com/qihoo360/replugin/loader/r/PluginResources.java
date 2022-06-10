package com.qihoo360.replugin.loader.r;

import android.content.res.Resources;
import com.qihoo360.replugin.RePlugin;

public class PluginResources {
    public static int getIdentifier(Resources resources, String name, String defType, String defPackage) {
        defPackage = RePlugin.getPackageName();
        return resources.getIdentifier(name, defType, defPackage);
    }
}
