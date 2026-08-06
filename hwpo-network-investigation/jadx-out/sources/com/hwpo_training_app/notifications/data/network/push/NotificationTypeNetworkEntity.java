package com.hwpo_training_app.notifications.data.network.push;

import defpackage.hv5;
import defpackage.j26;
import defpackage.lt2;
import defpackage.rd9;
import defpackage.ss5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public enum NotificationTypeNetworkEntity {
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_LEADERBOARD_NEW_COMMENT("client_leaderboard_new_comment"),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_LEADERBOARD_CHAT_MENTION("client_leaderboard_chat_mention"),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_BONUS_PLAN_REMIND("client_bonus_plan_remind");

    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>> u = hv5.c(j26.t, new lt2(1));
    public final String t;

    NotificationTypeNetworkEntity(String str) {
        this.t = str;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<NotificationTypeNetworkEntity> serializer() {
            return (KSerializer) NotificationTypeNetworkEntity.u.getValue();
        }

        private Companion() {
        }
    }
}
