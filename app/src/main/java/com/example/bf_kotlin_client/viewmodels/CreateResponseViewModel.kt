package com.example.bf_kotlin_client.viewmodels

import android.widget.Toast
import androidx.databinding.ObservableField
import com.example.bf_kotlin_client.apiworkers.ResponseApiWorker
import com.example.bf_kotlin_client.dtos.entities.*
import com.example.bf_kotlin_client.utils.AppFragmentManager
import com.example.bf_kotlin_client.utils.GlobalVariables

class CreateResponseViewModel {
    var fragmentManager= GlobalVariables.instance.fragmentManager
    var responseApiWorker = ResponseApiWorker()
    var comment = ObservableField("")
    var offer=Offer()
    fun create() {
        var seller=GlobalVariables.instance.buyer
        var response= Response(0,offer.totalPrice,comment.get().toString(),offer.id,seller.id)
        responseApiWorker.create(response,::successCallbackFunction)
    }

    private fun successCallbackFunction(data: String?) {
        if (data.equals("OK")){
            fragmentManager.showTab(AppFragmentManager.FragmentsName.OffersFragment)
            Toast.makeText(GlobalVariables.instance.applicationContext,"success",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(GlobalVariables.instance.applicationContext,data, Toast.LENGTH_LONG).show()
        }
    }
}