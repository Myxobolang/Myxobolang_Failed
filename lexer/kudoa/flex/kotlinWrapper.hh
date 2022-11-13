#ifndef __LEXER_KUDOA_FLEX_KOTLIN_WRAPPER_H__
#define __LEXER_KUDOA_FLEX_KOTLIN_WRAPPER_H__

#ifdef __cplusplus
extern "C" {
#endif

#include "../kotlin/build/h/libKudoaLexer_api.h"
#include "../../common/build/h/libCommonLexer_api.h"

#define LIB_COMMON_LEXER (commonLexerLib->kotlin.root.lexer.common)
#define LIB_KUDOA_LEXER (kudoaLexerLib->kotlin.root.lexer.kudoa)
#define TO(target, source) (*((target*)(&(source))))

typedef libCommonLexer_kref_lexer_common_Token Token;
typedef libCommonLexer_kref_lexer_common_TokenStream TokenStream;
typedef libKudoaLexer_kref_lexer_kudoa_KudoaTokenStream KudoaTokenStream;

extern libCommonLexer_ExportedSymbols* commonLexerLib;
extern libKudoaLexer_ExportedSymbols* kudoaLexerLib;
extern KudoaTokenStream stream;

void addToken(Token token);

Token LCBRToken(int col, int row);

Token RCBRToken(int col, int row);

Token LSBRToken(int col, int row);

Token RSBRToken(int col, int row);

Token LangToken(int col, int row);

Token RowToken(int col, int row);

Token TokenToken(int col, int row);

Token StrToken(int col, int row, const char* str);

#ifdef __cplusplus
}  /* extern "C" */
#endif

#endif