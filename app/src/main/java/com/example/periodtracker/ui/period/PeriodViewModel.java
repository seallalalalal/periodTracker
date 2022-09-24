package com.example.periodtracker.ui.period;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PeriodViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PeriodViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is period fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}