import java.security.MessageDigest

class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("HelloWorld")
            var objectMain: Main
            objectMain = Main()
            println(objectMain.md5("HOLAMUNDO"))

        }
    }

    @OptIn(ExperimentalStdlibApi::class)
    fun md5(cadena: String): String {
        val md = MessageDigest.getInstance("MD5")
        val digest = md.digest(cadena.toByteArray())
        return digest.toHexString()
    }
}