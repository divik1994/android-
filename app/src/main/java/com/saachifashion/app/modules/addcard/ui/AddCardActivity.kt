package com.saachifashion.app.modules.addcard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.saachifashion.app.R
import com.saachifashion.app.databinding.ActivityAddCardBinding
import com.saachifashion.app.modules.addcard.`data`.viewmodel.AddCardVM
import com.saachifashion.app.modules.creditcardanddebit.ui.CreditCardAndDebitActivity
import kotlin.String
import kotlin.Unit

public class AddCardActivity : AppCompatActivity() {
  private lateinit var binding: ActivityAddCardBinding

  private val viewModel: AddCardVM by viewModels<AddCardVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_add_card)
    binding.lifecycleOwner = this
    binding.addCardVM = viewModel
    binding.btnAddCard.setOnClickListener {

      val destIntent = CreditCardAndDebitActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "ADD_CARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
