package br.com.photos.model

import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class PhotoJSONAPI(context: Context) {

    companion object {
        const val PHOTO_ENDPOINT = "https://jsonplaceholder.typicode.com/photos"

        @Volatile
        private var INSTANCE: PhotoJSONAPI? = null

        fun getInstance(context: Context) = INSTANCE ?: synchronized(this) {
            INSTANCE ?: PhotoJSONAPI(context).also {
                INSTANCE = it
            }
        }
    }

    private val requestQueue: RequestQueue by lazy {
        Volley.newRequestQueue(context.applicationContext)
    }

    fun <T> addToRequestQueue(request: Request<T>) {
        requestQueue.add(request)
    }

}