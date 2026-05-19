package com.minecolonies.core.colony.buildings.modules.settings;

import java.util.List;

/**
 * Stores the colony protection setting.
 */
public class ColonyProtectionSetting extends StringSetting
{
    /**
     * Different setting possibilities: Default (use server config), On, Off.
     */
    public static final String DEFAULT = "com.minecolonies.core.townhall.setting.colonyProtection.default";
    public static final String ON      = "com.minecolonies.core.townhall.setting.colonyProtection.on";
    public static final String OFF     = "com.minecolonies.core.townhall.setting.colonyProtection.off";

    /**
     * Create a new colony protection list setting.
     */
    public ColonyProtectionSetting()
    {
        super(DEFAULT, ON, OFF);
    }

    /**
     * Create a new colony protection list setting.
     *
     * @param settings     the overall list of settings.
     * @param currentIndex the current selected index.
     */
    public ColonyProtectionSetting(final List<String> settings, final int currentIndex)
    {
        super(settings, currentIndex);
    }
}
