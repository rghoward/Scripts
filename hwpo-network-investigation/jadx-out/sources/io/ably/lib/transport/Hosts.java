package io.ably.lib.transport;

import defpackage.sk0;
import defpackage.w27;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Hosts {
    private final String defaultHost;
    private final String[] fallbackHosts;
    private final boolean fallbackHostsIsDefault;
    private final boolean fallbackHostsUseDefault;
    private final long fallbackRetryTimeout;
    private final Preferred preferred = new Preferred();
    private final String primaryHost;
    private final boolean primaryHostIsDefault;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Preferred {
        private long expiry;
        private String host;

        private Preferred() {
        }

        public void clear() {
            this.host = null;
            this.expiry = 0L;
        }

        public String getHost() {
            return this.host;
        }

        public String getHostOrClearIfExpired() {
            long j = this.expiry;
            if (j > 0 && j <= System.currentTimeMillis()) {
                clear();
            }
            return this.host;
        }

        public boolean isHost(String str) {
            String str2 = this.host;
            if (str2 == null) {
                return str == null;
            }
            return str2.equals(str);
        }

        public void setHost(String str, long j) {
            this.host = str;
            this.expiry = j;
        }
    }

    public Hosts(String str, String str2, ClientOptions clientOptions) throws AblyException {
        this.defaultHost = str2;
        this.fallbackHostsUseDefault = clientOptions.fallbackHostsUseDefault;
        boolean z = true;
        boolean z2 = (str == null || str.equalsIgnoreCase(str2)) ? false : true;
        String[] environmentFallbackHosts = clientOptions.fallbackHosts;
        if (clientOptions.fallbackHostsUseDefault) {
            if (environmentFallbackHosts != null) {
                throw sk0.b(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "fallbackHosts and fallbackHostsUseDefault cannot both be set");
            }
            if (clientOptions.port != 0 || clientOptions.tlsPort != 0) {
                throw sk0.b(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "fallbackHostsUseDefault cannot be set when port or tlsPort are set");
            }
            environmentFallbackHosts = Defaults.HOST_FALLBACKS;
        }
        String str3 = clientOptions.environment;
        if (str3 != null && !str3.isEmpty() && !"production".equalsIgnoreCase(clientOptions.environment)) {
            z = false;
        }
        if (!z2 && environmentFallbackHosts == null && clientOptions.port == 0 && clientOptions.tlsPort == 0) {
            environmentFallbackHosts = z ? Defaults.HOST_FALLBACKS : Defaults.getEnvironmentFallbackHosts(clientOptions.environment);
        }
        if (z2) {
            this.primaryHost = str;
            if (clientOptions.environment != null) {
                throw sk0.b(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "cannot set both restHost/realtimeHost and environment options");
            }
        } else {
            this.primaryHost = z ? str2 : w27.a(new StringBuilder(), clientOptions.environment, "-", str2);
        }
        this.primaryHostIsDefault = this.primaryHost.equalsIgnoreCase(str2);
        this.fallbackHostsIsDefault = Arrays.equals(Defaults.HOST_FALLBACKS, environmentFallbackHosts);
        String[] strArr = environmentFallbackHosts == null ? new String[0] : (String[]) environmentFallbackHosts.clone();
        this.fallbackHosts = strArr;
        Collections.shuffle(Arrays.asList(strArr));
        this.fallbackRetryTimeout = clientOptions.fallbackRetryTimeout;
    }

    public synchronized int fallbackHostsRemaining(String str) {
        if (this.fallbackHosts == null) {
            return 0;
        }
        if (!str.equals(this.primaryHost) && !str.equals(this.preferred.getHost())) {
            String[] strArr = this.fallbackHosts;
            return (strArr.length - Arrays.asList(strArr).indexOf(str)) - 1;
        }
        return this.fallbackHosts.length;
    }

    public synchronized String getFallback(String str) {
        int i;
        if (this.fallbackHosts == null) {
            return null;
        }
        if (str.equals(this.primaryHost)) {
            if (!this.primaryHostIsDefault && !this.fallbackHostsUseDefault && this.fallbackHostsIsDefault) {
                return null;
            }
            i = 0;
        } else {
            if (str.equals(this.preferred.getHostOrClearIfExpired())) {
                this.preferred.clear();
                return this.primaryHost;
            }
            int iIndexOf = Arrays.asList(this.fallbackHosts).indexOf(str);
            if (iIndexOf < 0) {
                return null;
            }
            i = iIndexOf + 1;
        }
        String[] strArr = this.fallbackHosts;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    public synchronized String getPreferredHost() {
        String hostOrClearIfExpired;
        hostOrClearIfExpired = this.preferred.getHostOrClearIfExpired();
        if (hostOrClearIfExpired == null) {
            hostOrClearIfExpired = this.primaryHost;
        }
        return hostOrClearIfExpired;
    }

    public String getPrimaryHost() {
        return this.primaryHost;
    }

    public synchronized void setPreferredHost(String str, boolean z) {
        try {
            if (this.preferred.isHost(str)) {
                return;
            }
            boolean zEquals = str.equals(this.primaryHost);
            Preferred preferred = this.preferred;
            if (zEquals) {
                preferred.clear();
            } else {
                preferred.setHost(str, z ? System.currentTimeMillis() + this.fallbackRetryTimeout : 0L);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
