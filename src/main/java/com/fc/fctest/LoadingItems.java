package com.fc.fctest;

import net.fabricmc.api.ModInitializer;

public class LoadingItems implements ModInitializer {
    @Override
    public void onInitialize() {
    FcItem.initialize();
    }
}
