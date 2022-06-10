package com.qihoo360.replugin.loader.r;

import android.content.Context;
import com.qihoo360.replugin.RePlugin;

public class PluginResources {
    public static int getIdentifier(Context context, String name, String defType, String defPackage) {
        defPackage = RePlugin.getPackageName();
        return context.getResources().getIdentifier(name, defType, defPackage);
    }
}
