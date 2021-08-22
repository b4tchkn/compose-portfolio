package components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Img
import style.AppStyleSheet

@Composable
fun SocialIconButton(link: SocialLink) {
    A(attrs = {
        classes(AppStyleSheet.socialIconButton)
        target(ATarget.Blank)
    }, href = link.url) {
        Img(attrs = {
            classes(AppStyleSheet.socialIcon)
        }, src = link.icon)
    }
}

data class SocialLink(
    val url: String,
    val title: String,
    val icon: String
)
