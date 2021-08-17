import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Hr
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Span({ classes(AppStyleSheet.centerContainer) }) {
            P {
                Text("Full Your Name")
                Br()
                Text("Description....")
            }
        }
    }
}
