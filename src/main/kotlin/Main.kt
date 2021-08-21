import content.BioSection
import content.ContactmeSection
import content.DividerSection
import content.Footer
import content.SocialInfoSection
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.renderComposable
import style.AppStyleSheet

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Div(attrs = {
            classes(AppStyleSheet.centerContainer)
        }) {
            BioSection()
            DividerSection()
            SocialInfoSection()
            ContactmeSection()
            Footer()
        }
    }
}
