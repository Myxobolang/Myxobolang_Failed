package lexer.common

abstract class TokenStream : ITokenIStream, ITokenOStream, IKudoable {
    private val tokens: ArrayList<Token> = arrayListOf()
    private var index = 0
    override operator fun get(index: Int): Token {
        return tokens[index + this.index]
    }

    override fun nextToken(): Token {
        index++
        return tokens[index]
    }

    abstract fun language(): String

    override fun toKudoa(): String {
        var out = "{[lang]${language()}}\n"
        var lastToken: Token? = null
        for (token in tokens) {
            out += token.toKudoa()
            if (lastToken != null && token.row > lastToken.row) {
                out += '\n'
            }
            lastToken = token
        }
        return out
    }

    override fun toString(): String {
        return toKudoa()
    }

    override val size: Int
        get() {
            return tokens.size - index
        }

    override fun addToken(token: Token) {
        tokens.add(token)
    }
}