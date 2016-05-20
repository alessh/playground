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
 * A game session's properties and the protection policy currently in force.
 * </p>
 */
public class GameSessionDetail implements Serializable, Cloneable {

    private GameSession gameSession;
    /**
     * <p>
     * Current status of protection for the game session.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     */
    private String protectionPolicy;

    /**
     * @param gameSession
     */

    public void setGameSession(GameSession gameSession) {
        this.gameSession = gameSession;
    }

    /**
     * @return
     */

    public GameSession getGameSession() {
        return this.gameSession;
    }

    /**
     * @param gameSession
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GameSessionDetail withGameSession(GameSession gameSession) {
        setGameSession(gameSession);
        return this;
    }

    /**
     * <p>
     * Current status of protection for the game session.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     * 
     * @param protectionPolicy
     *        Current status of protection for the game session.
     *        <ul>
     *        <li>NoProtection: The game session can be terminated during a
     *        scale-down event.</li>
     *        <li>FullProtection: If the game session is in an ACTIVE status, it
     *        cannot be terminated during a scale-down event.</li>
     *        </ul>
     * @see ProtectionPolicy
     */

    public void setProtectionPolicy(String protectionPolicy) {
        this.protectionPolicy = protectionPolicy;
    }

    /**
     * <p>
     * Current status of protection for the game session.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     * 
     * @return Current status of protection for the game session.
     *         <ul>
     *         <li>NoProtection: The game session can be terminated during a
     *         scale-down event.</li>
     *         <li>FullProtection: If the game session is in an ACTIVE status,
     *         it cannot be terminated during a scale-down event.</li>
     *         </ul>
     * @see ProtectionPolicy
     */

    public String getProtectionPolicy() {
        return this.protectionPolicy;
    }

    /**
     * <p>
     * Current status of protection for the game session.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     * 
     * @param protectionPolicy
     *        Current status of protection for the game session.
     *        <ul>
     *        <li>NoProtection: The game session can be terminated during a
     *        scale-down event.</li>
     *        <li>FullProtection: If the game session is in an ACTIVE status, it
     *        cannot be terminated during a scale-down event.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ProtectionPolicy
     */

    public GameSessionDetail withProtectionPolicy(String protectionPolicy) {
        setProtectionPolicy(protectionPolicy);
        return this;
    }

    /**
     * <p>
     * Current status of protection for the game session.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     * 
     * @param protectionPolicy
     *        Current status of protection for the game session.
     *        <ul>
     *        <li>NoProtection: The game session can be terminated during a
     *        scale-down event.</li>
     *        <li>FullProtection: If the game session is in an ACTIVE status, it
     *        cannot be terminated during a scale-down event.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ProtectionPolicy
     */

    public void setProtectionPolicy(ProtectionPolicy protectionPolicy) {
        this.protectionPolicy = protectionPolicy.toString();
    }

    /**
     * <p>
     * Current status of protection for the game session.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     * 
     * @param protectionPolicy
     *        Current status of protection for the game session.
     *        <ul>
     *        <li>NoProtection: The game session can be terminated during a
     *        scale-down event.</li>
     *        <li>FullProtection: If the game session is in an ACTIVE status, it
     *        cannot be terminated during a scale-down event.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ProtectionPolicy
     */

    public GameSessionDetail withProtectionPolicy(
            ProtectionPolicy protectionPolicy) {
        setProtectionPolicy(protectionPolicy);
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
        if (getGameSession() != null)
            sb.append("GameSession: " + getGameSession() + ",");
        if (getProtectionPolicy() != null)
            sb.append("ProtectionPolicy: " + getProtectionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameSessionDetail == false)
            return false;
        GameSessionDetail other = (GameSessionDetail) obj;
        if (other.getGameSession() == null ^ this.getGameSession() == null)
            return false;
        if (other.getGameSession() != null
                && other.getGameSession().equals(this.getGameSession()) == false)
            return false;
        if (other.getProtectionPolicy() == null
                ^ this.getProtectionPolicy() == null)
            return false;
        if (other.getProtectionPolicy() != null
                && other.getProtectionPolicy().equals(
                        this.getProtectionPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGameSession() == null) ? 0 : getGameSession().hashCode());
        hashCode = prime
                * hashCode
                + ((getProtectionPolicy() == null) ? 0 : getProtectionPolicy()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GameSessionDetail clone() {
        try {
            return (GameSessionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
