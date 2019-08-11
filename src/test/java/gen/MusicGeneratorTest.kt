package gen

import model.Note.*
import model.*
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

internal class MusicGeneratorTest {
    @Test
    internal fun two_notes() {
        val notes = musicGenerator("cocco", C, naturalMinor)
        assertThat(notes).isEqualTo(listOf(D_SHARP_E_FLAT, C, D_SHARP_E_FLAT, D_SHARP_E_FLAT, C))
    }

    @Test
    internal fun three_notes() {
        val notes = musicGenerator("renee", G, majorScale)
        assertThat(notes).isEqualTo(listOf(C, D, F_SHARP_G_FLAT, D, D))
    }

    @Test
    internal fun ignore_spaces() {
        val notes = musicGenerator("nate dubetz", A_SHARP_B_FLAT, melodicMinor)
        assertThat(notes).isEqualTo(listOf(A, A_SHARP_B_FLAT, G, F, D_SHARP_E_FLAT, A, C, F, G, F))
    }

    @Test
    internal fun harmonic_minor() {
        val notes = musicGenerator("judge walters", D, harmonicMinor)
        assertThat(notes).isEqualTo(listOf(F, C_SHARP_D_FLAT, G, C_SHARP_D_FLAT, A, E, D, A, A_SHARP_B_FLAT, A, G, A))
    }
}