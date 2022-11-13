package lexer.kudoa.tokens

import lexer.common.Token

class LSBRToken(col: Int, row: Int) : Token(col, row) {
    override fun name(): String {
        return "lsbr"
    }

    override fun kudoaBody(): List<String> {
        return emptyList()
    }
}