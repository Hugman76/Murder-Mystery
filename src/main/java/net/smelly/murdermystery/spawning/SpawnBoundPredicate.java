package net.smelly.murdermystery.spawning;

import java.util.function.BiPredicate;

import com.mojang.serialization.Codec;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

/**
 * @author SmellyModder (Luke Tonon)
 */
public abstract class SpawnBoundPredicate<C> implements BiPredicate<ServerWorld, BlockPos.Mutable> {
	private final Codec<C> codec;
	
	public SpawnBoundPredicate(Codec<C> codec) {
		this.codec = codec;
	}
	
	public void loadConfig(C config) {}
	
	public Codec<C> getCodec() {
		return this.codec;
	}
}