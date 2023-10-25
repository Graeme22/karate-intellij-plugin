package dev.graemeholliday.plugin.syntax;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.vfs.VirtualFile;

public class KarateSyntaxHighlighterFactory extends SyntaxHighlighterFactory {
    @NotNull
    @Override
    public SyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
        return new KarateSyntaxHighlighter();
    }
}
