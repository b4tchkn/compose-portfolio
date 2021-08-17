import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.alignItems
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.position
import org.jetbrains.compose.web.css.selectors.id
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
    }

    init {
        id("root") style {
            position(Position.Relative)
        }
    }
}