package dev.graemeholliday.plugin.syntax;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import dev.graemeholliday.plugin.KarateLanguage;
import dev.graemeholliday.plugin.parser.KarateLexer;
import dev.graemeholliday.plugin.parser.KarateParser;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class KarateSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY =
            createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey CONSTANT =
            createTextAttributesKey("SIMPLE_CONSTANT", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] CONSTANT_KEYS = new TextAttributesKey[]{CONSTANT};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(
            KarateLanguage.INSTANCE,
            KarateParser.tokenNames,
            KarateParser.ruleNames
        );
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        KarateLexer lexer = new KarateLexer(null);
        return new ANTLRLexerAdaptor(KarateLanguage.INSTANCE, lexer);
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if(!(tokenType instanceof TokenIElementType myType))
            return EMPTY_KEYS;
        int ttype = myType.getANTLRTokenType();
        TextAttributesKey[] attrKey = EMPTY_KEYS;
        switch (ttype) {
            case KarateLexer.BACKGROUND,
                 KarateLexer.SCENARIO,
                 KarateLexer.SCENARIO_OUTLINE,
                 KarateLexer.FEATURE,
                 KarateLexer.EXAMPLES ->
                     attrKey = KEY_KEYS;
            case KarateLexer.TABLE_ROW,
                 KarateLexer.DOC_STRING,
                 KarateLexer.COMMENT,
                 KarateLexer.FEATURE_COMMENT ->
                     attrKey = VALUE_KEYS;
            case KarateLexer.GIVEN,
                 KarateLexer.WHEN,
                 KarateLexer.THEN,
                 KarateLexer.BUT,
                 KarateLexer.AND ->
                     attrKey = CONSTANT_KEYS;
            case KarateLexer.CHAR ->
                     attrKey = COMMENT_KEYS;
            case KarateLexer.FEATURE_TAGS,
                 KarateLexer.TAGS,
                 KarateLexer.STAR ->
                     attrKey = SEPARATOR_KEYS;
        }
        return attrKey;
    }

}
