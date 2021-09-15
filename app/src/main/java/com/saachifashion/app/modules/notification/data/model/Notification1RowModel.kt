package com.saachifashion.app.modules.notification.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class Notification1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)

)
