package com.github.dwdw666.intellijplatformplugintemplatedemo.services

import com.github.dwdw666.intellijplatformplugintemplatedemo.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
