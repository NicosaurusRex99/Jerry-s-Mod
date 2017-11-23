/*
    Jerry's Mod - A Minecraft Mod
    Copyright (C) 2016-2017 Hawaii_Beach
    This program Is free software: you can redistribute it And/Or modify
    it under the terms Of the GNU General Public License As published by
    the Free Software Foundation, either version 3 Of the License, Or
    (at your option) any later version.
    This program Is distributed In the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty Of
    MERCHANTABILITY Or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License For more details.
    You should have received a copy Of the GNU General Public License
    along with this program.  If Not, see <http://www.gnu.org/licenses/>.
    */
package naturix.jerrysmod.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAITameSlime extends EntityAIBase
{
    private final EntityTameSlime theEntity;
    /** If the EntityTameable is sitting. */
    private boolean isSitting;

    public EntityAITameSlime(EntityTameSlime entityIn)
    {
        this.theEntity = entityIn;
        //this.setMutexBits(5);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.theEntity.isTamed())
        {
            return true;
        }
        else if (this.theEntity.isInWater())
        {
            return true;
        }
        else if (!this.theEntity.onGround)
        {
            return true;
        }
        else
        {
            EntityLivingBase entitylivingbase = this.theEntity.getOwner();
            return entitylivingbase == null ? true : (this.theEntity.getDistance(entitylivingbase) < 144.0D && entitylivingbase.getRevengeTarget() != null ? false : this.isSitting);
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.theEntity.getNavigator().clearPath();
        this.theEntity.setSitting(true);
    } 

    /**
     * Resets the task
     */
    public void resetTask()
    {
        this.theEntity.setSitting(false);
    }

    /**
     * Sets the sitting flag.
     */
    public void setSitting(boolean sitting)
    {
        this.isSitting = sitting;
    }
}