import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.px

object TextStyleSheet : StyleSheet(AppStyleSheet) {
    val large by style {
        fontSize(32.px)
        fontWeight(800)
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }
    val medium by style {
        fontSize(24.px)
        fontWeight(800)
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }
    val small by style {
        fontSize(16.px)
        fontWeight(800)
        property(
            "font-family",
            "Lato, Noto Sans JP, system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif",
        )
    }
}
