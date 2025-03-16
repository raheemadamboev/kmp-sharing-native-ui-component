package xyz.teamgravity.kmpsharingnativeuicomponent

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

val LocalNativeViewFactory: ProvidableCompositionLocal<NativeViewFactory> = staticCompositionLocalOf {
    error("No view factory provided.")
}

fun MainViewController(
    nativeViewFactory: NativeViewFactory
): UIViewController = ComposeUIViewController {
    CompositionLocalProvider(LocalNativeViewFactory provides nativeViewFactory) {
        App()
    }
}