package net.WAC.wurmunlimited.mods.altars;

import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
import org.gotti.wurmunlimited.modloader.interfaces.ItemTemplatesCreatedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;

import java.util.Properties;

public class Altars implements WurmServerMod, Configurable, ItemTemplatesCreatedListener {

    public String getVersion() {
        return "v1.0";
    }

    @Override
    public void configure(Properties properties) {
        AltarItems.hugeMarbleAltarTemplateId = Integer.parseInt(properties.getProperty("Huge_Marble_Altar_templateId", String.valueOf(AltarItems.hugeMarbleAltarTemplateId)));
        AltarItems.marbleAltarSizeMultiplier = Float.parseFloat(properties.getProperty("Huge_Marble_Altar_Size_Multiplier", String.valueOf(AltarItems.marbleAltarSizeMultiplier)));
        AltarItems.sacrificialAltarTemplateId = Integer.parseInt(properties.getProperty("Sacrificial_Altar_templateId", String.valueOf(AltarItems.sacrificialAltarTemplateId)));
        AltarItems.sacrificialAltarSizeMultiplier = Float.parseFloat(properties.getProperty("Sacrificial_Altar_Size_Multiplier", String.valueOf(AltarItems.sacrificialAltarSizeMultiplier)));
    }

    @Override
    public void onItemTemplatesCreated() {
        new AltarItems();
    }

}
