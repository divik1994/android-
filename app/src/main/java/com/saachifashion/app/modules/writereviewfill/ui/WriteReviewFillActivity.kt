package com.saachifashion.app.modules.writereviewfill.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.saachifashion.app.R
import com.saachifashion.app.databinding.ActivityWriteReviewFillBinding
import com.saachifashion.app.modules.writereviewfill.`data`.viewmodel.WriteReviewFillVM
import kotlin.String
import kotlin.Unit

public class WriteReviewFillActivity : AppCompatActivity() {
  private lateinit var binding: ActivityWriteReviewFillBinding

  private val viewModel: WriteReviewFillVM by viewModels<WriteReviewFillVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_write_review_fill)
    binding.lifecycleOwner = this
    binding.writeReviewFillVM = viewModel
  }

  public companion object {
    public const val TAG: String = "WRITE_REVIEW_FILL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WriteReviewFillActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
