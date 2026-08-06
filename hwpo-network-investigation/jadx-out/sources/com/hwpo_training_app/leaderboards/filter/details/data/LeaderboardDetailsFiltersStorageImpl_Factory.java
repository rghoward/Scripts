package com.hwpo_training_app.leaderboards.filter.details.data;

import defpackage.mf8;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsFiltersStorageImpl_Factory implements mf8 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class InstanceHolder {
        static {
            new LeaderboardDetailsFiltersStorageImpl_Factory();
        }

        private InstanceHolder() {
        }
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new LeaderboardDetailsFiltersStorageImpl();
    }
}
