package com.saachifashion.app.modules.changepassword.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saachifashion.app.modules.changepassword.`data`.model.ChangePasswordModel

public class ChangePasswordVM : ViewModel() {
  public val changePasswordModel: MutableLiveData<ChangePasswordModel> =
      MutableLiveData(ChangePasswordModel())
}
