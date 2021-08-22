package style

import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.alignItems
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.media
import org.jetbrains.compose.web.css.mediaMaxWidth
import org.jetbrains.compose.web.css.px

object Container : StyleSheet(AppStyleSheet) {
    val bioContainer by style {
        flexDirection(FlexDirection.Row)
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.Center)

        media(mediaMaxWidth(640.px)) {
            self style {
                flexDirection(FlexDirection.ColumnReverse)
                display(DisplayStyle.Flex)
                alignItems(AlignItems.Center)
            }
        }
    }

    val infoNameContainer by style {
        fontWeight(800)
        alignItems(AlignItems.Center)
        // Large
        fontSize(32.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                alignItems(AlignItems.Center)
                // Medium
                fontSize(24.px)
            }
        }
    }

    val infoDescriptionContainer by style {
        alignItems(AlignItems.Center)
        // Medium
        fontSize(24.px)

        media(mediaMaxWidth(640.px)) {
            self style {
                alignItems(AlignItems.Center)
                // Small
                fontSize(16.px)
            }
        }
    }
}