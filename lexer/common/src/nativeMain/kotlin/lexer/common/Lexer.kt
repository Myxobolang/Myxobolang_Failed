package lexer.common

abstract class Lexer {
    val tokens: ArrayDeque<Token> = ArrayDeque()
}