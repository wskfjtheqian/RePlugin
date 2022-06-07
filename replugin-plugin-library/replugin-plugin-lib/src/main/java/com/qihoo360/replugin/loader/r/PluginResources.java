package com.qihoo360.replugin.loader.r;

import android.content.Context;

public abstract class PluginResources {
    final static String PackageName = "com.plugin.package_name";

    public static int getIdentifier(Context context, String name, String defType, String defPackage) {
        return context.getResources().getIdentifier(name, defType, defPackage);
    }
}
