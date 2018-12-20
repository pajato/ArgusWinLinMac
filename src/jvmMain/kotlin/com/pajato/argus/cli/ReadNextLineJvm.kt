package com.pajato.argus.cli

import com.pajato.io.KFile
import java.io.File

actual fun readNextLine(): String? = readLine()

actual fun redirectConsoleInput(file: KFile): Int {
    val inputFile = File(file.path)
    System.setIn(inputFile.inputStream())
    return 0
}