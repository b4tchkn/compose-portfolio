package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.background
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.paddingBottom
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Div

@Composable
fun DividerSection() {
    Div(attrs = {
        style {
            paddingTop(16.px)
            paddingBottom(16.px)
        }
    }) {
        Divider()
    }
}

@Composable
private fun Divider(color: String = "#00000044") {
    Div(attrs = {
        style {
            width(70.vw)
            border {
                height(1.px)
                width(70.vw)
                background(color)
            }
        }
    })
}
