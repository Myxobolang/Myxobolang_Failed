package lexer.kudoa

import lexer.common.TokenStream
import kotlin.native.concurrent.AtomicReference
import kotlin.native.concurrent.freeze

class KudoaTokenStream : TokenStream() {
    companion object {
        val currentStream = AtomicReference(KudoaTokenStream().freeze())
    }

    override fun language(): String {
        return "kudoa"
    }

    override fun fromKudoa(kudoa: String) {}

    fun setCurrent() {
        currentStream.value = freeze()
    }
}