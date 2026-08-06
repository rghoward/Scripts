package io.intercom.android.sdk.m5.data;

import defpackage.ag6;
import defpackage.el5;
import defpackage.et2;
import defpackage.i23;
import defpackage.n72;
import defpackage.oy0;
import defpackage.u72;
import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UnreadCountTracker {
    public static final int $stable = 8;
    private final IntercomDataLayer dataLayer;
    private final ConcurrentHashMap<UnreadConversationCountListener, el5> listeners;

    public UnreadCountTracker(IntercomDataLayer intercomDataLayer) {
        intercomDataLayer.getClass();
        this.dataLayer = intercomDataLayer;
        this.listeners = new ConcurrentHashMap<>();
    }

    public static void addListener$default(UnreadCountTracker unreadCountTracker, UnreadConversationCountListener unreadConversationCountListener, n72 n72Var, int i, Object obj) {
        if ((i & 2) != 0) {
            et2 et2Var = i23.a;
            n72Var = ag6.a;
        }
        unreadCountTracker.addListener(unreadConversationCountListener, n72Var);
    }

    public final void addListener(UnreadConversationCountListener unreadConversationCountListener, n72 n72Var) {
        unreadConversationCountListener.getClass();
        n72Var.getClass();
        this.listeners.put(unreadConversationCountListener, oy0.d(u72.a(n72Var), null, null, new UnreadCountTracker$addListener$job$1(this, unreadConversationCountListener, null), 3));
    }

    public final IntercomDataLayer getDataLayer() {
        return this.dataLayer;
    }

    public final ConcurrentHashMap<UnreadConversationCountListener, el5> getListeners() {
        return this.listeners;
    }

    public final void removeListener(UnreadConversationCountListener unreadConversationCountListener) {
        el5 el5VarRemove;
        unreadConversationCountListener.getClass();
        if (!this.listeners.containsKey(unreadConversationCountListener) || (el5VarRemove = this.listeners.remove(unreadConversationCountListener)) == null) {
            return;
        }
        el5VarRemove.k(null);
    }
}
