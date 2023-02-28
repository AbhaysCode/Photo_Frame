package com.example.photoframe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.photoframe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var currentImage = 0
    val intro = arrayOf("Virat Kohli","Mahendra Singh Dhoni","Steve Jobs","Khabib Nurmagomedov")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.prevButton.setOnClickListener{
            val currentImageString = "pic$currentImage"
            val currentImageIntId = this.resources.getIdentifier(currentImageString,"id",packageName)
            val currentImageView = findViewById<ImageView>(currentImageIntId)
            currentImageView.alpha = 0f

            currentImage = (4 + currentImage-1)%4
            val imageToShowString = "pic$currentImage"
            val imageToShowIntId = this.resources.getIdentifier(imageToShowString,"id",packageName)
            val imageToShowImageView = findViewById<ImageView>(imageToShowIntId)
            imageToShowImageView.alpha = 1f

            binding.tvLabel.text = intro[currentImage]
        }

        binding.nextButtton.setOnClickListener{
            val currentImageString = "pic$currentImage"
            val currentImageIntId = this.resources.getIdentifier(currentImageString,"id",packageName)
            val currentImageView = findViewById<ImageView>(currentImageIntId)
            currentImageView.alpha = 0f

            currentImage = (4 + currentImage+1)%4
            val imageToShowString = "pic$currentImage"
            val imageToShowIntId = this.resources.getIdentifier(imageToShowString,"id",packageName)
            val imageToShowImageView = findViewById<ImageView>(imageToShowIntId)
            imageToShowImageView.alpha = 1f

            binding.tvLabel.text = intro[currentImage]
        }

    }
}