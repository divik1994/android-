package com.saachifashion.app.modules.listcategory.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class ListCategoryModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHighHeels: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_high_heels)

)
