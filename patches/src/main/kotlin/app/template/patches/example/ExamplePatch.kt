package app.template.patches.example

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.shared.Constants.COMPATIBILITY_ZALO

private const val EXTENSION_CLASS = "Lapp/template/extension/ExamplePatch;"

@Suppress("unused")
val zaloPatch = bytecodePatch(
    name = "Zalo Patch",
    description = "Patch for Zalo 26.08.1.",
    default = true
) {
    compatibleWith(COMPATIBILITY_ZALO)

    dependsOn(internalPatch)

    extendWith("extensions/extension.mpe")

    execute {
        AdLoaderFingerprint.method.addInstructions(
            0,
            """
                invoke-static {}, $EXTENSION_CLASS;->showAds()Z
                move-result v0
                return v0
            """
        )
    }
}
