package com.saachifashion.app.modules.favoriteproduct.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class FavoriteProductModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFavoriteProduc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_favorite_produc)

)
