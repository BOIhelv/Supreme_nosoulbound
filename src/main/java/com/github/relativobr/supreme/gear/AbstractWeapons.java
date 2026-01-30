package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockGearFabricator;
import com.github.relativobr.supreme.util.EnchantsAndEffectsUtil;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.ItemTier;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.inventory.ItemStack;

public class AbstractWeapons extends SlimefunItem implements NotPlaceable {

  @ParametersAreNonnullByDefault
  public AbstractWeapons(@Nonnull SlimefunItemStack stack, ItemStack[] recipe) {
    super(ItemGroups.WEAPONS_CATEGORY, stack, MultiBlockGearFabricator.getMachine(), recipe);
  }

  public static void setup(Supreme sup) {

    // add Enchant
    EnchantsAndEffectsUtil.addGearBasicEnchants(WeaponsBasic.AURUM_SWORD);

  
   

   
  
    final AbstractWeapons aurumSword = new AbstractWeapons(WeaponsBasic.AURUM_SWORD, WeaponsBasic.RECIPE_AURUM_SWORD);
    aurumSword.register(sup);
  
  }
}
