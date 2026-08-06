package com.hwpo_training_app.notifications.data.network.push.leaderboard;

import com.hwpo_training_app.notifications.domain.entity.LeaderboardKind;
import defpackage.f93;
import defpackage.hv5;
import defpackage.j26;
import defpackage.km5;
import defpackage.rd9;
import defpackage.ss5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public enum LeaderboardKindNetworkEntity implements f93<LeaderboardKind> {
    /* JADX INFO: Fake field, exist only in values array */
    EF2 { // from class: com.hwpo_training_app.notifications.data.network.push.leaderboard.LeaderboardKindNetworkEntity.LEADERBOARD
        @Override // defpackage.f93
        public final LeaderboardKind a() {
            return LeaderboardKind.t;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF7 { // from class: com.hwpo_training_app.notifications.data.network.push.leaderboard.LeaderboardKindNetworkEntity.FITR_CHALLENGE
        @Override // defpackage.f93
        public final LeaderboardKind a() {
            return LeaderboardKind.u;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF12 { // from class: com.hwpo_training_app.notifications.data.network.push.leaderboard.LeaderboardKindNetworkEntity.CLONED_CHALLENGE
        @Override // defpackage.f93
        public final LeaderboardKind a() {
            return LeaderboardKind.u;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF17 { // from class: com.hwpo_training_app.notifications.data.network.push.leaderboard.LeaderboardKindNetworkEntity.CHALLENGE
        @Override // defpackage.f93
        public final LeaderboardKind a() {
            return LeaderboardKind.u;
        }
    };

    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>> t = hv5.c(j26.t, new km5(1));

    LeaderboardKindNetworkEntity() {
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardKindNetworkEntity> serializer() {
            return (KSerializer) LeaderboardKindNetworkEntity.t.getValue();
        }

        private Companion() {
        }
    }
}
