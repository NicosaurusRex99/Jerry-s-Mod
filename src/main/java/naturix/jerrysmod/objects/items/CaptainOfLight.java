package naturix.jerrysmod.objects.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.item.Item;

public class CaptainOfLight extends ItemBase {

    public CaptainOfLight(String name) {
        super(name, new Item.Properties().maxStackSize(1).group(JerrysMod.setup.itemGroup));
    }


    //TODO - Fix captain of light
//    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand handIn) {
//        ItemStack itemstack = player.getHeldItem(handIn);
//        double blockReachDistance = 128;
//        BlockRayTraceResult rayTrace = rayTraceEyes(player, blockReachDistance + 1);
//        if (rayTrace.getType() == RayTraceResult.Type.BLOCK && !world.isRemote) {
//            world.addEntity(new LightningBoltEntity(world, rayTrace.getPos().getX(), rayTrace.getPos().getY(), rayTrace.getPos().getZ(), false));
//        }
//            player.addStat(Stats.ITEM_USED.get(this));
//
//            return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
//        }
//
//        @Nonnull
//        public static BlockRayTraceResult rayTraceEyes(LivingEntity entity,double length){
//            Vec3d startPos = new Vec3d(entity.getPosition().getX(), entity.getPosition().getY() + entity.getEyeHeight(), entity.getPosition().getZ());
//            Vec3d endPos = startPos.add(new Vec3d(entity.getLookVec().x * length, entity.getLookVec().y * length, entity.getLookVec().z * length));
//            RayTraceContext context = new RayTraceContext(startPos, endPos, RayTraceContext.BlockMode.COLLIDER,
//                    RayTraceContext.FluidMode.NONE, entity);
//            return entity.world.rayTraceBlocks(context);
//        }
    }