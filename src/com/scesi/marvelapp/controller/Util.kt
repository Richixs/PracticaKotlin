package com.scesi.marvelapp.controller
import java.security.MessageDigest

fun main() {
    val publicKey: String = "4b576ce05356aa492171ef1556829c0a"
    val privateKey: String = "45318a8c2bf7cad2890a4495d26534193d7797a1"
    var timestamp : Long = getTimestamp()
    var hash: String = md5(timestamp.toString()+privateKey+publicKey)
    println(hash)
    var url: String = "http://gateway.marvel.com/v1/public/comics"
    url = url + "?" + "ts=" + timestamp + "&apikey=" + publicKey + "&hash=" + hash
    println(url)
    //http://gateway.marvel.com/v1/public/comics?ts=1&apikey=1234&hash=ffd275c5130566a2916217b101f26150
    /*

    http://gateway.marvel.com/v1/public/comics?ts=1721358680080&apikey=4b576ce05356aa492171ef1556829c0a&hash=91cd5e446a52f6650fdcb8d0c2893b92
    */
}

@OptIn(ExperimentalStdlibApi::class)
fun md5(cadena: String): String {
    val md = MessageDigest.getInstance("MD5")
    val digest = md.digest(cadena.toByteArray())
    return digest.toHexString()
}

fun getTimestamp(): Long {
    val currentTimestamp = System.currentTimeMillis()
    return currentTimestamp
}
