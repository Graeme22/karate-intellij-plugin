package dev.graemeholliday.plugin

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile

import javax.swing.Icon

object KarateFileType : LanguageFileType(KarateLanguage) {
    override fun getName(): String = "Karate"
    override fun getIcon(): Icon = KarateIcons.KARATE_ICON
    override fun getDefaultExtension(): String = "feature"
    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"
    override fun getDescription(): String = "Karate feature"
}