package lexer.kudoa.tokens

import lexer.common.Token

class RCBRToken(col: Int, row: Int) : Token(col, row) {
    override fun name(): String {
        return "rcbr"
    }

    override fun kudoaBody(): List<String> {
        return emptyList()
    }
}