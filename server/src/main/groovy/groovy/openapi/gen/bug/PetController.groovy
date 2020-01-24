/*
 * Copyright 2020 Rundeck, Inc. (http://rundeck.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package groovy.openapi.gen.bug

import groovy.openapi.gen.bug.models.House
import groovy.openapi.gen.bug.models.Owner
import groovy.openapi.gen.bug.models.Pet
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/")
class PetController {

    Map<String,Pet> petDb = [:]

    PetController() {
     petDb["george"] = new Pet(name:"george",age: 5, description: "A friendly bulldog")
    }

    @Get("/pet/{name}")
    Pet getPetByName(String name) {
        return petDb[name]
    }

    @Post("/house/{petName}")
    Pet setHouse(String petName, @Body House house) {
        petDb[petName].house = house
        petDb[petName]
    }

    @Post("/owner/{petName}")
    Pet setOwner(String petName, @Body Owner owner) {
        petDb[petName].owner = owner
        petDb[petName]
    }
}
