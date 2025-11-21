package com.example.project_group08

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var gameView: GameView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 建立 GameView 並設為主視圖
        gameView = GameView(this)
        setContentView(gameView)
    }
}