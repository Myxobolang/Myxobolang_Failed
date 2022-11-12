package lexer.common

abstract class Token(val col: Int, val row: Int) {
    abstract fun name(): String
    abstract fun kudoaBody(): List<String>
    fun toKudoa(): String {
        val body = kudoaBody()
        val bodyLen = body.size
        var bodyKudoa = ""
        for (s in body) {
            bodyKudoa += "[$s]"
        }
        return  "{[token][${bodyLen + 1}]$bodyKudoa}"
    }
    override fun toString(): String {
        return toKudoa()
    }
}