import components.Layout
import content.BioSection
import content.ContactmeSection
import content.DividerSection
import content.Footer
import content.SocialInfoSection
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import style.AppStyleSheet

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Layout {
            BioSection()
            DividerSection()
            SocialInfoSection()
            ContactmeSection()
            Footer()
        }
    }
}
