#include "kotlinWrapper.hh"

extern "C" {

auto commonLexerLib = libCommonLexer_symbols();
auto kudoaLexerLib = libKudoaLexer_symbols();
auto stream = LIB_KUDOA_LEXER.KudoaTokenStream.KudoaTokenStream();

void addToken(Token token) {
    LIB_COMMON_LEXER.TokenStream.addToken(TO(TokenStream, stream), TO(Token, token));
}

Token LCBRToken(int col, int row) {
    libKudoaLexer_kref_lexer_kudoa_tokens_LCBRToken out = LIB_KUDOA_LEXER.tokens.LCBRToken.LCBRToken(col, row);
    return TO(Token, out);
}

Token RCBRToken(int col, int row) {
    libKudoaLexer_kref_lexer_kudoa_tokens_RCBRToken out = LIB_KUDOA_LEXER.tokens.RCBRToken.RCBRToken(col, row);
    return TO(Token, out);
}

Token LSBRToken(int col, int row) {
    libKudoaLexer_kref_lexer_kudoa_tokens_LSBRToken out = LIB_KUDOA_LEXER.tokens.LSBRToken.LSBRToken(col, row);
    return TO(Token, out);
}

Token RSBRToken(int col, int row) {
    libKudoaLexer_kref_lexer_kudoa_tokens_RSBRToken out = LIB_KUDOA_LEXER.tokens.RSBRToken.RSBRToken(col, row);
    return TO(Token, out);
}

Token LangToken(int col, int row) {
    libKudoaLexer_kref_lexer_kudoa_tokens_LangToken out = LIB_KUDOA_LEXER.tokens.LangToken.LangToken(col, row);
    return TO(Token, out);
}

Token RowToken(int col, int row) {
    libKudoaLexer_kref_lexer_kudoa_tokens_RowToken out = LIB_KUDOA_LEXER.tokens.RowToken.RowToken(col, row);
    return TO(Token, out);
}

Token TokenToken(int col, int row) {
    libKudoaLexer_kref_lexer_kudoa_tokens_TokenToken out = LIB_KUDOA_LEXER.tokens.TokenToken.TokenToken(col, row);
    return TO(Token, out);
}

Token StrToken(int col, int row, const char* str) {
    libKudoaLexer_kref_lexer_kudoa_tokens_StrToken out = LIB_KUDOA_LEXER.tokens.StrToken.StrToken(col, row, str);
    return TO(Token, out);
}

}