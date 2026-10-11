package me.nik.crazybosses.api;

public class CrazyBossesAPIProvider {

    private static CrazyBossesAPI API = null;

    public CrazyBossesAPIProvider() {
    }

    public static CrazyBossesAPI getAPI() {
        return API;
    }

    /**
     * Internal use by CrazyBosses only!
     *
     * @param api CrazyBossesAPI
     */
    @Deprecated
    public static void register(CrazyBossesAPI api) {
        API = api;
    }
}
