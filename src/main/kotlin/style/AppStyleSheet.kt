package style

import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.alignItems
import org.jetbrains.compose.web.css.animation
import org.jetbrains.compose.web.css.background
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.bottom
import org.jetbrains.compose.web.css.boxSizing
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.left
import org.jetbrains.compose.web.css.lineHeight
import org.jetbrains.compose.web.css.marginLeft
import org.jetbrains.compose.web.css.marginRight
import org.jetbrains.compose.web.css.maxHeight
import org.jetbrains.compose.web.css.maxWidth
import org.jetbrains.compose.web.css.media
import org.jetbrains.compose.web.css.mediaMaxWidth
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.paddingBottom
import org.jetbrains.compose.web.css.pc
import org.jetbrains.compose.web.css.position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgba
import org.jetbrains.compose.web.css.selectors.hover
import org.jetbrains.compose.web.css.textDecoration
import org.jetbrains.compose.web.css.top
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Span

object AppStyleSheet : StyleSheet() {
    val centerContainer by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        width(100.vw)
        height(100.vh)
        background("#F1F1F1")
    }

    val footer by style {
        display(DisplayStyle.Flex)
        position(Position.Fixed)
        bottom(0.px)
        justifyContent(JustifyContent.Center)
        paddingBottom(16.px)
        alignItems(AlignItems.Center)
        width(100.vw)
    }

    val icon by style {
        maxWidth(120.px)
        maxHeight(120.px)
        borderRadius(50.pc)
    }

    val socialIconButton by style {
        marginRight(8.px)
        marginLeft(8.px)
        padding(12.px)
        backgroundColor(Color("transparent"))
        display(DisplayStyle.LegacyInlineFlex)

        hover(self) style {
            backgroundColor(rgba(0, 0, 0, 0.1))
            borderRadius(50.pc)
        }

        media(mediaMaxWidth(640.px)) {
            self style {
                marginRight(8.px)
                marginLeft(8.px)
            }
        }
    }

    val bounceButton by style {
        display(DisplayStyle.Flex)
        color(Color("black"))
        backgroundColor(Color("#FFFFFF"))
        fontSize(15.px)
        textDecoration("none")
        borderRadius(8.px)
        boxSizing("border-box")
        padding(12.px, 32.px)
        position(Position.Relative)
        property("width", "fit-content")
        property("box-shadow", "0px 5px 12px #CAD4E2, -6px -6px 12px #FFF")
        property("transition-duration", "0.2s")
    }

    val bounceButtonSpan by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        height(50.px)
        background("#fff")
        boxSizing("border-box")
        color(Color("#333"))
        textDecoration("none")
        property("box-shadow", "0px 5px 12px #CAD4E2, -6px -6px 12px #FFF")
        borderRadius(10.px)
        top((-5).px)
        left(0.px)
        property("transition-duration", "0.2s")

        hover(self) style {
            left(0.px)
            top(0.px)
            property("box-shadow", "0 0 4px #CAD4E2, -2px -2px 4px #FFF")
        }

    }
}