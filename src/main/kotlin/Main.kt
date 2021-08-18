import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import style.AppStyleSheet
import style.AppStyleSheet.footer
import style.AppStyleSheet.icon
import style.AppStyleSheet.space
import style.TextStyleSheet.caption
import style.TextStyleSheet.large
import style.TextStyleSheet.medium

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Div({ classes(AppStyleSheet.centerContainer) }) {
            Img(src = "icon.png", attrs = {classes(icon)})
            Div(attrs = { classes(large) }) {
                Text("Kakeru Nakabachi / batch")
            }
            Div(attrs = { classes(space) }) { }
            Div(attrs = { classes(medium) }) {
                Text("Mobile App Developer Android, Flutter")
            }
        }
        Footer(attrs = { classes(footer, caption) }) {
            Text("© 2021 · Powered by Jetpack Compose")
        }
    }
}
