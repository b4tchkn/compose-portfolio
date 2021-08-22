package content

import androidx.compose.runtime.Composable
import components.SocialIconButton
import components.SocialLink
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun SocialInfoSection() {
    Div(attrs = {
        style {
            marginTop(8.px)
            flexDirection(FlexDirection.Row)
        }
    }) {
        socialLinks.forEach {
            SocialIconButton(link = it)
        }
    }
}

private val socialLinks: List<SocialLink> = listOf(
    SocialLink("https://github.com/b4tchkn", "GitHub", "github.png"),
    SocialLink("https://twitter.com/b4tchkn", "Twitter", "twitter.png"),
    SocialLink("https://www.facebook.com/kakeru.nakabachi", "Facebook", "facebook.png"),
    SocialLink("https://qiita.com/b4tchkn", "Qiita", "qiita.png"),
    SocialLink("https://speakerdeck.com/b4tchkn", "Speaker Deck", "speakerdeck.png"),
)
