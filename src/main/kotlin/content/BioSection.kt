package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.css.marginLeft
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text
import style.AppStyleSheet
import style.Container.bioContainer
import style.Container.infoDescriptionContainer
import style.Container.infoNameContainer
import style.TextStyleSheet

@Composable
fun BioSection() {
    Div(attrs = {
        classes(bioContainer)
    }) {
        InfoSection()
        Div(attrs = { style { marginLeft(32.px) } }) {
            Icon()
        }
    }
}

@Composable
private fun InfoSection() {
    Div(attrs = {
        style {
            flexDirection(FlexDirection.Column)
            display(DisplayStyle.Flex)
        }
    }) {
        Div(attrs = {
            classes(TextStyleSheet.textWithFont)
            classes(infoNameContainer)
        }) {
            Text("Kakeru Nakabachi / batch")
        }
        Div(attrs = {
            style {
                marginTop(16.px)
            }
            classes(TextStyleSheet.textWithFont)
            classes(infoDescriptionContainer)
        }) {
            Text("Mobile App Developer - Android, Flutter")
        }
    }
}

@Composable
private fun Icon() {
    Img(src = "icon.png", attrs = { classes(AppStyleSheet.icon) })
}
