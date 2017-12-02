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
package naturix.jerrysmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import naturix.jerrysmod.proxies.CommonProxy;

@Mod(modid = JerrysMod.MODID, version = JerrysMod.VERSION, name = JerrysMod.MODNAME, acceptedMinecraftVersions = JerrysMod.MC)
public class JerrysMod
{
    public static final String MODID = "jerrysmod";
    public static final String VERSION = "1.7.10.0";
    public static final String MODNAME = "Jerry's Mod";
    public static final String MC = "1.7.10";
    
    @SidedProxy(clientSide="naturix.jerrysmod.proxies.ClientProxy", serverSide="naturix.jerrysmod.proxies.ServerProxy")
    public static CommonProxy proxy;
    
    @Instance
    public static JerrysMod instance = new JerrysMod();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}

