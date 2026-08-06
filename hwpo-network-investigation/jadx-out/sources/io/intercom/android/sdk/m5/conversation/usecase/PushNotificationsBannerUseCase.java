package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.c56;
import defpackage.i37;
import defpackage.mh4;
import defpackage.qq2;
import defpackage.z;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PushNotificationsBannerState;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PushNotificationsBannerUseCase {
    public static final int $stable = 8;
    private final mh4<AppConfig> config;
    private final IntercomDataLayer intercomDataLayer;

    public /* synthetic */ PushNotificationsBannerUseCase(IntercomDataLayer intercomDataLayer, mh4 mh4Var, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? Injector.get().getDataLayer() : intercomDataLayer, (i & 2) != 0 ? new c56(1) : mh4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return (AppConfig) z.a();
    }

    public final void invoke(i37<ConversationClientState> i37Var, boolean z) {
        ConversationClientState value;
        i37Var.getClass();
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, (z || this.intercomDataLayer.getPushNotificationsBannerDismissed().getValue().booleanValue()) ? null : new PushNotificationsBannerState(this.config.invoke().getAskUsersToAllowNotifications()), null, null, 7340031, null)));
    }

    public PushNotificationsBannerUseCase(IntercomDataLayer intercomDataLayer, mh4<AppConfig> mh4Var) {
        intercomDataLayer.getClass();
        mh4Var.getClass();
        this.intercomDataLayer = intercomDataLayer;
        this.config = mh4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PushNotificationsBannerUseCase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
