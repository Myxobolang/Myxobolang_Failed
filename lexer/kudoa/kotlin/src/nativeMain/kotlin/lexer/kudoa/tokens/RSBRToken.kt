package lexer.kudoa.tokens

import lexer.common.Token

class RSBRToken(col: Int, row: Int) : Token(col, row) {
    override fun name(): String {
        return "rsbr"
    }

    override fun kudoaBody(): List<String> {
        return emptyList()
    }
}