package com.chrismin13.moreminecraft.events.shield;

import org.bukkit.event.Cancellable;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import com.chrismin13.moreminecraft.events.item.CustomItemStackEvent;
import com.chrismin13.moreminecraft.items.CustomItemStack;

public class CustomShieldPlayerDamageByEntityEvent extends CustomItemStackEvent implements Cancellable {

	private EntityDamageByEntityEvent entityDamageByEntityEvent;
	
	public CustomShieldPlayerDamageByEntityEvent(EntityDamageByEntityEvent event, CustomItemStack cStack) {
		super(cStack);
		this.entityDamageByEntityEvent = event;
	}
	
	public EntityDamageByEntityEvent getEntityDamageByEntityEvent() {
		return entityDamageByEntityEvent;
	}
	
	@Override
	public boolean isCancelled() {
		return entityDamageByEntityEvent.isCancelled();
	}

	@Override
	public void setCancelled(boolean cancel) {
		entityDamageByEntityEvent.setCancelled(true);
	}

}