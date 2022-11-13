#ifndef __LEXER_KUDOA_FLEX_KUDOA_LEXER_H__
#define __LEXER_KUDOA_FLEX_KUDOA_LEXER_H__
#include "kotlinWrapper.hh"

#ifdef __cplusplus
extern "C" {
#endif

void lexStdin();
void lex(const char* fileName);
const char* lexResult();

#ifdef __cplusplus
}  /* extern "C" */
#endif

#endif