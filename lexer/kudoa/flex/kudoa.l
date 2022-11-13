%option noyywrap

%{
#include "../../kotlinWrapper.hh"
int row = 0;
int col = 0;
%}

TokenAsc [\x21-\x5a\x5e-\x7a\x7c\x7e]

TokenSpecial (\\\{)|(\\\})|(\\\[)|(\\\])|(\\)

U [\x80-\xbf]
U2 [\xc2-\xdf]
U3 [\xe0-\xef]
U4 [\xf0-\xf4]
Utf8 {U2}{U}|{U3}{U}{U}|{U4}{U}{U}{U}

%%
\{ { addToken(LCBRToken(col, row)); col += yyleng; }
\} { addToken(RCBRToken(col, row)); col += yyleng; }
\[ { addToken(LSBRToken(col, row)); col += yyleng; }
\] { addToken(RSBRToken(col, row)); col += yyleng; }
lang { addToken(LangToken(col, row)); col += yyleng; }
row { addToken(RowToken(col, row)); col += yyleng; }
token { addToken(TokenToken(col, row)); col += yyleng; }
({TokenAsc}|{TokenSpecial}|{Utf8})+ { addToken(StrToken(col, row, yytext)); col += yyleng; }
\n {col = 0; row++; }
. { col += yyleng; }
%%

void lex(const char* fileName) {
    if((int)fileName != 0) {
        FILE *file;
	    file = fopen(fileName,"r");
	    if(file)
    	    yyin = file;
    }

    yylex();
    LIB_KUDOA_LEXER.KudoaTokenStream.setCurrent(stream);
}
