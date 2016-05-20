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
 * Properties describing a game session.
 * </p>
 */
public class GameSession implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a game session.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * Descriptive label associated with this game session. Session names do not
     * need to be unique.
     * </p>
     */
    private String name;
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
     * Number of players currently in the game session.
     * </p>
     */
    private Integer currentPlayerSessionCount;
    /**
     * <p>
     * Maximum number of players allowed in the game session.
     * </p>
     */
    private Integer maximumPlayerSessionCount;
    /**
     * <p>
     * Current status of the game session. A game session must be in an ACTIVE
     * state to have player sessions.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Set of custom properties for the game session.
     * </p>
     */
    private java.util.List<GameProperty> gameProperties;
    /**
     * <p>
     * IP address of the game session.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     */
    private String playerSessionCreationPolicy;

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

    public GameSession withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * Descriptive label associated with this game session. Session names do not
     * need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with this game session. Session names
     *        do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label associated with this game session. Session names do not
     * need to be unique.
     * </p>
     * 
     * @return Descriptive label associated with this game session. Session
     *         names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label associated with this game session. Session names do not
     * need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with this game session. Session names
     *        do not need to be unique.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GameSession withName(String name) {
        setName(name);
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

    public GameSession withFleetId(String fleetId) {
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

    public GameSession withCreationTime(java.util.Date creationTime) {
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

    public GameSession withTerminationTime(java.util.Date terminationTime) {
        setTerminationTime(terminationTime);
        return this;
    }

    /**
     * <p>
     * Number of players currently in the game session.
     * </p>
     * 
     * @param currentPlayerSessionCount
     *        Number of players currently in the game session.
     */

    public void setCurrentPlayerSessionCount(Integer currentPlayerSessionCount) {
        this.currentPlayerSessionCount = currentPlayerSessionCount;
    }

    /**
     * <p>
     * Number of players currently in the game session.
     * </p>
     * 
     * @return Number of players currently in the game session.
     */

    public Integer getCurrentPlayerSessionCount() {
        return this.currentPlayerSessionCount;
    }

    /**
     * <p>
     * Number of players currently in the game session.
     * </p>
     * 
     * @param currentPlayerSessionCount
     *        Number of players currently in the game session.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GameSession withCurrentPlayerSessionCount(
            Integer currentPlayerSessionCount) {
        setCurrentPlayerSessionCount(currentPlayerSessionCount);
        return this;
    }

    /**
     * <p>
     * Maximum number of players allowed in the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum number of players allowed in the game session.
     */

    public void setMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        this.maximumPlayerSessionCount = maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum number of players allowed in the game session.
     * </p>
     * 
     * @return Maximum number of players allowed in the game session.
     */

    public Integer getMaximumPlayerSessionCount() {
        return this.maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum number of players allowed in the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum number of players allowed in the game session.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GameSession withMaximumPlayerSessionCount(
            Integer maximumPlayerSessionCount) {
        setMaximumPlayerSessionCount(maximumPlayerSessionCount);
        return this;
    }

    /**
     * <p>
     * Current status of the game session. A game session must be in an ACTIVE
     * state to have player sessions.
     * </p>
     * 
     * @param status
     *        Current status of the game session. A game session must be in an
     *        ACTIVE state to have player sessions.
     * @see GameSessionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the game session. A game session must be in an ACTIVE
     * state to have player sessions.
     * </p>
     * 
     * @return Current status of the game session. A game session must be in an
     *         ACTIVE state to have player sessions.
     * @see GameSessionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the game session. A game session must be in an ACTIVE
     * state to have player sessions.
     * </p>
     * 
     * @param status
     *        Current status of the game session. A game session must be in an
     *        ACTIVE state to have player sessions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see GameSessionStatus
     */

    public GameSession withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the game session. A game session must be in an ACTIVE
     * state to have player sessions.
     * </p>
     * 
     * @param status
     *        Current status of the game session. A game session must be in an
     *        ACTIVE state to have player sessions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see GameSessionStatus
     */

    public void setStatus(GameSessionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Current status of the game session. A game session must be in an ACTIVE
     * state to have player sessions.
     * </p>
     * 
     * @param status
     *        Current status of the game session. A game session must be in an
     *        ACTIVE state to have player sessions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see GameSessionStatus
     */

    public GameSession withStatus(GameSessionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Set of custom properties for the game session.
     * </p>
     * 
     * @return Set of custom properties for the game session.
     */

    public java.util.List<GameProperty> getGameProperties() {
        return gameProperties;
    }

    /**
     * <p>
     * Set of custom properties for the game session.
     * </p>
     * 
     * @param gameProperties
     *        Set of custom properties for the game session.
     */

    public void setGameProperties(
            java.util.Collection<GameProperty> gameProperties) {
        if (gameProperties == null) {
            this.gameProperties = null;
            return;
        }

        this.gameProperties = new java.util.ArrayList<GameProperty>(
                gameProperties);
    }

    /**
     * <p>
     * Set of custom properties for the game session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGameProperties(java.util.Collection)} or
     * {@link #withGameProperties(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param gameProperties
     *        Set of custom properties for the game session.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GameSession withGameProperties(GameProperty... gameProperties) {
        if (this.gameProperties == null) {
            setGameProperties(new java.util.ArrayList<GameProperty>(
                    gameProperties.length));
        }
        for (GameProperty ele : gameProperties) {
            this.gameProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set of custom properties for the game session.
     * </p>
     * 
     * @param gameProperties
     *        Set of custom properties for the game session.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GameSession withGameProperties(
            java.util.Collection<GameProperty> gameProperties) {
        setGameProperties(gameProperties);
        return this;
    }

    /**
     * <p>
     * IP address of the game session.
     * </p>
     * 
     * @param ipAddress
     *        IP address of the game session.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * IP address of the game session.
     * </p>
     * 
     * @return IP address of the game session.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * IP address of the game session.
     * </p>
     * 
     * @param ipAddress
     *        IP address of the game session.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GameSession withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Indicates whether or not the game session is accepting new
     *        players.
     * @see PlayerSessionCreationPolicy
     */

    public void setPlayerSessionCreationPolicy(
            String playerSessionCreationPolicy) {
        this.playerSessionCreationPolicy = playerSessionCreationPolicy;
    }

    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     * 
     * @return Indicates whether or not the game session is accepting new
     *         players.
     * @see PlayerSessionCreationPolicy
     */

    public String getPlayerSessionCreationPolicy() {
        return this.playerSessionCreationPolicy;
    }

    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Indicates whether or not the game session is accepting new
     *        players.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PlayerSessionCreationPolicy
     */

    public GameSession withPlayerSessionCreationPolicy(
            String playerSessionCreationPolicy) {
        setPlayerSessionCreationPolicy(playerSessionCreationPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Indicates whether or not the game session is accepting new
     *        players.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PlayerSessionCreationPolicy
     */

    public void setPlayerSessionCreationPolicy(
            PlayerSessionCreationPolicy playerSessionCreationPolicy) {
        this.playerSessionCreationPolicy = playerSessionCreationPolicy
                .toString();
    }

    /**
     * <p>
     * Indicates whether or not the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Indicates whether or not the game session is accepting new
     *        players.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PlayerSessionCreationPolicy
     */

    public GameSession withPlayerSessionCreationPolicy(
            PlayerSessionCreationPolicy playerSessionCreationPolicy) {
        setPlayerSessionCreationPolicy(playerSessionCreationPolicy);
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
        if (getGameSessionId() != null)
            sb.append("GameSessionId: " + getGameSessionId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTerminationTime() != null)
            sb.append("TerminationTime: " + getTerminationTime() + ",");
        if (getCurrentPlayerSessionCount() != null)
            sb.append("CurrentPlayerSessionCount: "
                    + getCurrentPlayerSessionCount() + ",");
        if (getMaximumPlayerSessionCount() != null)
            sb.append("MaximumPlayerSessionCount: "
                    + getMaximumPlayerSessionCount() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getGameProperties() != null)
            sb.append("GameProperties: " + getGameProperties() + ",");
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getPlayerSessionCreationPolicy() != null)
            sb.append("PlayerSessionCreationPolicy: "
                    + getPlayerSessionCreationPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameSession == false)
            return false;
        GameSession other = (GameSession) obj;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null
                && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
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
        if (other.getCurrentPlayerSessionCount() == null
                ^ this.getCurrentPlayerSessionCount() == null)
            return false;
        if (other.getCurrentPlayerSessionCount() != null
                && other.getCurrentPlayerSessionCount().equals(
                        this.getCurrentPlayerSessionCount()) == false)
            return false;
        if (other.getMaximumPlayerSessionCount() == null
                ^ this.getMaximumPlayerSessionCount() == null)
            return false;
        if (other.getMaximumPlayerSessionCount() != null
                && other.getMaximumPlayerSessionCount().equals(
                        this.getMaximumPlayerSessionCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getGameProperties() == null
                ^ this.getGameProperties() == null)
            return false;
        if (other.getGameProperties() != null
                && other.getGameProperties().equals(this.getGameProperties()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getPlayerSessionCreationPolicy() == null
                ^ this.getPlayerSessionCreationPolicy() == null)
            return false;
        if (other.getPlayerSessionCreationPolicy() != null
                && other.getPlayerSessionCreationPolicy().equals(
                        this.getPlayerSessionCreationPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGameSessionId() == null) ? 0 : getGameSessionId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
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
        hashCode = prime
                * hashCode
                + ((getCurrentPlayerSessionCount() == null) ? 0
                        : getCurrentPlayerSessionCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaximumPlayerSessionCount() == null) ? 0
                        : getMaximumPlayerSessionCount().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getGameProperties() == null) ? 0 : getGameProperties()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getPlayerSessionCreationPolicy() == null) ? 0
                        : getPlayerSessionCreationPolicy().hashCode());
        return hashCode;
    }

    @Override
    public GameSession clone() {
        try {
            return (GameSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
