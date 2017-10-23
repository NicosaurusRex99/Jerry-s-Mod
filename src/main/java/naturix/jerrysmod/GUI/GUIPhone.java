package naturix.jerrysmod.GUI;

import java.io.IOException;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GUIPhone extends GuiScreen {
	

	private GuiButton a;
	private GuiButton b;
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
	    this.drawDefaultBackground();
	    super.drawScreen(mouseX, mouseY, partialTicks);
	}
	public boolean doesGuiPauseGame() {
	    return false;
	}
	public void initGui() {
		this.buttonList.add(this.a = new GuiButton(0, this.width / 2 - 100, this.height / 2 - 24, "Overworld"));
	    this.buttonList.add(this.b = new GuiButton(1, this.width / 2 - 100, this.height / 2 + 4, "Slime Dimension"));

	}
	protected void actionPerformed(GuiButton button) throws IOException {
	    if (button == this.a) {
	        this.mc.displayGuiScreen(null);
	        if (this.mc.currentScreen == null)
	            this.mc.setIngameFocus();
	    }
	    if (button == this.b){
	        this.mc.displayGuiScreen(null);
	        if (this.mc.currentScreen == null)
	            this.mc.setIngameFocus();
	    }
	}
}
