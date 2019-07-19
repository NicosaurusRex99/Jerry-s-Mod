package naturix.jerrysmod.objects.items;

import net.minecraft.item.Food;

public class FoodBase {

    public static final Food GRAPES = (new Food.Builder()).hunger(3).saturation(0.4F).build();
    public static final Food OLIVES = (new Food.Builder()).hunger(1).saturation(0.6F).build();
}
