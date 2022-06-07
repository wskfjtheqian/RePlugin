package com.qihoo360.replugin.gradle.compat

import com.android.build.gradle.internal.scope.GlobalScope
import com.android.sdklib.IAndroidTarget

/**
 * @author hyongbai
 */
class ScopeCompat {
    static def getAdbExecutable(GlobalScope scope) {
        final MetaClass scopeClz = scope.metaClass
        if (scopeClz.hasProperty(scope, "androidBuilder")) {
            return scope.androidBuilder.sdkInfo.adb
        }
        if (scopeClz.hasProperty(scope, "sdkComponents")) {
            return scope.getVersionedSdkLoader().get().adbExecutableProvider.get().asFile
        }
    }

    static def getAndroidJar(GlobalScope scope) {
        final MetaClass scopeClz = scope.metaClass

        if (scopeClz.hasProperty(scope, "androidBuilder")) {
            return scope.getAndroidBuilder().getTarget().getPath(IAndr oidTarget.ANDROID_JAR)
        }
        if (scopeClz.hasProperty(scope, "sdkComponents")) {
            return scope.getVersionedSdkLoader().get().androidJarProvider.get().path
        }
    }

    // TODO: getBuilderTarget
//    static def getBuilderTarget(def scope, def target){
//        final MetaClass scopeClz = scope.metaClass
//
//        if (scopeClz.hasProperty(scope, "androidBuilder")) {
//            return scope.getAndroidBuilder().getTarget().getPath(target) //IAndroidTarget.ANDROID_JAR
//        }
//
//        return globalScope.getAndroidBuilder().getTarget().getPath(IAndroidTarget.ANDROID_JAR)
//    }
}