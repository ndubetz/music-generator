package gen

import model.Note
import model.notePlusOffset

fun musicGenerator(target: String, root: Note, pattern: IntArray): List<Note> {
    return target
        .filter { char -> char.isLetter() }
        .map { char ->
            val position = (char.toLowerCase().toInt() - 97) % pattern.size
            val notePlusOffset = notePlusOffset(root, pattern[position])
            println("$char : $position : $notePlusOffset")
            notePlusOffset
        }
}
