package com.saachifashion.app.modules.notificationfeed.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationFeedModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.lbl_feed)

)
