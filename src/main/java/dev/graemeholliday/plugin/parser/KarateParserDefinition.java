package dev.graemeholliday.plugin.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import dev.graemeholliday.plugin.KarateLanguage;
import dev.graemeholliday.plugin.psi.KarateFile;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

public class KarateParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(KarateLanguage.INSTANCE);

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(
            KarateLanguage.INSTANCE,
            KarateParser.tokenNames,
            KarateParser.ruleNames
        );
    }

    public static final TokenSet COMMENTS = PSIElementTypeFactory.createTokenSet(
        KarateLanguage.INSTANCE,
        KarateLexer.COMMENT,
        KarateLexer.FEATURE_COMMENT
    );
    public static final TokenSet WHITESPACE = PSIElementTypeFactory.createTokenSet(
        KarateLanguage.INSTANCE,
        KarateLexer.NEWLINE
    );

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        KarateLexer lexer = new KarateLexer(null);
        return new ANTLRLexerAdaptor(KarateLanguage.INSTANCE, lexer);
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITESPACE;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        final KarateParser parser = new KarateParser(null);
        return new ANTLRParserAdaptor(KarateLanguage.INSTANCE, parser) {
            @Override
            protected ParseTree parse(Parser parser, IElementType root) {
                return ((KarateParser)parser).feature();
            }
        };
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new KarateFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return new ANTLRPsiNode(node);
    }

}