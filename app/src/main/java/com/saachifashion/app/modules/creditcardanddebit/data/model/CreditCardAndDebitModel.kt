package com.saachifashion.app.modules.creditcardanddebit.`data`.model

import com.saachifashion.app.R
import com.saachifashion.app.appcomponents.di.MyApp
import kotlin.String

public data class CreditCardAndDebitModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreditCardAnd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_card_and)

)
