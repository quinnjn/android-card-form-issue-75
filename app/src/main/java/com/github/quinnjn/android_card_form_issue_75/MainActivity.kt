package com.github.quinnjn.android_card_form_issue_75

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.braintreepayments.cardform.view.CardForm

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardForm = findViewById<CardForm>(R.id.card_form)

        cardForm.cardRequired(true)
            .expirationRequired(true)
            .cvvRequired(true)
            .cardholderName(CardForm.FIELD_REQUIRED)
            .postalCodeRequired(true)
            .mobileNumberRequired(true)
            .mobileNumberExplanation("SMS is required on this number")
            .actionLabel("Purchase")
            .setup(this)
    }
}
