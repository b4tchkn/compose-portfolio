package style

import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.px

object TextStyleSheet : StyleSheet(AppStyleSheet) {
    val textWithFont by style {
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }

    val textLarge by style {
        fontSize(32.px)
        fontWeight(800)
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }
    val textMedium by style {
        fontSize(24.px)
        fontWeight(800)
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }
    val textSmall by style {
        fontSize(16.px)
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }
    val caption by style {
        fontSize(12.px)
        property(
            "font-family",
            "-apple-system,Noto Sans JP, system-ui,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }
}
