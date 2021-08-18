import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import style.AppStyleSheet
import style.AppStyleSheet.footer
import style.AppStyleSheet.icon
import style.AppStyleSheet.socialIconButton
import style.TextStyleSheet.caption
import style.TextStyleSheet.large
import style.TextStyleSheet.medium

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Div({ classes(AppStyleSheet.centerContainer) }) {
            Img(src = "icon.png", attrs = { classes(icon) })
            Div(attrs = { classes(large) }) {
                Text("Kakeru Nakabachi / batch")
            }
            Div(attrs = {
                style {
                    marginTop(16.px)
                }
                classes(medium)
            }) {
                Text("Mobile App Developer Android, Flutter")
            }
            Div(attrs = {
                style {
                    marginTop(8.px)
                }
            }) {
                SocialIconButton()
                SocialIconButton()
                SocialIconButton()
                SocialIconButton()
                SocialIconButton()
                SocialIconButton()
            }
        }
        Footer(attrs = { classes(footer, caption) }) {
            Text("© 2021 · Powered by Jetpack Compose")
        }
    }
}

@Composable
private fun SocialIconButton() {
    A(attrs = {
        classes(socialIconButton)
        target(ATarget.Blank)
    }, href = "https://compose-web.ui.pages.jetbrains.team/") {
        Img(src = "favicon-32x32.png") {}
    }
}
