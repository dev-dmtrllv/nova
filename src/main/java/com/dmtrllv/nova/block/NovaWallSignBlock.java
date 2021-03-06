package com.dmtrllv.nova.block;

import com.dmtrllv.nova.tileentity.NovaSignTileEntity;

import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class NovaWallSignBlock extends WallSignBlock
{

	public NovaWallSignBlock(Properties p_i225766_1_, WoodType p_i225766_2_)
	{
		super(p_i225766_1_, p_i225766_2_);
	}

	@Override
	public TileEntity newBlockEntity(IBlockReader p_196283_1_)
	{
		return new NovaSignTileEntity();
	}
}
