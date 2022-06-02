package com.bangkit.travens.presentation.ui.custom_component

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class PasswordEditText : AppCompatEditText {

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }


    private fun init() {

        addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {
                //do nothing
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s.toString().length < 6) {
                    error = "Password must be at least 6 character long"
                    requestFocus()
                }
                else if(!s.toString().matches(".*[A-Z].*".toRegex())){
                    error = "Must contain 1 Upper Case Character"
                }
                else if(!s.toString().matches(".*[a-z].*".toRegex())){
                    error = "Must contain 1 Lower-Case Character"
                }
                else if(!s.toString().matches(".*[@\$%^&+=].*".toRegex())){
                    error = "Must contain 1 Spesial Character (@\$%^&+=)"
                }
            }

            override fun afterTextChanged(s: Editable?) {
                //do nothing
            }
        })
    }
}