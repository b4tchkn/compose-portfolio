package components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import style.AppStyleSheet
import style.TextStyleSheet

@Composable
fun BouncedButton(href: String, title: String) {
    A(
        attrs = {
            classes(AppStyleSheet.bouncedButton, AppStyleSheet.bouncedButtonSpan)
        },
        href = href,
    ) {
        Div(attrs = {
            classes(TextStyleSheet.caption)
        }) {
            Text(title)
        }
    }
}