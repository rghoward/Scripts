package io.intercom.android.sdk.models;

import defpackage.fh0;
import defpackage.qq2;
import defpackage.uo2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HostAppState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final HostAppState NULL = new HostAppState(null, false, 0, 7, null);
    private final long backgroundedTimestamp;
    private final AppLifecycleState lifecycleState;
    private final boolean sessionStartedSinceLastBackgrounded;

    public /* synthetic */ HostAppState(AppLifecycleState appLifecycleState, boolean z, long j, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? AppLifecycleState.UNINITIALIZED : appLifecycleState, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0L : j);
    }

    public static /* synthetic */ HostAppState copy$default(HostAppState hostAppState, AppLifecycleState appLifecycleState, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            appLifecycleState = hostAppState.lifecycleState;
        }
        if ((i & 2) != 0) {
            z = hostAppState.sessionStartedSinceLastBackgrounded;
        }
        if ((i & 4) != 0) {
            j = hostAppState.backgroundedTimestamp;
        }
        return hostAppState.copy(appLifecycleState, z, j);
    }

    public final AppLifecycleState component1() {
        return this.lifecycleState;
    }

    public final boolean component2() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    public final long component3() {
        return this.backgroundedTimestamp;
    }

    public final HostAppState copy(AppLifecycleState appLifecycleState, boolean z, long j) {
        appLifecycleState.getClass();
        return new HostAppState(appLifecycleState, z, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAppState)) {
            return false;
        }
        HostAppState hostAppState = (HostAppState) obj;
        return this.lifecycleState == hostAppState.lifecycleState && this.sessionStartedSinceLastBackgrounded == hostAppState.sessionStartedSinceLastBackgrounded && this.backgroundedTimestamp == hostAppState.backgroundedTimestamp;
    }

    public final long getBackgroundedTimestamp() {
        return this.backgroundedTimestamp;
    }

    public final AppLifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    public final boolean getSessionStartedSinceLastBackgrounded() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    public int hashCode() {
        return Long.hashCode(this.backgroundedTimestamp) + uo2.a(this.lifecycleState.hashCode() * 31, this.sessionStartedSinceLastBackgrounded, 31);
    }

    public final boolean isBackgrounded() {
        return this.lifecycleState == AppLifecycleState.BACKGROUND;
    }

    public final boolean isForeground() {
        return this.lifecycleState == AppLifecycleState.FOREGROUND;
    }

    public final boolean isUninitialized() {
        return this.lifecycleState == AppLifecycleState.UNINITIALIZED;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HostAppState(lifecycleState=");
        sb.append(this.lifecycleState);
        sb.append(", sessionStartedSinceLastBackgrounded=");
        sb.append(this.sessionStartedSinceLastBackgrounded);
        sb.append(", backgroundedTimestamp=");
        return fh0.b(sb, this.backgroundedTimestamp, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }

    public HostAppState(AppLifecycleState appLifecycleState, boolean z, long j) {
        appLifecycleState.getClass();
        this.lifecycleState = appLifecycleState;
        this.sessionStartedSinceLastBackgrounded = z;
        this.backgroundedTimestamp = j;
    }

    public HostAppState() {
        this(null, false, 0L, 7, null);
    }
}
