package com.saachifashion.app.modules.notification2.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class Notification3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTransactionNik: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_nik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCulpaCillumCo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_culpa_cillum_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtApril302014: String? =
      MyApp.getInstance().resources.getString(R.string.msg_april_30_2014)

)
