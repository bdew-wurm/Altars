package net.WAC.wurmunlimited.mods.altars;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.TimeConstants;
import com.wurmonline.server.behaviours.BehaviourList;
import com.wurmonline.server.items.*;
import com.wurmonline.server.skills.SkillList;
import com.wurmonline.shared.constants.IconConstants;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;

import java.io.IOException;

public class AltarItems implements WurmServerMod, ItemTypes, MiscConstants {

    public static int hugeMarbleAltarTemplateId = 9918;
    public static float marbleAltarSizeMultiplier = 1f;
    public static int sacrificialAltarTemplateId = 9919;
    public static float sacrificialAltarSizeMultiplier = 1f;

    public AltarItems() {
        try {
            ItemTemplateCreator.createItemTemplate(hugeMarbleAltarTemplateId, ItemSizes.ITEM_SIZE_HUGE, "Altar", "Altars", "almost full", "somewhat occupied", "half-full", "emptyish",
                    "A huge marble altar with beautiful hand carved designs all around it.",
                    new short[]{
                            ITEM_TYPE_NAMED,
                            ITEM_TYPE_HOLLOW,
                            ITEM_TYPE_NOTAKE,
                            ITEM_TYPE_STONE,
                            ITEM_TYPE_TURNABLE,
                            ITEM_TYPE_DECORATION,
                            ITEM_TYPE_REPAIRABLE,
                            ITEM_TYPE_HASDATA,
                            ITEM_TYPE_DOMAIN,
                            ITEM_TYPE_USE_GROUND_ONLY,
                            ITEM_TYPE_OWNER_DESTROYABLE,
                            ITEM_TYPE_HOLLOW_VIEWABLE
                    },
                    (short) IconConstants.ICON_NONE, BehaviourList.domainItemBehaviour, 0, TimeConstants.DECAYTIME_STONE, 1000, 1000, 1000, (int) MiscConstants.NOID,
                    MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.altar.huge.marble.", 50.0F, 460000, Materials.MATERIAL_MARBLE, 5000, false).setContainerSize((int) (500 * marbleAltarSizeMultiplier), (int) (500 * marbleAltarSizeMultiplier), (int) (500 * marbleAltarSizeMultiplier));
        } catch (IOException e) {
            e.printStackTrace();
        }
        AdvancedCreationEntry altarHuge = CreationEntryCreator.createAdvancedEntry(SkillList.MASONRY, ItemList.marbleSlab, ItemList.marbleBrick, hugeMarbleAltarTemplateId, false, false, 0.0f, true, true, CreationCategories.ALTAR);
        altarHuge.addRequirement(new CreationRequirement(1, ItemList.marbleSlab, 5, true));
        altarHuge.addRequirement(new CreationRequirement(2, ItemList.marbleBrick, 19, true));
        altarHuge.addRequirement(new CreationRequirement(3, ItemList.mortar, 10, true));
        altarHuge.addRequirement(new CreationRequirement(4, ItemList.woad, 5, true));
        altarHuge.addRequirement(new CreationRequirement(5, ItemList.cochineal, 5, true));
        altarHuge.addRequirement(new CreationRequirement(6, ItemList.plank, 4, true));
        altarHuge.addRequirement(new CreationRequirement(7, ItemList.sandstoneBrick, 10, true));



        try {
            ItemTemplateCreator.createItemTemplate(sacrificialAltarTemplateId, "Sacrificial Altar", "Sacrificial Altars", "almost full", "somewhat occupied", "half-full", "emptyish",
                    "A stone altar with foreign markings and dark energy. It is mainly used by cultists for rituals and sacrificing.",
                    new short[]{
                            ITEM_TYPE_NAMED,
                            ITEM_TYPE_HOLLOW,
                            ITEM_TYPE_NOTAKE,
                            ITEM_TYPE_STONE,
                            ITEM_TYPE_TURNABLE,
                            ITEM_TYPE_DECORATION,
                            ITEM_TYPE_REPAIRABLE,
                            ITEM_TYPE_HASDATA,
                            ITEM_TYPE_DOMAIN,
                            ITEM_TYPE_USE_GROUND_ONLY,
                            ITEM_TYPE_OWNER_DESTROYABLE,
                            ITEM_TYPE_HOLLOW_VIEWABLE
                    },
                    (short) IconConstants.ICON_NONE, BehaviourList.domainItemBehaviour, 0, TimeConstants.DECAYTIME_STONE, 1000, 1000, 1000, (int) MiscConstants.NOID,
                    MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.decoration.altar.sacrificial.", 35.0F, 290000, Materials.MATERIAL_STONE, 1000, false).setContainerSize((int) (250 * sacrificialAltarSizeMultiplier), (int) (250 * sacrificialAltarSizeMultiplier), (int) (250 * sacrificialAltarSizeMultiplier));
        } catch (IOException e) {
            e.printStackTrace();
        }
        AdvancedCreationEntry altarSacrificial = CreationEntryCreator.createAdvancedEntry(SkillList.MASONRY, ItemList.stoneSlab, ItemList.stoneBrick, sacrificialAltarTemplateId, false, false, 0.0f, true, true, CreationCategories.ALTAR);
        altarSacrificial.addRequirement(new CreationRequirement(1, ItemList.stoneSlab, 4, true));
        altarSacrificial.addRequirement(new CreationRequirement(2, ItemList.stoneBrick, 9, true));
        altarSacrificial.addRequirement(new CreationRequirement(3, ItemList.mortar, 6, true));
        altarSacrificial.addRequirement(new CreationRequirement(4, ItemList.cochineal, 15, true));
        altarSacrificial.addRequirement(new CreationRequirement(5, ItemList.ironBar, 10, true));
    }

}
