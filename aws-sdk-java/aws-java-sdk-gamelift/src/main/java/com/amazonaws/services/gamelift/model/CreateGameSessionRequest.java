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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class CreateGameSessionRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet. Each request must reference either a fleet
     * ID or alias ID, but not both.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Unique identifier for a fleet alias. Each request must reference either a
     * fleet ID or alias ID, but not both.
     * </p>
     */
    private String aliasId;
    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the
     * game session.
     * </p>
     */
    private Integer maximumPlayerSessionCount;
    /**
     * <p>
     * Descriptive label associated with this game session. Session names do not
     * need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Set of properties used to administer a game session. These properties are
     * passed to your game server.
     * </p>
     */
    private java.util.List<GameProperty> gameProperties;

    /**
     * <p>
     * Unique identifier for a fleet. Each request must reference either a fleet
     * ID or alias ID, but not both.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. Each request must reference either
     *        a fleet ID or alias ID, but not both.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. Each request must reference either a fleet
     * ID or alias ID, but not both.
     * </p>
     * 
     * @return Unique identifier for a fleet. Each request must reference either
     *         a fleet ID or alias ID, but not both.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. Each request must reference either a fleet
     * ID or alias ID, but not both.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. Each request must reference either
     *        a fleet ID or alias ID, but not both.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGameSessionRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a fleet alias. Each request must reference either a
     * fleet ID or alias ID, but not both.
     * </p>
     * 
     * @param aliasId
     *        Unique identifier for a fleet alias. Each request must reference
     *        either a fleet ID or alias ID, but not both.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * Unique identifier for a fleet alias. Each request must reference either a
     * fleet ID or alias ID, but not both.
     * </p>
     * 
     * @return Unique identifier for a fleet alias. Each request must reference
     *         either a fleet ID or alias ID, but not both.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * Unique identifier for a fleet alias. Each request must reference either a
     * fleet ID or alias ID, but not both.
     * </p>
     * 
     * @param aliasId
     *        Unique identifier for a fleet alias. Each request must reference
     *        either a fleet ID or alias ID, but not both.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGameSessionRequest withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the
     * game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum number of players that can be connected simultaneously to
     *        the game session.
     */

    public void setMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        this.maximumPlayerSessionCount = maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the
     * game session.
     * </p>
     * 
     * @return Maximum number of players that can be connected simultaneously to
     *         the game session.
     */

    public Integer getMaximumPlayerSessionCount() {
        return this.maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the
     * game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum number of players that can be connected simultaneously to
     *        the game session.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGameSessionRequest withMaximumPlayerSessionCount(
            Integer maximumPlayerSessionCount) {
        setMaximumPlayerSessionCount(maximumPlayerSessionCount);
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

    public CreateGameSessionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Set of properties used to administer a game session. These properties are
     * passed to your game server.
     * </p>
     * 
     * @return Set of properties used to administer a game session. These
     *         properties are passed to your game server.
     */

    public java.util.List<GameProperty> getGameProperties() {
        return gameProperties;
    }

    /**
     * <p>
     * Set of properties used to administer a game session. These properties are
     * passed to your game server.
     * </p>
     * 
     * @param gameProperties
     *        Set of properties used to administer a game session. These
     *        properties are passed to your game server.
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
     * Set of properties used to administer a game session. These properties are
     * passed to your game server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGameProperties(java.util.Collection)} or
     * {@link #withGameProperties(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param gameProperties
     *        Set of properties used to administer a game session. These
     *        properties are passed to your game server.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGameSessionRequest withGameProperties(
            GameProperty... gameProperties) {
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
     * Set of properties used to administer a game session. These properties are
     * passed to your game server.
     * </p>
     * 
     * @param gameProperties
     *        Set of properties used to administer a game session. These
     *        properties are passed to your game server.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGameSessionRequest withGameProperties(
            java.util.Collection<GameProperty> gameProperties) {
        setGameProperties(gameProperties);
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
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getAliasId() != null)
            sb.append("AliasId: " + getAliasId() + ",");
        if (getMaximumPlayerSessionCount() != null)
            sb.append("MaximumPlayerSessionCount: "
                    + getMaximumPlayerSessionCount() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getGameProperties() != null)
            sb.append("GameProperties: " + getGameProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGameSessionRequest == false)
            return false;
        CreateGameSessionRequest other = (CreateGameSessionRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null
                && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null
                && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        if (other.getMaximumPlayerSessionCount() == null
                ^ this.getMaximumPlayerSessionCount() == null)
            return false;
        if (other.getMaximumPlayerSessionCount() != null
                && other.getMaximumPlayerSessionCount().equals(
                        this.getMaximumPlayerSessionCount()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGameProperties() == null
                ^ this.getGameProperties() == null)
            return false;
        if (other.getGameProperties() != null
                && other.getGameProperties().equals(this.getGameProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode
                + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaximumPlayerSessionCount() == null) ? 0
                        : getMaximumPlayerSessionCount().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getGameProperties() == null) ? 0 : getGameProperties()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateGameSessionRequest clone() {
        return (CreateGameSessionRequest) super.clone();
    }
}