package lexer.kudoa.tokens

import lexer.common.Token

class RowToken(col: Int, row: Int) : Token(col, row) {
    override fun name(): String {
        return "row"
    }

    override fun kudoaBody(): List<String> {
        return emptyList()
    }
}