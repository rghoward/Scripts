package com.hwpo_training_app.leaderboards.common.data.network.request;

import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.v46;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public enum LeaderboardTypeNetworkEntity {
    LEADERBOARD("leaderboard"),
    CHALLENGE("challenge");

    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>> u = hv5.c(j26.t, new v46(0));
    public final String t;

    LeaderboardTypeNetworkEntity(String str) {
        this.t = str;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardTypeNetworkEntity> serializer() {
            return (KSerializer) LeaderboardTypeNetworkEntity.u.getValue();
        }

        private Companion() {
        }
    }
}
