package dev.graemeholliday.plugin

import com.intellij.lang.Language

object KarateLanguage : Language("Karate") {
    override fun isCaseSensitive() = true
    override fun getDisplayName() = "Karate"
}