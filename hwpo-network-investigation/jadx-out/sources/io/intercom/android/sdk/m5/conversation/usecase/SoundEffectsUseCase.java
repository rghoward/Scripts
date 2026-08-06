package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.qq2;
import defpackage.u;
import defpackage.z;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SoundEffectsUseCase {
    public static final int $stable = 8;
    private final AppConfig appConfig;
    private final SoundPlayer soundPlayer;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Action.values().length];
            try {
                iArr[Action.MESSAGE_SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.ADMIN_MESSAGE_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Action.OPERATOR_MESSAGE_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Action.MESSAGE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SoundEffectsUseCase(AppConfig appConfig, SoundPlayer soundPlayer, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? (AppConfig) z.a() : appConfig, soundPlayer);
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final SoundPlayer getSoundPlayer() {
        return this.soundPlayer;
    }

    public final void invoke$intercom_sdk_base_release(Action action) {
        action.getClass();
        if (this.appConfig.isAudioEnabled()) {
            int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            if (i == 1) {
                this.soundPlayer.playMessageSentSound();
                return;
            }
            if (i == 2) {
                this.soundPlayer.playAdminMessageReceivedSound();
                return;
            }
            if (i == 3) {
                this.soundPlayer.playOperatorMessageReceivedSound();
            } else if (i == 4) {
                this.soundPlayer.playMessageFailedSound();
            } else {
                u.b();
            }
        }
    }

    public SoundEffectsUseCase(AppConfig appConfig, SoundPlayer soundPlayer) {
        appConfig.getClass();
        soundPlayer.getClass();
        this.appConfig = appConfig;
        this.soundPlayer = soundPlayer;
    }
}
