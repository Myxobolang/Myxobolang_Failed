package lexer.kudoa.tokens

import lexer.common.Token

class StrToken(col: Int, row: Int, val value: String) : Token(col, row) {
    override fun name(): String {
        return "str"
    }

    override fun kudoaBody(): List<String> {
        return listOf(value)
    }
}