package com.example.cabbooking.ui.customer.booking.pickup;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.cabbooking.model.User;

/**
 * View model for PickUpFragment
 */
public class PickupViewModel extends ViewModel {
    private MutableLiveData<User> currentUserObject;


    public PickupViewModel() {
        currentUserObject = new MutableLiveData<>();
    }

    public void setCurrentUserObject(User currentUserObject) {
        this.currentUserObject.setValue(currentUserObject);
    }

    public MutableLiveData<User> getCurrentUserObject(){
        return this.currentUserObject;
    }
}
