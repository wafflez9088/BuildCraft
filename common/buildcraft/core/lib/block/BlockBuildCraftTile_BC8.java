package buildcraft.core.lib.block;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;

public abstract class BlockBuildCraftTile_BC8 extends BlockBuildCraftBase_BC8 implements ITileEntityProvider {
    public BlockBuildCraftTile_BC8(Material materialIn) {
        super(materialIn);
    }
}