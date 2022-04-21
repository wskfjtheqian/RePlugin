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
 * ������������
 * @author RePlugin Team
 */
class AppConstant {

    /** �汾�� */
    def static final VER = "2.3.4"

    /** ��ӡ��Ϣʱ���ǰ׺ */
    def static final TAG = "< replugin-host-v${VER} >"

    /** �ⲿ�û�������Ϣ */
    def static final USER_CONFIG = "repluginHostConfig"

    /** �û�Task�� */
    def static final TASKS_GROUP = "replugin-plugin"

    /** Taskǰ׺ */
    def static final TASKS_PREFIX = "rp"

    /** �û�Task:��װ��� */
    def static final TASK_SHOW_PLUGIN = TASKS_PREFIX + "ShowPlugins"

    /** �û�Task:Generate���� */
    def static final TASK_GENERATE = TASKS_PREFIX + "Generate"


    private AppConstant() {}
}
