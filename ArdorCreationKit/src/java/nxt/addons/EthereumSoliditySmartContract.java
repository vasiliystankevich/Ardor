package nxt.addons;

import nxt.Nxt;
import nxt.http.APIServlet;

public class EthereumSoliditySmartContract implements AddOn
{
    private final String beforeShutdownScript = Nxt.getStringProperty("nxt.EthereumSoliditySmartContract ");

    @Override
    public void init() {

    }

    @Override
    public void shutdown() {

    }

    @Override
    public APIServlet.APIRequestHandler getAPIRequestHandler() {
        return null;
    }
}
