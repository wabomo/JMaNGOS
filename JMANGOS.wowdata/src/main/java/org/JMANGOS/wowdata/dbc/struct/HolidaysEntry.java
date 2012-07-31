package org.JMANGOS.wowdata.dbc.struct;

import javax.xml.bind.annotation.XmlAttribute;

import org.JMANGOS.wowdata.dbc.dataholder.DBCStruct;

public class HolidaysEntry extends DBCStruct<HolidaysEntry> 
{
	@XmlAttribute(name="id", required=true)
	public final Unsigned32 id = new Unsigned32();
    @XmlAttribute(name="duration")
    public final Unsigned32[] duration = array(new Unsigned32[10]);                                        // 3-10, empty fields
    @XmlAttribute(name="time")
    public final Unsigned32[] time = array(new Unsigned32[38]);                                        // 3-10, empty fields
    @XmlAttribute(name="NameId")
    public final Unsigned32 holidayNameId = new Unsigned32();                                 // 49, id for HolidayNames.dbc
    @XmlAttribute(name="DescriptionId")
    public final Unsigned32 holidayDescriptionId = new Unsigned32();
    @XmlAttribute(name="Skin")
    public final InternalString Skin = new InternalString();
    @XmlAttribute(name="priority")
    public final Signed32 priority = new Signed32();                                         // 51
    @XmlAttribute(name="calendarFilterType")
    public final Signed32 calendarFilterType = new Signed32();                                         // 51
    @XmlAttribute(name="flags")
    public final Signed32 flags = new Signed32();                                         // 51
    
    
    
};

