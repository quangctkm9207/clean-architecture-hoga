package com.quangnguyen.hoga.domain.repository

import com.quangnguyen.hoga.domain.model.Image
import io.reactivex.Single

interface ImageRepository {

  fun loadTrendingImages(): Single<List<Image>>

  fun searchImages(keyword: String): Single<List<Image>>

  fun getImage(imageId: String): Single<Image>
}