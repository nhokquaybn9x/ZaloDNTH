package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {

    val COMPATIBILITY_ZALO = Compatibility(
        name = "Zalo",
        packageName = "com.zing.zalo",
        apkFileType = ApkFileType.APK,
        appIconColor = 0xFF0068FF,
        targets = listOf(
            AppTarget(
                version = "26.08.1"
            )
        )
    )
}
