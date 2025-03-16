package xyz.teamgravity.kmpsharingnativeuicomponent

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.UIKitViewController

@Composable
actual fun NativeButton(
    onClick: () -> Unit,
    modifier: Modifier
) {
    val factory = LocalNativeViewFactory.current
    UIKitViewController(
        factory = {
            factory.createButtonView(
                label = "IOS Native button",
                onClick = onClick
            )
        },
        modifier = modifier
            .width(150.dp)
            .height(50.dp)
    )
}