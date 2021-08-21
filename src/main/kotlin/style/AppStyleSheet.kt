package style

import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.alignItems
import org.jetbrains.compose.web.css.background
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.bottom
import org.jetbrains.compose.web.css.boxSizing
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.left
import org.jetbrains.compose.web.css.letterSpacing
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
        height(64.px)
        width(64.px)
        backgroundColor(Color("transparent"))
        display(DisplayStyle.LegacyInlineFlex)

        hover(self) style {
            backgroundColor(rgba(0, 0, 0, 0.1))
            borderRadius(50.pc)
        }

        media(mediaMaxWidth(640.px)) {
            self style {
                marginRight(0.px)
                marginLeft(0.px)
            }
        }
    }

    val bouncedButton by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        height(44.px)
        width(240.px)
        boxSizing("border-box")
        color(Color("#000000"))
        letterSpacing(0.1.em)
        textDecoration("none")
        position(Position.Relative)
    }

    val bouncedButtonSpan by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        height(44.px)
        width(240.px)
        background("#FFFFFF")
        border {
            width = 1.px
            style = LineStyle.Solid
            color = Color("#000000")
        }
        boxSizing("border-box")
        top((-6).px)
        left((-6).px)
        property("transition-duration", "0.2s")
        property("box-shadow", "0px 5px 12px #CCCCCC, -6px -6px 12px #FFF")
        hover(self) style {
            left((-1).px)
            top((-1).px)
            property("box-shadow", "0px 0px 4px #000000, -2px -2px 4px #FFF")
        }
    }
}