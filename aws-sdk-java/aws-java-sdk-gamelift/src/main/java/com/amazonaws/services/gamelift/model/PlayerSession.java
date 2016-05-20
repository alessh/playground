/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Properties describing a player session.
 * </p>
 */
public class PlayerSession implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a player session.
     * </p>
     */
    private String playerSessionId;
    /**
     * <p>
     * Unique identifier for a player.
     * </p>
     */
    private String playerId;
    /**
     * <p>
     * Unique identifier for a game session.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Time stamp indicating when this fleet was terminated. Format is an
     * integer representing the number of seconds since the Unix epoch (Unix
     * time).
     * </p>
     */
    private java.util.Date terminationTime;
    /**
     * <p>
     * Current status of the player session. Possible player session states
     * include:
     * <ul>
     * <li>RESERVED: The player session request has been received, but the
     * player has not yet connected to the game server and/or been validated.</li>
     * <li>ACTIVE: The player has been validated by the game server and is
     * currently connected.</li>
     * <li>COMPLETED: The player connection has been dropped.</li>
     * <li>TIMEDOUT: A player session request was received, but the player did
     * not connect and/or was not validated within the time-out limit (60
     * seconds).</li>
     * </ul>
     * </p>
     */
    private String status;
    /**
     * <p>
     * Game session IP address. All player sessions reference the game session
     * location.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * Unique identifier for a player session.
     * </p>
     * 
     * @param playerSessionId
     *        Unique identifier for a player session.
     */

    public void setPlayerSessionId(String playerSessionId) {
        this.playerSessionId = playerSessionId;
    }

    /**
     * <p>
     * Unique identifier for a player session.
     * </p>
     * 
     * @return Unique identifier for a player session.
     */

    public String getPlayerSessionId() {
        return this.playerSessionId;
    }

    /**
     * <p>
     * Unique identifier for a player session.
     * </p>
     * 
     * @param playerSessionId
     *        Unique identifier for a player session.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PlayerSession withPlayerSessionId(String playerSessionId) {
        setPlayerSessionId(playerSessionId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a player.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player.
     */

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     * <p>
     * Unique identifier for a player.
     * </p>
     * 
     * @return Unique identifier for a player.
     */

    public String getPlayerId() {
        return this.playerId;
    }

    /**
     * <p>
     * Unique identifier for a player.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PlayerSession withPlayerId(String playerId) {
        setPlayerId(playerId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a game session.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for a game session.
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for a game session.
     * </p>
     * 
     * @return Unique identifier for a game session.
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for a game session.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for a game session.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PlayerSession withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @return Unique identifier for a fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PlayerSession withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this object was created. Format is an
     *        integer representing the number of seconds since the Unix epoch
     *        (Unix time).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     * 
     * @return Time stamp indicating when this object was created. Format is an
     *         integer representing the number of seconds since the Unix epoch
     *         (Unix time).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this object was created. Format is an
     *        integer representing the number of seconds since the Unix epoch
     *        (Unix time).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PlayerSession withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this fleet was terminated. Format is an
     * integer representing the number of seconds since the Unix epoch (Unix
     * time).
     * </p>
     * 
     * @param terminationTime
     *        Time stamp indicating when this fleet was terminated. Format is an
     *        integer representing the number of seconds since the Unix epoch
     *        (Unix time).
     */

    public void setTerminationTime(java.util.Date terminationTime) {
        this.terminationTime = terminationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this fleet was terminated. Format is an
     * integer representing the number of seconds since the Unix epoch (Unix
     * time).
     * </p>
     * 
     * @return Time stamp indicating when this fleet was terminated. Format is
     *         an integer representing the number of seconds since the Unix
     *         epoch (Unix time).
     */

    public java.util.Date getTerminationTime() {
        return this.terminationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this fleet was terminated. Format is an
     * integer representing the number of seconds since the Unix epoch (Unix
     * time).
     * </p>
     * 
     * @param terminationTime
     *        Time stamp indicating when this fleet was terminated. Format is an
     *        integer representing the number of seconds since the Unix epoch
     *        (Unix time).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PlayerSession withTerminationTime(java.util.Date terminationTime) {
        setTerminationTime(terminationTime);
        return this;
    }

    /**
     * <p>
     * Current status of the player session. Possible player session states
     * include:
     * <ul>
     * <li>RESERVED: The player session request has been received, but the
     * player has not yet connected to the game server and/or been validated.</li>
     * <li>ACTIVE: The player has been validated by the game server and is
     * currently connected.</li>
     * <li>COMPLETED: The player connection has been dropped.</li>
     * <li>TIMEDOUT: A player session request was received, but the player did
     * not connect and/or was not validated within the time-out limit (60
     * seconds).</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the player session. Possible player session
     *        states include:
     *        <ul>
     *        <li>RESERVED: The player session request has been received, but
     *        the player has not yet connected to the game server and/or been
     *        validated.</li>
     *        <li>ACTIVE: The player has been validated by the game server and
     *        is currently connected.</li>
     *        <li>COMPLETED: The player connection has been dropped.</li>
     *        <li>TIMEDOUT: A player session request was received, but the
     *        player did not connect and/or was not validated within the
     *        time-out limit (60 seconds).</li>
     *        </ul>
     * @see PlayerSessionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the player session. Possible player session states
     * include:
     * <ul>
     * <li>RESERVED: The player session request has been received, but the
     * player has not yet connected to the game server and/or been validated.</li>
     * <li>ACTIVE: The player has been validated by the game server and is
     * currently connected.</li>
     * <li>COMPLETED: The player connection has been dropped.</li>
     * <li>TIMEDOUT: A player session request was received, but the player did
     * not connect and/or was not validated within the time-out limit (60
     * seconds).</li>
     * </ul>
     * </p>
     * 
     * @return Current status of the player session. Possible player session
     *         states include:
     *         <ul>
     *         <li>RESERVED: The player session request has been received, but
     *         the player has not yet connected to the game server and/or been
     *         validated.</li>
     *         <li>ACTIVE: The player has been validated by the game server and
     *         is currently connected.</li>
     *         <li>COMPLETED: The player connection has been dropped.</li>
     *         <li>TIMEDOUT: A player session request was received, but the
     *         player did not connect and/or was not validated within the
     *         time-out limit (60 seconds).</li>
     *         </ul>
     * @see PlayerSessionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the player session. Possible player session states
     * include:
     * <ul>
     * <li>RESERVED: The player session request has been received, but the
     * player has not yet connected to the game server and/or been validated.</li>
     * <li>ACTIVE: The player has been validated by the game server and is
     * currently connected.</li>
     * <li>COMPLETED: The player connection has been dropped.</li>
     * <li>TIMEDOUT: A player session request was received, but the player did
     * not connect and/or was not validated within the time-out limit (60
     * seconds).</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the player session. Possible player session
     *        states include:
     *        <ul>
     *        <li>RESERVED: The player session request has been received, but
     *        the player has not yet connected to the game server and/or been
     *        validated.</li>
     *        <li>ACTIVE: The player has been validated by the game server and
     *        is currently connected.</li>
     *        <li>COMPLETED: The player connection has been dropped.</li>
     *        <li>TIMEDOUT: A player session request was received, but the
     *        player did not connect and/or was not validated within the
     *        time-out limit (60 seconds).</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PlayerSessionStatus
     */

    public PlayerSession withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the player session. Possible player session states
     * include:
     * <ul>
     * <li>RESERVED: The player session request has been received, but the
     * player has not yet connected to the game server and/or been validated.</li>
     * <li>ACTIVE: The player has been validated by the game server and is
     * currently connected.</li>
     * <li>COMPLETED: The player connection has been dropped.</li>
     * <li>TIMEDOUT: A player session request was received, but the player did
     * not connect and/or was not validated within the time-out limit (60
     * seconds).</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the player session. Possible player session
     *        states include:
     *        <ul>
     *        <li>RESERVED: The player session request has been received, but
     *        the player has not yet connected to the game server and/or been
     *        validated.</li>
     *        <li>ACTIVE: The player has been validated by the game server and
     *        is currently connected.</li>
     *        <li>COMPLETED: The player connection has been dropped.</li>
     *        <li>TIMEDOUT: A player session request was received, but the
     *        player did not connect and/or was not validated within the
     *        time-out limit (60 seconds).</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PlayerSessionStatus
     */

    public void setStatus(PlayerSessionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Current status of the player session. Possible player session states
     * include:
     * <ul>
     * <li>RESERVED: The player session request has been received, but the
     * player has not yet connected to the game server and/or been validated.</li>
     * <li>ACTIVE: The player has been validated by the game server and is
     * currently connected.</li>
     * <li>COMPLETED: The player connection has been dropped.</li>
     * <li>TIMEDOUT: A player session request was received, but the player did
     * not connect and/or was not validated within the time-out limit (60
     * seconds).</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the player session. Possible player session
     *        states include:
     *        <ul>
     *        <li>RESERVED: The player session request has been received, but
     *        the player has not yet connected to the game server and/or been
     *        validated.</li>
     *        <li>ACTIVE: The player has been validated by the game server and
     *        is currently connected.</li>
     *        <li>COMPLETED: The player connection has been dropped.</li>
     *        <li>TIMEDOUT: A player session request was received, but the
     *        player did not connect and/or was not validated within the
     *        time-out limit (60 seconds).</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PlayerSessionStatus
     */

    public PlayerSession withStatus(PlayerSessionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Game session IP address. All player sessions reference the game session
     * location.
     * </p>
     * 
     * @param ipAddress
     *        Game session IP address. All player sessions reference the game
     *        session location.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * Game session IP address. All player sessions reference the game session
     * location.
     * </p>
     * 
     * @return Game session IP address. All player sessions reference the game
     *         session location.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * Game session IP address. All player sessions reference the game session
     * location.
     * </p>
     * 
     * @param ipAddress
     *        Game session IP address. All player sessions reference the game
     *        session location.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PlayerSession withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPlayerSessionId() != null)
            sb.append("PlayerSessionId: " + getPlayerSessionId() + ",");
        if (getPlayerId() != null)
            sb.append("PlayerId: " + getPlayerId() + ",");
        if (getGameSessionId() != null)
            sb.append("GameSessionId: " + getGameSessionId() + ",");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTerminationTime() != null)
            sb.append("TerminationTime: " + getTerminationTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlayerSession == false)
            return false;
        PlayerSession other = (PlayerSession) obj;
        if (other.getPlayerSessionId() == null
                ^ this.getPlayerSessionId() == null)
            return false;
        if (other.getPlayerSessionId() != null
                && other.getPlayerSessionId().equals(this.getPlayerSessionId()) == false)
            return false;
        if (other.getPlayerId() == null ^ this.getPlayerId() == null)
            return false;
        if (other.getPlayerId() != null
                && other.getPlayerId().equals(this.getPlayerId()) == false)
            return false;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null
                && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null
                && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTerminationTime() == null
                ^ this.getTerminationTime() == null)
            return false;
        if (other.getTerminationTime() != null
                && other.getTerminationTime().equals(this.getTerminationTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPlayerSessionId() == null) ? 0 : getPlayerSessionId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPlayerId() == null) ? 0 : getPlayerId().hashCode());
        hashCode = prime
                * hashCode
                + ((getGameSessionId() == null) ? 0 : getGameSessionId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminationTime() == null) ? 0 : getTerminationTime()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public PlayerSession clone() {
        try {
            return (PlayerSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
