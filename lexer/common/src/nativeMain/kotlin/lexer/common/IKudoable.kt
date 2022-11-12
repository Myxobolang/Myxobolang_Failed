package lexer.common

interface IKudoable {
    fun toKudoa(): String
    fun fromKudoa(kudoa: String)
}