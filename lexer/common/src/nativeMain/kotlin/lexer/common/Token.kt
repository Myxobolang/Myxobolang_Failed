package lexer.common

abstract class Token(val col: Int, val row: Int) {
    abstract fun toKudoa(): String
}