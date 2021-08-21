package components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import style.AppStyleSheet

@Composable
fun Layout(content: @Composable () -> Unit) {
    Div(attrs = {
        classes(AppStyleSheet.centerContainer)
    }) {
        content()
    }
}
