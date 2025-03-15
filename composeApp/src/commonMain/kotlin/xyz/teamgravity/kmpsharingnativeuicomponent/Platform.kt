package xyz.teamgravity.kmpsharingnativeuicomponent

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform