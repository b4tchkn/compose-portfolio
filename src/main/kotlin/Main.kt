import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.alignItems
import org.jetbrains.compose.web.css.background
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.marginLeft
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.paddingBottom
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Hr
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import style.AppStyleSheet
import style.AppStyleSheet.bounceButton
import style.AppStyleSheet.bounceButtonSpan
import style.AppStyleSheet.footer
import style.AppStyleSheet.icon
import style.AppStyleSheet.socialIconButton
import style.TextStyleSheet.caption
import style.TextStyleSheet.textLarge
import style.TextStyleSheet.textMedium
import style.TextStyleSheet.textSmall

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Div({
            classes(AppStyleSheet.centerContainer)
        }) {
            BioSection()
            Div(attrs = {
                style {
                    paddingTop(16.px)
                    paddingBottom(16.px)
                }
            }) {
                Divider(720.px)
            }
            ButtonsSection()
            Div(
                attrs = {
                    style {
                        marginTop(32.px)
                    }
                }
            ) {
                ContactmeButton()
            }
        }
        Footer(attrs = { classes(footer, caption) }) {
            Text("© 2021 · Powered by Jetpack Compose")
        }
    }
}

@Composable
private fun ContactmeButton() {
    A(
        attrs = {
            classes(bounceButton, bounceButtonSpan)
        },
        href = "mailto:baaaakkrad@gmail.com",
    ) {
        Div(attrs = {
            classes(textSmall)
        }) {
            Text("Contact me")
        }
    }
}


@Composable
private fun BioSection() {
    Div({
        style {
            flexDirection(FlexDirection.Row)
            display(DisplayStyle.Flex)
            alignItems(AlignItems.Center)
        }
    }) {
        InfoSection()
        Div(attrs = { style { marginLeft(32.px) } }) {
            Icon()
        }
    }
}

@Composable
private fun Icon() {
    Img(src = "icon.png", attrs = { classes(icon) })
}

@Composable
private fun Divider(width: CSSNumeric, color: String = "#00000044") {
    Hr(attrs = {
        style {
            height(1.px)
            width(width)
            border {
                height(1.px)
                width(100.vw)
                background(color)
            }
        }
    })
}

@Composable
private fun InfoSection() {
    Div(attrs = {
        style {
            flexDirection(FlexDirection.Column)
            display(DisplayStyle.Flex)
        }
    }) {
        Div(attrs = { classes(textLarge) }) {
            Text("Kakeru Nakabachi / batch")
        }
        Div(attrs = {
            style {
                marginTop(16.px)
            }
            classes(textMedium)
        }) {
            Text("Mobile App Developer - Android, Flutter")
        }
    }
}

@Composable
private fun ButtonsSection() {
    Div(attrs = {
        style {
            marginTop(8.px)
            flexDirection(FlexDirection.Row)
        }
    }) {
        SocialIconButton() // GitHub
        SocialIconButton() // Twitter
        SocialIconButton() // Facebook
        SocialIconButton() // Qiita
        SocialIconButton() // Speaker Deck
        SocialIconButton() // Mail
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
