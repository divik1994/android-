package com.saachifashion.app.modules.address.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class AddressModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)

)
