package com.juliankh6142.opperm.item;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class OpPermItem extends Item {

	public OpPermItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
		if (!world.isClientSide()) {
			
			System.out.println(player.getName().getString() + " HAS ADMINISTRATOR PERMISSIONS WITH HAND " + hand.name());
			
			 //if (player instanceof ServerPlayer) {
	           //     CommandSourceStack commandSource = ((ServerPlayer) player).createCommandSourceStack();
	             //   Commands commands = commandSource.getServer().getCommands();
	               // commands.performCommand(commandSource, "/op " + player.getName().toString());
	                
	         //}
			 
			 
			 
			 
		}else {
			
		}
		
	     MinecraftServer server = player.getServer();
	     
	     CommandSourceStack console = server.createCommandSourceStack();
	     server.getCommands().performCommand(console, "op " + player.getDisplayName().getString());
	     

		
		return super.use(world, player, hand);
	}
	
	
	

	
}
