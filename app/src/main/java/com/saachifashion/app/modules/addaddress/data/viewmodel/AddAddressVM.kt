package com.saachifashion.app.modules.addaddress.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saachifashion.app.modules.addaddress.`data`.model.AddAddressModel

public class AddAddressVM : ViewModel() {
  public val addAddressModel: MutableLiveData<AddAddressModel> = MutableLiveData(AddAddressModel())
}