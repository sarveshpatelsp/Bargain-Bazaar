package com.example.bargainbazaar.ui.myorder;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyOrderViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    public MyOrderViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }
    public LiveData<String> getText() {
        return mText;
    }
}