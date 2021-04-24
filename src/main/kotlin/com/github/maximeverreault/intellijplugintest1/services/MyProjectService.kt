package com.github.maximeverreault.intellijplugintest1.services

import com.github.maximeverreault.intellijplugintest1.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
