package com.example.andromonth.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.andromonth.R

data class Day(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descRes: Int
)

object DayRepo {
    val days = listOf(
        Day(R.drawable.a1, R.string.title0, R.string.desc0),
        Day(R.drawable.a2, R.string.title1, R.string.desc1),
        Day(R.drawable.a3, R.string.title2, R.string.desc2),
        Day(R.drawable.a4, R.string.title3, R.string.desc3),
        Day(R.drawable.a5, R.string.title4, R.string.desc4),
        Day(R.drawable.a5, R.string.title5, R.string.desc5),
        Day(R.drawable.a7, R.string.title6, R.string.desc6),
        Day(R.drawable.a8, R.string.title7, R.string.desc7),
        Day(R.drawable.a9, R.string.title8, R.string.desc8),
        Day(R.drawable.a10, R.string.title9, R.string.desc9),
        Day(R.drawable.a11, R.string.title10, R.string.desc10),
        Day(R.drawable.a12, R.string.title11, R.string.desc11),
        Day(R.drawable.a13, R.string.title12, R.string.desc12),
        Day(R.drawable.a14, R.string.title13, R.string.desc13),
        Day(R.drawable.a15, R.string.title14, R.string.desc14),
        Day(R.drawable.a16, R.string.title15, R.string.desc15),
        Day(R.drawable.a17, R.string.title16, R.string.desc16),
        Day(R.drawable.a18, R.string.title17, R.string.desc17),
        Day(R.drawable.a19, R.string.title18, R.string.desc18),
        Day(R.drawable.a20, R.string.title19, R.string.desc19),
        Day(R.drawable.a21, R.string.title20, R.string.desc20),
        Day(R.drawable.a22, R.string.title21, R.string.desc21),
        Day(R.drawable.a23, R.string.title22, R.string.desc22),
        Day(R.drawable.a24, R.string.title23, R.string.desc23),
        Day(R.drawable.a25, R.string.title24, R.string.desc24),
        Day(R.drawable.a26, R.string.title25, R.string.desc25),
        Day(R.drawable.a27, R.string.title26, R.string.desc26),
        Day(R.drawable.a28, R.string.title27, R.string.desc27),
        Day(R.drawable.a29, R.string.title28, R.string.desc28),
        Day(R.drawable.a30, R.string.title29, R.string.desc29)
    )
}