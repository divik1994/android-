package com.saachifashion.app.modules.writereviewfill.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saachifashion.app.modules.writereviewfill.`data`.model.WriteReviewFillModel

public class WriteReviewFillVM : ViewModel() {
  public val writeReviewFillModel: MutableLiveData<WriteReviewFillModel> =
      MutableLiveData(WriteReviewFillModel())
}
