package com.saachifashion.app.modules.shortby.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saachifashion.app.modules.shortby.`data`.model.ShortByModel

public class ShortByVM : ViewModel() {
  public val shortByModel: MutableLiveData<ShortByModel> = MutableLiveData(ShortByModel())
}