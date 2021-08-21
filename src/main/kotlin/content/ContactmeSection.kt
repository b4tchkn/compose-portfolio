package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import style.AppStyleSheet
import style.TextStyleSheet

@Composable
fun ContactmeSection() {
    Div(attrs = {
        style {
            marginTop(120.px)
        }
    }) {
        ContactmeButton()
    }
}

@Composable
private fun ContactmeButton() {
    A(
        attrs = {
            classes(AppStyleSheet.bounceButton, AppStyleSheet.bounceButtonSpan)
        },
        href = "mailto:baaaakkrad@gmail.com",
    ) {
        Div(attrs = {
            classes(TextStyleSheet.caption)
        }) {
            Text("Contact me")
        }
    }
}
