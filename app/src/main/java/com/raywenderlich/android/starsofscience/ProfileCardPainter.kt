package com.raywenderlich.android.starsofscience

import android.graphics.Canvas
import android.graphics.Paint
import androidx.annotation.ColorInt
import com.raywenderlich.android.starsofscience.utils.RectFFactory

class ProfileCardPainter(
    @ColorInt private val color: Int
) : Painter {
    override fun paint(canvas: Canvas) {
        val width = canvas.width.toFloat()
        val height = canvas.height.toFloat()

        val shapeBounds = RectFFactory.fromLTWH(0f, 0f, width, height)

        val paint = Paint()
        paint.color

        canvas.drawRect(shapeBounds, paint)
    }
}