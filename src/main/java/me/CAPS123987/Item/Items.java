package me.CAPS123987.Item;

import java.util.LinkedHashMap;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.CAPS123987.BetterReactor.BetterReactor;
import me.CAPS123987.IIIDmultiblock.ReactorCore;
import net.md_5.bungee.api.ChatColor;

public class Items {
	
	
	
	public static final ItemGroup betterReactor = new ItemGroup(new NamespacedKey(BetterReactor.getInstance(),
	        "Better_Reactor"),
	        new CustomItemStack(Material.OBSIDIAN, "&d工业反应堆")
	    );
	
	public static final SlimefunItemStack REACTOR_CORE = new SlimefunItemStack("REACTOR_CORE_BNG",
			Material.MAGENTA_GLAZED_TERRACOTTA,
	        ChatColor.RESET+"反应堆堆芯",
	        "",
	        LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
	        LoreBuilder.powerBuffer(4096),
	        LoreBuilder.powerPerSecond(4096),
	        "&8\u21E8 &e\u26A1 &7"+"持续 "+ReactorCore.burnTime/2+"s",
	        "&8\u21E8 &e\u26A1 &7"+"总发电: 2.04M J",
	        "&7反应堆堆芯, &b可显示反应堆堆芯全息图"
	    );
	public static final SlimefunItemStack HEATED_COOLANT = new SlimefunItemStack("HEATED_COOLANT_BNG",
			"de4073be40cb3deb310a0be959b4cac68e825372728fafb6c2973e4e7c33",
	        ChatColor.RESET+"热化冷却液",
	        ""
	    );
	
	
	public static final SlimefunItemStack SUPER_FREEZER = new SlimefunItemStack("SUPER_FREEZER_BNG",
			Material.QUARTZ_BLOCK,
	        ChatColor.RESET+"超高速冻结装置",
	        "",
	        "&7(&c警告!&7 良好的物流需要更多的输入)",
	        "&7使水凝成冷却剂",
	        LoreBuilder.powerPerSecond(50)
	    );
	
	public static final SlimefunItemStack LEAD_BLOCK = new SlimefunItemStack("LEAD_BLOCK_BNG",
			Material.IRON_BLOCK,
	        ChatColor.RESET+"铅块",
	        "",
	        "&7反应堆堆芯全息图中的 &f白色 &7部分"
	    );
	
	public static final SlimefunItemStack LEAD_GLASS = new SlimefunItemStack("LEAD_GLASS_BNG",
			Material.GRAY_STAINED_GLASS,
			ChatColor.RESET+"铅晶质玻璃",
	        "",
	        "&7反应堆堆芯全息图中的 &8灰色 &7部分"
	    );
	
	public static final SlimefunItemStack BORIUM_ROD = new SlimefunItemStack("BORIUM_ROD_BNG",
			Material.ANCIENT_DEBRIS,
			ChatColor.RESET+"硼棒",
	        "",
	        "&7反应堆堆芯全息图中的 &6橙色 &7部分"
	    );
	
	public static final SlimefunItemStack BORIUM = new SlimefunItemStack("BORIUM_BNG",
			Material.GUNPOWDER,
			ChatColor.RESET+"硼",
	        ""
	    );
	public static final SlimefunItemStack REACTOR_INPUT = new SlimefunItemStack("REACTOR_INPUT_BNG",
			Material.LIGHT_BLUE_WOOL,
	        ChatColor.RESET+"反应堆输入接口",
	        "",
	        "&7反应堆堆芯全息图中的 &b蓝色 &7部分"
	    );
	public static final SlimefunItemStack REACTOR_OUTPUT = new SlimefunItemStack("REACTOR_OUTPUT_BNG",
			Material.RED_WOOL,
			ChatColor.RESET+"反应堆输出接口",
	        "",
	        "&7反应堆堆芯全息图中的 &4红色 &7部分"
	    );
	//https://minecraft-heads.com/custom-heads/miscellaneous/50973-fancy-cube
	public static final SlimefunItemStack REACTOR_HATCH = new SlimefunItemStack("REACTOR_HATCH_BNG",
			"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWU4MzI4NDE2MDdkZjc2ZWM1NjE5MGVhODdjMzE2MDUwYTI3N2E1YTU4ZjFkM2JjODJhMGU5NGVkYjk1MzUzIn19fQ==",
			ChatColor.RESET+"反应堆舱口",
	        "",
	        "&7反应堆堆芯全息图中的 &a绿色 &7部分"
	    );
	
	
	public static final ItemStack[] recipe_LEAD_GLASS= {
			Items.LEAD_BLOCK,Items.LEAD_BLOCK,Items.LEAD_BLOCK,
			Items.LEAD_BLOCK,new ItemStack(Material.GLASS),Items.LEAD_BLOCK,
			Items.LEAD_BLOCK,Items.LEAD_BLOCK,Items.LEAD_BLOCK
	};
	public static final ItemStack[] recipe_SUPER_FREEZER= {
			SlimefunItems.FREEZER_2,SlimefunItems.ELECTRO_MAGNET,SlimefunItems.CARGO_MOTOR,
			SlimefunItems.REACTOR_COOLANT_CELL,new ItemStack(Material.ICE),SlimefunItems.REACTOR_COOLANT_CELL,
			SlimefunItems.ELECTRIC_MOTOR,SlimefunItems.ELECTRO_MAGNET,SlimefunItems.FREEZER_2
	};
	
	public static final ItemStack[] recipe_BORIUM_ROD= {
			Items.BORIUM,Items.BORIUM,Items.BORIUM,
			Items.BORIUM,new ItemStack(Material.IRON_BLOCK),Items.BORIUM,
			Items.BORIUM,Items.BORIUM,Items.BORIUM
	};
	
	public static final ItemStack[] recipe_LEAD_BLOCK= {
			SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT,
			SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT,
			SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT,SlimefunItems.LEAD_INGOT
	};
	public static final ItemStack[] recipe_REACTOR_HATCH= {
			SlimefunItems.LEAD_INGOT,SlimefunItems.ELECTRIC_MOTOR,SlimefunItems.LEAD_INGOT,
			SlimefunItems.LEAD_INGOT,SlimefunItems.NUCLEAR_REACTOR,SlimefunItems.LEAD_INGOT,
			SlimefunItems.LEAD_INGOT,SlimefunItems.ELECTRO_MAGNET,SlimefunItems.LEAD_INGOT
	};
	public static final ItemStack[] recipe_REACTOR_CORE= {
			Items.LEAD_BLOCK,SlimefunItems.GPS_CONTROL_PANEL,Items.LEAD_BLOCK,
			new ItemStack(Material.CHEST),SlimefunItems.REACTOR_ACCESS_PORT,new ItemStack(Material.CHEST),
			Items.LEAD_BLOCK,SlimefunItems.ELECTRO_MAGNET,Items.LEAD_BLOCK
	};
	public static final ItemStack[] recipe_REACTOR_INPUT= {
			Items.LEAD_BLOCK,Items.LEAD_BLOCK,Items.LEAD_BLOCK,
			new ItemStack(Material.CHEST),SlimefunItems.CARGO_INPUT_NODE,new ItemStack(Material.CHEST),
			Items.LEAD_BLOCK,SlimefunItems.ELECTRO_MAGNET,Items.LEAD_BLOCK
	};
	public static final ItemStack[] recipe_REACTOR_OUTPUT= {
			Items.LEAD_BLOCK,Items.LEAD_BLOCK,Items.LEAD_BLOCK,
			new ItemStack(Material.CHEST),SlimefunItems.CARGO_OUTPUT_NODE_2,new ItemStack(Material.CHEST),
			Items.LEAD_BLOCK,SlimefunItems.ELECTRO_MAGNET,Items.LEAD_BLOCK
	};
	
	public static final ItemStack[] recipe_TEST_ITEM= {
			null,null,null,
			null,new ItemStack(Material.PINK_WOOL),null,
			null,null,null
	};
}
