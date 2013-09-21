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
package org.jmangos.tools.dbc.struct;

import javax.xml.bind.annotation.XmlAttribute;

import org.jmangos.tools.dbc.dataholder.DBCStruct;

public class WeatherEntry extends DBCStruct<WeatherEntry> {

    @XmlAttribute(name = "id", required = true)
    public final Unsigned32 Id = new Unsigned32();
    public final Unsigned32 unk1 = new Unsigned32();
    public final Unsigned32 type = new Unsigned32();
    public final Unsigned32 unk2 = new Unsigned32();
    public final Unsigned32 unk3 = new Unsigned32();
    public final Unsigned32 unk4 = new Unsigned32();
    public final Unsigned32 unk5 = new Unsigned32();
    @XmlAttribute(name = "texture", required = true)
    public final InternalString texture = new InternalString();
}