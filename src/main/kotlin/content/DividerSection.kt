package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.background
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.paddingBottom
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Hr

@Composable
fun DividerSection() {
    Div(attrs = {
        style {
            paddingTop(16.px)
            paddingBottom(16.px)
        }
    }) {
        Divider(720.px)
    }
}

@Composable
private fun Divider(width: CSSNumeric, color: String = "#00000044") {
    Hr(attrs = {
        style {
            height(1.px)
            width(width)
            border {
                height(1.px)
                width(100.vw)
                background(color)
            }
        }
    })
}
