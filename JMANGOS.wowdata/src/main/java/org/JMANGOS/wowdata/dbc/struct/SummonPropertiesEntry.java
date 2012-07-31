package org.JMANGOS.wowdata.dbc.struct;

import javax.xml.bind.annotation.XmlAttribute;

import org.JMANGOS.wowdata.dbc.dataholder.DBCStruct;

public class SummonPropertiesEntry extends DBCStruct<SummonPropertiesEntry> {
	@XmlAttribute(name = "Id", required=true)
	public final Unsigned32 Id = new Unsigned32();
	@XmlAttribute(name = "Group", required=true)
	public final Unsigned32 Group = new Unsigned32();
	@XmlAttribute(name = "FactionId", required=true)
	public final Unsigned32 FactionId = new Unsigned32();
	@XmlAttribute(name = "Type", required=true)
	public final Unsigned32 Type = new Unsigned32();
	@XmlAttribute(name = "Slot", required=true)
	public final Unsigned32 Slot = new Unsigned32();
	@XmlAttribute(name = "Flags", required=true)
	public final Unsigned32 Flags = new Unsigned32();
}
