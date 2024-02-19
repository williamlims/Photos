package br.com.photos.ui

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.photos.R
import br.com.photos.adapter.PhotoAdapter
import br.com.photos.adapter.PhotoImageAdapter
import br.com.photos.databinding.ActivityMainBinding
import br.com.photos.model.Photo

class MainActivity : AppCompatActivity() {
    private val amb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val photoList: MutableList<Photo> = mutableListOf()
    private val productAdapter: PhotoAdapter by lazy {
        PhotoAdapter(this, photoList)
    }
    private val photoImageList: MutableList<Bitmap> = mutableListOf()
    private val photoImageAdapter: PhotoImageAdapter by lazy {
        PhotoImageAdapter(this, photoImageList)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)

        setSupportActionBar(amb.mainTb.apply {
            title = getString(R.string.app_name)
        })



    }
}