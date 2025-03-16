//
//  IOSNativeViewFactory.swift
//  iosApp
//
//  Created by Rakhimboy Adamboev Muzaffarovich on 16/03/25.
//  Copyright © 2025 orgName. All rights reserved.
//

import ComposeApp
import UIKit
import SwiftUI

class IOSNativeViewFactory: NativeViewFactory {
   static var shared = IOSNativeViewFactory()
   
    func createButtonView(label: String, onClick: @escaping () -> Void) -> UIViewController {
        let view = SimpleIOSButton(label: label, action: onClick)
        return UIHostingController(rootView: view)
    }
}
