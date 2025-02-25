/*
 * Copyright (C) 2005-2017 Qihoo 360 Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.qihoo360.replugin.gradle.host

/**
 * ????????????
 * @author RePlugin Team
 */
class AppConstant {

    /** ????? */
    def static final VER = "3.1.0"

    /** ???????????? */
    def static final TAG = "< replugin-host-v${VER} >"

    /** ???????????? */
    def static final USER_CONFIG = "repluginHostConfig"

    /** ???Task?? */
    def static final TASKS_GROUP = "replugin-plugin"

    /** Task?? */
    def static final TASKS_PREFIX = "rp"

    /** ???Task:?????? */
    def static final TASK_SHOW_PLUGIN = TASKS_PREFIX + "ShowPlugins"

    /** ???Task:Generate???? */
    def static final TASK_GENERATE = TASKS_PREFIX + "Generate"


    private AppConstant() {}
}
