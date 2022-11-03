package com.inductiveautomation.ignition.examples.training;

import com.inductiveautomation.ignition.common.licensing.LicenseState;
import com.inductiveautomation.ignition.common.script.ScriptManager;
import com.inductiveautomation.ignition.common.script.hints.PropertiesFileDocProvider;
import com.inductiveautomation.ignition.common.util.LoggerEx;
import com.inductiveautomation.ignition.gateway.clientcomm.ClientReqSession;
import com.inductiveautomation.ignition.gateway.model.AbstractGatewayModuleHook;
import com.inductiveautomation.ignition.gateway.model.GatewayContext;

public class GatewayHook extends AbstractGatewayModuleHook {

    private static final LoggerEx LOGGER = LoggerEx.newBuilder().build(GatewayHook.class);

    private final GatewayScriptModule scriptModule = new GatewayScriptModule();

    @Override
    public void setup(GatewayContext gatewayContext) {
        LOGGER.info("setup()");
    }

    @Override
    public void startup(LicenseState licenseState) {
        LOGGER.info("startup()");
    }

    @Override
    public void shutdown() {
        LOGGER.info("shutdown()");
    }

    @Override
    public void initializeScriptManager(ScriptManager manager) {
        super.initializeScriptManager(manager);

        manager.addScriptModule(
            "system.example",
            scriptModule,
            new PropertiesFileDocProvider()
        );
    }

    @Override
    public Object getRPCHandler(ClientReqSession session, String projectName) {
        return scriptModule;
    }
}
