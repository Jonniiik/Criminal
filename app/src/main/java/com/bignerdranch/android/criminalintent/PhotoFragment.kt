package com.bignerdranch.android.criminalintent

import android.app.Dialog
import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.DialogFragment

private const val ARG_PHOTO = "photo"

class PhotoFragment : DialogFragment() {

    companion object {
        fun newInstance(bitmapPhoto: Bitmap): PhotoFragment {
            val args = Bundle().apply {
                putParcelable(ARG_PHOTO, bitmapPhoto)
            }

            return PhotoFragment().apply {
                arguments = args
            }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val imageView = ImageView(context)

        imageView.setImageBitmap(arguments?.getParcelable(ARG_PHOTO))

        val builder = androidx.appcompat.app.AlertDialog
            .Builder(context!!)
            .setView(imageView)

        return builder.create()
    }
}