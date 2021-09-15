package com.saachifashion.app.modules.shipto.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saachifashion.app.modules.shipto.`data`.model.ShipTo1RowModel
import com.saachifashion.app.modules.shipto.`data`.model.ShipToModel
import kotlin.collections.MutableList

public class ShipToVM : ViewModel() {
  public val shipToModel: MutableLiveData<ShipToModel> = MutableLiveData(ShipToModel())

  public val recyclerViewList: MutableLiveData<MutableList<ShipTo1RowModel>> =
      MutableLiveData(mutableListOf())
}
