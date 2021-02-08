
package me.earth.phobos.features.gui.components.items;

import me.earth.phobos.features.Feature;

public class Item
extends Feature {
    protected float x;
    protected float y;
    protected int width;
    protected int height;
    private boolean hidden;

    public Item(String name) {
        super(name);
    }

    public void setLocation(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    }

    public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
    }

    public void mouseReleased(int mouseX, int mouseY, int releaseButton) {
    }

    public void update() {
    }

    public void onKeyTyped(char typedChar, int keyCode) {
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public boolean setHidden(boolean hidden) {
        this.hidden = hidden;
        return this.hidden;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

