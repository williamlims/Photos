package br.com.photos.model

data class PhotoList(
    val limit: Int,
    val photos: List<Photo>,
    val skip: Int,
    val total: Int
)