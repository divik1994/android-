package com.saachifashion.app.modules.notificationoffer.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationOfferModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNotification: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notification)

)
