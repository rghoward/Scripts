package io.intercom.android.sdk.m5.conversation.usecase;

import com.intercom.twig.Twig;
import defpackage.av8;
import defpackage.g2b;
import defpackage.ib7;
import defpackage.qq2;
import defpackage.xj5;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioRecordingManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioRecordingUseCase {
    public static final int $stable = 8;
    private final AudioRecordingManager audioRecordingManager;
    private final Twig twig;

    public AudioRecordingUseCase(AudioRecordingManager audioRecordingManager, Twig twig) {
        audioRecordingManager.getClass();
        twig.getClass();
        this.audioRecordingManager = audioRecordingManager;
        this.twig = twig;
    }

    public final void cancelRecording() {
        this.audioRecordingManager.cancelRecording();
    }

    public final void cleanupCompletedRecording() {
        this.audioRecordingManager.cleanupCompletedRecording();
    }

    /* JADX INFO: renamed from: startRecording-d1pmJ48, reason: not valid java name */
    public final Object m295startRecordingd1pmJ48() {
        try {
            if (!xj5.a(this.audioRecordingManager.getRecordingState().getValue(), AudioRecordingManager.RecordingState.Idle.INSTANCE)) {
                this.audioRecordingManager.cancelRecording();
            }
            AudioRecordingManager.RecordingResult recordingResultStartRecording = this.audioRecordingManager.startRecording();
            if (recordingResultStartRecording instanceof AudioRecordingManager.RecordingResult.Success) {
                return g2b.a;
            }
            if (!(recordingResultStartRecording instanceof AudioRecordingManager.RecordingResult.Error)) {
                throw new ib7();
            }
            this.twig.e("Failed to start recording: " + ((AudioRecordingManager.RecordingResult.Error) recordingResultStartRecording).getMessage(), new Object[0]);
            this.audioRecordingManager.cancelRecording();
            return new av8.a(new RecordingException(((AudioRecordingManager.RecordingResult.Error) recordingResultStartRecording).getMessage(), null, 2, null));
        } catch (Exception e) {
            this.twig.e(e, "Failed to start recording", new Object[0]);
            this.audioRecordingManager.cancelRecording();
            return new av8.a(e);
        }
    }

    /* JADX INFO: renamed from: stopRecording-d1pmJ48, reason: not valid java name */
    public final Object m296stopRecordingd1pmJ48() {
        try {
            AudioRecordingManager.RecordingStopResult recordingStopResultStopRecording = this.audioRecordingManager.stopRecording();
            if (recordingStopResultStopRecording instanceof AudioRecordingManager.RecordingStopResult.Success) {
                return new RecordedAudioFile(((AudioRecordingManager.RecordingStopResult.Success) recordingStopResultStopRecording).getFile(), ((AudioRecordingManager.RecordingStopResult.Success) recordingStopResultStopRecording).getUri());
            }
            if (!(recordingStopResultStopRecording instanceof AudioRecordingManager.RecordingStopResult.Error)) {
                throw new ib7();
            }
            this.twig.e("Failed to stop recording: " + ((AudioRecordingManager.RecordingStopResult.Error) recordingStopResultStopRecording).getMessage(), new Object[0]);
            this.audioRecordingManager.cancelRecording();
            return new av8.a(new RecordingException(((AudioRecordingManager.RecordingStopResult.Error) recordingStopResultStopRecording).getMessage(), null, 2, null));
        } catch (Exception e) {
            this.twig.e(e, "Failed to stop recording", new Object[0]);
            this.audioRecordingManager.cancelRecording();
            return new av8.a(e);
        }
    }

    public /* synthetic */ AudioRecordingUseCase(AudioRecordingManager audioRecordingManager, Twig twig, int i, qq2 qq2Var) {
        this(audioRecordingManager, (i & 2) != 0 ? LumberMill.getLogger() : twig);
    }
}
