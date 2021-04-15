package ink.ptms.chemdah

import ink.ptms.chemdah.api.ChemdahAPI
import ink.ptms.chemdah.core.conversation.theme.chest.ThemeChest
import io.izzel.taboolib.loader.Plugin
import io.izzel.taboolib.module.config.TConfig
import io.izzel.taboolib.module.inject.TInject

object Chemdah : Plugin() {

    @TInject(migrate = true, locale = "language")
    lateinit var conf: TConfig
        private set

    override fun allowHotswap() = false

}
