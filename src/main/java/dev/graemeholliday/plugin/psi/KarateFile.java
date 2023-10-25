package dev.graemeholliday.plugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import dev.graemeholliday.plugin.KarateFileType;
import dev.graemeholliday.plugin.KarateIcons;
import dev.graemeholliday.plugin.KarateLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class KarateFile extends PsiFileBase {
    public KarateFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, KarateLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return KarateFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Karate Scenario";
    }

    @Override
    public Icon getIcon(int flags) {
        return KarateIcons.KARATE_ICON;
    }
}
