/*******************************************************************************
 * Copyright (C) 2012 JMaNGOS <http://jmangos.org/>
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
 *******************************************************************************/
package org.jmangos.auth.network.handler;

import org.jmangos.commons.network.handlers.AbstractPacketHandlerFactory;
import org.jmangos.commons.network.netty.model.PacketData;

/**
 * 
 * @author MinimaJack
 *
 */
public class AuthToRealmPacketHandlerFactory extends AbstractPacketHandlerFactory {

	/**
	 * Instantiates a new l2 r packet handler factory.
	 */
	public AuthToRealmPacketHandlerFactory() {
		addList(loadStaticData(PacketData.class,
				"./conf/packetData/packets.xsd",
				"./conf/packetData/lr-packets.xml"));
	}
}