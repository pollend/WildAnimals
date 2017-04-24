/*
 * Copyright 2017 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.wildAnimals.FleeOnHit;

import org.terasology.entitySystem.Component;
import org.terasology.entitySystem.entity.EntityRef;

public class FleeOnHitComponent implements Component {
    public float minDistance = 10f;
    public float speedMultiplier = 1.2f;
    public EntityRef instigator;
    public float distanceFromInstigator;
    public long timeWhenHit;
}
