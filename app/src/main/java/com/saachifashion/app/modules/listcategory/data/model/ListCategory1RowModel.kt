package com.saachifashion.app.modules.listcategory.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class ListCategory1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt)

)
