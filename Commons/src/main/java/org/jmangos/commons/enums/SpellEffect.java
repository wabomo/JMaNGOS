/*******************************************************************************
 * Copyright (C) 2013 JMaNGOS <http://jmangos.org/>
 * 
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package org.jmangos.commons.enums;

public enum SpellEffect {
    NONE,
    INSTAKILL,
    SCHOOL_DAMAGE,
    DUMMY,
    PORTAL_TELEPORT,
    TELEPORT_UNITS,
    APPLY_AURA,
    ENVIRONMENTAL_DAMAGE,
    POWER_DRAIN,
    HEALTH_LEECH,
    HEAL,
    BIND,
    PORTAL,
    RITUAL_BASE,
    RITUAL_SPECIALIZE,
    RITUAL_ACTIVATE_PORTAL,
    QUEST_COMPLETE,
    WEAPON_DAMAGE_NOSCHOOL,
    RESURRECT,
    ADD_EXTRA_ATTACKS,
    DODGE,
    EVADE,
    PARRY,
    BLOCK,
    CREATE_ITEM,
    WEAPON,
    DEFENSE,
    PERSISTENT_AREA_AURA,
    SUMMON,
    LEAP,
    ENERGIZE,
    WEAPON_PERCENT_DAMAGE,
    TRIGGER_MISSILE,
    OPEN_LOCK,
    SUMMON_CHANGE_ITEM,
    APPLY_AREA_AURA_PARTY,
    LEARN_SPELL,
    SPELL_DEFENSE,
    DISPEL,
    LANGUAGE,
    DUAL_WIELD,
    JUMP,
    JUMP2,
    TELEPORT_UNITS_FACE_CASTER,
    SKILL_STEP,
    ADD_HONOR,
    SPAWN,
    TRADE_SKILL,
    STEALTH,
    DETECT,
    TRANS_DOOR,
    FORCE_CRITICAL_HIT,
    GUARANTEE_HIT,
    ENCHANT_ITEM,
    ENCHANT_ITEM_TEMPORARY,
    TAMECREATURE,
    SUMMON_PET,
    LEARN_PET_SPELL,
    WEAPON_DAMAGE,
    CREATE_RANDOM_ITEM,
    PROFICIENCY,
    SEND_EVENT,
    POWER_BURN,
    THREAT,
    TRIGGER_SPELL,
    APPLY_AREA_AURA_RAID,
    RESTORE_ITEM_CHARGES,
    HEAL_MAX_HEALTH,
    INTERRUPT_CAST,
    DISTRACT,
    PULL,
    PICKPOCKET,
    ADD_FARSIGHT,
    UNTRAIN_TALENTS,
    APPLY_GLYPH,
    HEAL_MECHANICAL,
    SUMMON_OBJECT_WILD,
    SCRIPT_EFFECT,
    ATTACK,
    SANCTUARY,
    ADD_COMBO_POINTS,
    CREATE_HOUSE,
    BIND_SIGHT,
    DUEL,
    STUCK,
    SUMMON_PLAYER,
    ACTIVATE_OBJECT,
    WMO_DAMAGE,
    WMO_REPAIR,
    WMO_CHANGE,
    KILL_CREDIT_PERSONAL,
    THREAT_ALL,
    ENCHANT_HELD_ITEM,
    BREAK_PLAYER_TARGETING,
    SELF_RESURRECT,
    SKINNING,
    CHARGE,
    SUMMON_ALL_TOTEMS,
    KNOCK_BACK,
    DISENCHANT,
    INEBRIATE,
    FEED_PET,
    DISMISS_PET,
    REPUTATION,
    SUMMON_OBJECT_SLOT1,
    SUMMON_OBJECT_SLOT2,
    SUMMON_OBJECT_SLOT3,
    SUMMON_OBJECT_SLOT4,
    DISPEL_MECHANIC,
    SUMMON_DEAD_PET,
    DESTROY_ALL_TOTEMS,
    DURABILITY_DAMAGE,
    SPELL_EFFECT_112, // old SPELL_EFFECT_SUMMON_DEMON
    RESURRECT_NEW,
    ATTACK_ME,
    DURABILITY_DAMAGE_PCT,
    SKIN_PLAYER_CORPSE,
    SPIRIT_HEAL,
    SKILL,
    APPLY_AREA_AURA_PET,
    TELEPORT_GRAVEYARD,
    NORMALIZED_WEAPON_DMG,
    SPELL_EFFECT_122,
    SEND_TAXI,
    PLAYER_PULL,
    MODIFY_THREAT_PERCENT,
    STEAL_BENEFICIAL_BUFF,
    PROSPECTING,
    APPLY_AREA_AURA_FRIEND,
    APPLY_AREA_AURA_ENEMY,
    REDIRECT_THREAT,
    PLAY_SOUND,
    PLAY_MUSIC,
    UNLEARN_SPECIALIZATION,
    KILL_CREDIT_GROUP,
    CALL_PET,
    HEAL_PCT,
    ENERGIZE_PCT,
    LEAP_BACK,
    CLEAR_QUEST,
    FORCE_CAST,
    SPELL_EFFECT_141,
    TRIGGER_SPELL_WITH_VALUE,
    APPLY_AREA_AURA_OWNER,
    SPELL_EFFECT_144,
    SPELL_EFFECT_145,
    ACTIVATE_RUNE,
    QUEST_FAIL,
    SPELL_EFFECT_148,
    CHARGE2,
    QUEST_OFFER,
    TRIGGER_SPELL_2,
    SPELL_EFFECT_152,
    CREATE_PET,
    TEACH_TAXI_NODE,
    TITAN_GRIP,
    ENCHANT_ITEM_PRISMATIC,
    CREATE_ITEM_2,
    MILLING,
    ALLOW_RENAME_PET,
    SPELL_EFFECT_160,
    TALENT_SPEC_COUNT,
    TALENT_SPEC_SELECT,
    SPELL_EFFECT_163,
    CANCEL_AURA;

    private static final int MAX_SPELL_EFFECT = 165;

    public SpellEffect get(final int value) {
        if (value < MAX_SPELL_EFFECT) {
            return values()[value];
        }
        return null;
    }
}
