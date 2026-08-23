This repository is a template for setting up a multi-loader Minecraft mods for version 1.20.1 on Fabric and Forge.

# Setup
To get started generate a new repository from this template. Clone your new repo and go through the files and replace
all instances of the mod ID, `template`, with your own. Do the same for the author name, `author`. Important files to
check are `fabric.mod.json`, `mods.toml` as well as all the package names and `*.mixins.json` names and contents. After
doing so change all relevant values in `gradle.properties` to match.

This template comes fully prepared for Mixins with [MixinExtras](https://github.com/LlamaLad7/MixinExtras).

This template uses the mappings from [ParchmentMC](https://parchmentmc.org/docs/getting-started) but these can be changed to the official mojang mappings or
yarn by following the appropriate steps [here](https://docs.architectury.dev/plugin/get_started).

For publishing, this template comes setup with [ModPublisher](https://github.com/firstdarkdev/modpublisher). This can be configured in the Fabric and Forge
`build.gradle` files. Modrinth and CurseForge IDs are defined in `gradle.properties`.

## Tips
For mod specific classes which will be present in most mods, e.g. `ModClient` and `ModFabric` classes, it is good
practice to name these with the mod name or initialisation for clarity between mods, i.e. `T[emplate]Client` and
`T[emplate]Fabric`. Full name is preferred if it is short.