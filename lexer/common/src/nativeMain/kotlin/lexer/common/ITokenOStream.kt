package lexer.common

interface ITokenOStream {
    val size: Int
    fun addToken(token: Token)
}