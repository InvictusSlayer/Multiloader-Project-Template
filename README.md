This repository is a template for setting up a multi-loader Minecraft mod using [Architectury](https://docs.architectury.dev/start) for 1.18.2-1.21.1. Clone 
this repo and go through the files `fabric.mod.json`, `mods.toml`, `neoforge.mods.toml` as 
well as all the **package names** and `.mixins.json` files and change all occurrences of the word `template` to your 
mod-id. In addition, change instances of my name `invictusslayer` to your own. After doing so change `gradle.properties` 
so that it contains the appropriate values for your repository. This `README.md` can also be used as a template to 
design your own as GitHub will display it on your repository. For NeoForge 1.20.6+ ensure the `mods.toml` file is 
named `neoforge.mods.toml`. For versions where there is no mod-loader version listed in `gradle.properties`, there 
is no Architectury support so delete that module when appropriate (I'm looking at you Forge 1.21). I have removed some 
minor versions as there is significantly less demand for these. This template uses the mappings from [ParchmentMC](https://parchmentmc.org/docs/getting-started) 
but these can be changed to the official mojang mappings or yarn by following the appropriate steps [here](https://docs.architectury.dev/plugin/get_started).

Up to date versions for dependencies can be found in `gradle.properties`.