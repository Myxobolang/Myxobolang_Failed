package lexer.common

interface ITokenIStream {
    operator fun get(index: Int): Token
    fun nextToken(): Token
    fun toKudoa(): String
}