package lexer.kudoa.tokens

import lexer.common.Token

class LangToken(col: Int, row: Int) : Token(col, row) {
    override fun name(): String {
        return "lang"
    }

    override fun kudoaBody(): List<String> {
        return emptyList()
    }
}