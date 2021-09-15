package com.saachifashion.app.modules.filter.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.saachifashion.app.R
import com.saachifashion.app.databinding.ActivityFilterBinding
import com.saachifashion.app.modules.filter.`data`.viewmodel.FilterVM
import com.saachifashion.app.modules.searchresult.ui.SearchResultActivity
import kotlin.String
import kotlin.Unit

public class FilterActivity : AppCompatActivity() {
  private lateinit var binding: ActivityFilterBinding

  private val viewModel: FilterVM by viewModels<FilterVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_filter)
    binding.lifecycleOwner = this
    binding.filterVM = viewModel
    binding.btnApply.setOnClickListener {

      val destIntent = SearchResultActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "FILTER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FilterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
