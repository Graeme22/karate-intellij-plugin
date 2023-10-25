package dev.graemeholliday.plugin.psi;

import com.intellij.psi.tree.IElementType;
import dev.graemeholliday.plugin.KarateLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class KarateTokenType extends IElementType {
    public KarateTokenType(@NotNull @NonNls String debugName) {
        super(debugName, KarateLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "KarateTokenType." + super.toString();
    }
}
