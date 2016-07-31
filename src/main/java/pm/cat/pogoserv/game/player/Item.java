package pm.cat.pogoserv.game.player;

import pm.cat.pogoserv.game.config.ItemDef;

public class Item {
	
	public final ItemDef def;
	public int count;
	
	public Item(ItemDef def){
		this(def, 0);
	}
	
	public Item(ItemDef def, int count){
		this.def = def;
		this.count = count;
	}
	
}
