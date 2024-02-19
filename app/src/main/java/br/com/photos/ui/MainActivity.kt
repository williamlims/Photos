package br.com.photos.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.photos.R
import br.com.photos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)

    }
}