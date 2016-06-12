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
public class CreatePlayerSessionsRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a game session.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * List of unique identifiers for the players to be added.
     * </p>
     */
    private java.util.List<String> playerIds;

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

    public CreatePlayerSessionsRequest withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * List of unique identifiers for the players to be added.
     * </p>
     * 
     * @return List of unique identifiers for the players to be added.
     */

    public java.util.List<String> getPlayerIds() {
        return playerIds;
    }

    /**
     * <p>
     * List of unique identifiers for the players to be added.
     * </p>
     * 
     * @param playerIds
     *        List of unique identifiers for the players to be added.
     */

    public void setPlayerIds(java.util.Collection<String> playerIds) {
        if (playerIds == null) {
            this.playerIds = null;
            return;
        }

        this.playerIds = new java.util.ArrayList<String>(playerIds);
    }

    /**
     * <p>
     * List of unique identifiers for the players to be added.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPlayerIds(java.util.Collection)} or
     * {@link #withPlayerIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param playerIds
     *        List of unique identifiers for the players to be added.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreatePlayerSessionsRequest withPlayerIds(String... playerIds) {
        if (this.playerIds == null) {
            setPlayerIds(new java.util.ArrayList<String>(playerIds.length));
        }
        for (String ele : playerIds) {
            this.playerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of unique identifiers for the players to be added.
     * </p>
     * 
     * @param playerIds
     *        List of unique identifiers for the players to be added.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreatePlayerSessionsRequest withPlayerIds(
            java.util.Collection<String> playerIds) {
        setPlayerIds(playerIds);
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
        if (getPlayerIds() != null)
            sb.append("PlayerIds: " + getPlayerIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlayerSessionsRequest == false)
            return false;
        CreatePlayerSessionsRequest other = (CreatePlayerSessionsRequest) obj;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null
                && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getPlayerIds() == null ^ this.getPlayerIds() == null)
            return false;
        if (other.getPlayerIds() != null
                && other.getPlayerIds().equals(this.getPlayerIds()) == false)
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
                + ((getPlayerIds() == null) ? 0 : getPlayerIds().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlayerSessionsRequest clone() {
        return (CreatePlayerSessionsRequest) super.clone();
    }
}