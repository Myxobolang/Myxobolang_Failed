package lexer.kudoa.tokens

import lexer.common.Token

class TokenToken(col: Int, row: Int) : Token(col, row) {
    override fun name(): String {
        return "token"
    }

    override fun kudoaBody(): List<String> {
        return emptyList()
    }
}