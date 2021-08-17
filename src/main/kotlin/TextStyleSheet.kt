import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.px

object TextStyleSheet : StyleSheet(AppStyleSheet) {
    val hero by style {
        fontSize(60.px)
        fontWeight(900)
    }
}
