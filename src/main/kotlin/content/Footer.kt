package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Text
import style.AppStyleSheet
import style.TextStyleSheet

@Composable
fun Footer() {
    org.jetbrains.compose.web.dom.Footer(attrs = { classes(AppStyleSheet.footer, TextStyleSheet.caption) }) {
        Text("© 2021 · Powered by Jetpack Compose")
    }
}
