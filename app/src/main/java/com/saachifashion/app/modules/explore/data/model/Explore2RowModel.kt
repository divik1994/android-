package com.saachifashion.app.modules.explore.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDress: String? = MyApp.getInstance().resources.getString(R.string.lbl_dress)

)
