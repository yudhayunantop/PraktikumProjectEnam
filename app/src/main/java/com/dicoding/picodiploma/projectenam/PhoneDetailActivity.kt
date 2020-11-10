package com.dicoding.picodiploma.projectenam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phone_detail.*
import kotlinx.android.synthetic.main.contact_list_item.*
import kotlinx.android.synthetic.main.contact_list_item.view.*

class PhoneDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        var intentThatStartThisActivity = getIntent()

        if (intentThatStartThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            var partId = intentThatStartThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partName = intentThatStartThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)

            textView.text = partName
            tv_item_id.text = partId
        }

    }
}