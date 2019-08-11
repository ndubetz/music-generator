package model

import model.Note.values

enum class Note {
    C,
    C_SHARP_D_FLAT,
    D,
    D_SHARP_E_FLAT,
    E,
    F,
    F_SHARP_G_FLAT,
    G,
    G_SHARP_A_FLAT,
    A,
    A_SHARP_B_FLAT,
    B
}

fun notePlusOffset(note: Note, offset: Int): Note = values()[(note.ordinal + offset) % 12]

