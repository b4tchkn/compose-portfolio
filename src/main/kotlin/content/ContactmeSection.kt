package content

import androidx.compose.runtime.Composable
import components.BouncedButton
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun ContactmeSection() {
    Div(attrs = {
        style {
            marginTop(120.px)
        }
    }) {
        BouncedButton(href = "mailto:baaaakkrad@gmail.com", title = "Contact me")
    }
}
