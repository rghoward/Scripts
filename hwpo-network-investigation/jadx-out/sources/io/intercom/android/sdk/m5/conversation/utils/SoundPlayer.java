package io.intercom.android.sdk.m5.conversation.utils;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.SoundPool;
import com.intercom.twig.Twig;
import defpackage.qq2;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SoundPlayer {
    public static final int NOT_FOUND_ID = -1;
    private int messageReceivedId;
    private boolean messageReceivedLoaded;
    private int operatorReceivedId;
    private boolean operatorReceivedLoaded;
    private int replyFailedId;
    private boolean replyFailedLoaded;
    private int replySentId;
    private boolean replySentLoaded;
    private final SoundPool soundPool;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Twig TWIG = LumberMill.getLogger();

    public SoundPlayer() {
        SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(5).build()).build();
        soundPoolBuild.getClass();
        this.soundPool = soundPoolBuild;
        this.messageReceivedId = -1;
        this.replyFailedId = -1;
        this.replySentId = -1;
        this.operatorReceivedId = -1;
    }

    private final int loadSound(Context context, int i) {
        try {
            return this.soundPool.load(context, i, 1);
        } catch (Resources.NotFoundException e) {
            TWIG.e(e, "Could not play sound", new Object[0]);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadSounds$lambda$0(SoundPlayer soundPlayer, SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            if (i == soundPlayer.messageReceivedId) {
                soundPlayer.messageReceivedLoaded = true;
                return;
            }
            if (i == soundPlayer.replyFailedId) {
                soundPlayer.replyFailedLoaded = true;
            } else if (i == soundPlayer.replySentId) {
                soundPlayer.replySentLoaded = true;
            } else if (i == soundPlayer.operatorReceivedId) {
                soundPlayer.operatorReceivedLoaded = true;
            }
        }
    }

    private final void playIfLoaded(boolean z, int i) {
        if (!z || i == -1) {
            return;
        }
        this.soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public final void loadSounds(Context context) {
        context.getClass();
        this.soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: gw9
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                SoundPlayer.loadSounds$lambda$0(this.a, soundPool, i, i2);
            }
        });
        this.messageReceivedId = loadSound(context, R.raw.intercom_received);
        this.replyFailedId = loadSound(context, R.raw.intercom_failed);
        this.replySentId = loadSound(context, R.raw.intercom_sent);
        this.operatorReceivedId = loadSound(context, R.raw.intercom_operator);
    }

    public final void playAdminMessageReceivedSound() {
        playIfLoaded(this.messageReceivedLoaded, this.messageReceivedId);
    }

    public final void playMessageFailedSound() {
        playIfLoaded(this.replyFailedLoaded, this.replyFailedId);
    }

    public final void playMessageSentSound() {
        playIfLoaded(this.replySentLoaded, this.replySentId);
    }

    public final void playOperatorMessageReceivedSound() {
        playIfLoaded(this.operatorReceivedLoaded, this.operatorReceivedId);
    }

    public final void release() {
        this.soundPool.release();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }
}
