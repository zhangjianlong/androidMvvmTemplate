package com.github.zhangjianlong.androidmvvmtemplate.services

import com.intellij.openapi.project.Project
import com.github.zhangjianlong.androidmvvmtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
