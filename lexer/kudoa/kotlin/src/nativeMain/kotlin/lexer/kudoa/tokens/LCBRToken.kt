package lexer.kudoa.tokens

import lexer.common.Token

class LCBRToken(col: Int, row: Int) : Token(col, row) {
    override fun name(): String {
        return "lcbr"
    }

    override fun kudoaBody(): List<String> {
        return emptyList()
    }
}