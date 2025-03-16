//
//  SimpleIOSButton.swift
//  iosApp
//
//  Created by Rakhimboy Adamboev Muzaffarovich on 16/03/25.
//  Copyright © 2025 orgName. All rights reserved.
//

import SwiftUI

struct SimpleIOSButton: View {
    var label: String
    var action: () -> Void
    
    var body: some View {
        Button(action: action) {
            Text(label)
                .font(.headline)
        }
    }
}
