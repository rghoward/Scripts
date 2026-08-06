package io.ably.lib.util;

import io.ably.lib.transport.Defaults;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class AgentHeaderCreator {
    public static final String AGENT_DIVIDER = "/";
    private static final String AGENT_ENTRY_SEPARATOR = " ";

    public static String create(Map<String, String> map, PlatformAgentProvider platformAgentProvider) {
        StringBuilder sb = new StringBuilder();
        sb.append(Defaults.ABLY_AGENT_VERSION);
        if (map != null && !map.isEmpty()) {
            sb.append(AGENT_ENTRY_SEPARATOR);
            sb.append(getAdditionalAgentEntries(map));
        }
        String strCreatePlatformAgent = platformAgentProvider.createPlatformAgent();
        if (strCreatePlatformAgent != null) {
            sb.append(AGENT_ENTRY_SEPARATOR);
            sb.append(strCreatePlatformAgent);
        }
        return sb.toString();
    }

    private static String getAdditionalAgentEntries(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            sb.append(str);
            if (str2 != null) {
                sb.append(AGENT_DIVIDER);
                sb.append(str2);
            }
            sb.append(AGENT_ENTRY_SEPARATOR);
        }
        return sb.toString().trim();
    }
}
