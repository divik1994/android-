package com.saachifashion.app.modules.reviewproduct.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewProductModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt5Review: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_review)

)