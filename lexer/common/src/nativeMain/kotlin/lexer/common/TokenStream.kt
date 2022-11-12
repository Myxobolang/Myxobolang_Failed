package lexer.common

class TokenStream : ITokenIStream, ITokenOStream {
    private val tokens: ArrayList<Token> = arrayListOf()
    private var index = 0
    override operator fun get(index: Int): Token {
        return tokens[index]
    }
    override fun nextToken(): Token {
        index++
        return tokens[index]
    }

    override fun toKudoa(): String {
        var out = ""
        var lastToken: Token? = null
        for(token in tokens)
        {
            out += token.toKudoa()
            if(lastToken != null && token.row > lastToken.row) {
                out += '\n'
            }
            lastToken = token
        }
        return out
    }

    override fun addToken(token: Token) {
        tokens.add(token)
    }
}