package org.JMANGOS.wowdata.dbc.struct;

import javax.xml.bind.annotation.XmlAttribute;

import org.JMANGOS.wowdata.dbc.dataholder.DBCStruct;

public class ItemEntry extends DBCStruct<ItemEntry> {
	@XmlAttribute(name = "id", required=true)
	public final Unsigned32 ID = new Unsigned32();
	@XmlAttribute(name = "Class", required=true)
	public final Unsigned32 Class = new Unsigned32();
	@XmlAttribute(name = "SubClass", required=true)
	public final Unsigned32 SubClass = new Unsigned32();
	@XmlAttribute(name = "Unk0", required=true)
	public final Signed32 Unk0 = new Signed32();
	@XmlAttribute(name = "Material", required=true)
	public final Signed32 Material = new Signed32();
	@XmlAttribute(name = "DisplayId", required=true)
	public final Unsigned32 DisplayId = new Unsigned32();
	@XmlAttribute(name = "InventoryType", required=true)
	public final Unsigned32 InventoryType = new Unsigned32();
	@XmlAttribute(name = "Sheath", required=true)
	public final Unsigned32 Sheath = new Unsigned32();
}
