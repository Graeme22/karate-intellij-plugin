package dev.graemeholliday.plugin.psi;

import com.intellij.psi.tree.IElementType;
import dev.graemeholliday.plugin.KarateLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class KarateElementType extends IElementType {

    public KarateElementType(@NotNull @NonNls String debugName) {
        super(debugName, KarateLanguage.INSTANCE);
    }
}
