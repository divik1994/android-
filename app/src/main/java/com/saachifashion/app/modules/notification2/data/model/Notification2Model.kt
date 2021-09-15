package com.saachifashion.app.modules.notification2.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class Notification2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)

)
