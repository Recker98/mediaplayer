package banuelos.hector.mediaplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class EjercicioActivity : AppCompatActivity() {
    lateinit var musfondo:MediaPlayer
    lateinit var respusuario:EditText
    lateinit var btncompro:Button
    lateinit var sonrespuesta:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio)
        musfondo: MediaPlayer? = MediaPlayer.create(this, R.raw.Tale-Of-Us-Nova)
        musfondo.isLooping=true
        musfondo?.start() // no need to call prepare(); create() does that for you

    }

}