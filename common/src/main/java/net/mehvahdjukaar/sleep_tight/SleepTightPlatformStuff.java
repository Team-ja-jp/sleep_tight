package net.mehvahdjukaar.sleep_tight;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.mehvahdjukaar.sleep_tight.core.PlayerSleepData;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class SleepTightPlatformStuff {

    @Contract
    @ExpectPlatform
    public static PlayerSleepData getPlayerSleepData(@NotNull Player player) {
        throw new AssertionError();
    }

    @Contract
    @ExpectPlatform
    public static Player.BedSleepingProblem invokeSleepChecksEvents(Player player, BlockPos pos) {
        throw new AssertionError();
    }
}
