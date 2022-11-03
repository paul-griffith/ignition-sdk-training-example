package com.inductiveautomation.ignition.examples.training.designer;

import com.inductiveautomation.ignition.examples.training.client.ClientScriptModule;
import com.inductiveautomation.ignition.common.script.ScriptManager;
import com.inductiveautomation.ignition.common.script.hints.PropertiesFileDocProvider;
import com.inductiveautomation.ignition.designer.model.AbstractDesignerModuleHook;

public class DesignerHook extends AbstractDesignerModuleHook {

    @Override
    public void initializeScriptManager(ScriptManager manager) {
        super.initializeScriptManager(manager);

        manager.addScriptModule(
            "system.example",
            new ClientScriptModule(),
            new PropertiesFileDocProvider()
        );
    }

}
