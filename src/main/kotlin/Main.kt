import AppStyleSheet.footer
import TextStyleSheet.large
import TextStyleSheet.medium
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Div({ classes(AppStyleSheet.centerContainer) }) {
            Div(attrs = { classes(large) }) {
                Text("Kakeru Nakabachi / batch")
            }
            Div(attrs = { classes(medium) }) {
                Text("Mobile App Developer Android, Flutter")
            }
        }
        Footer(attrs = { classes(footer) }) {
            Text("This is Footer")
        }
    }
}
