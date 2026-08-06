package io.intercom.android.sdk.m5.conversation.errors;

import defpackage.qq2;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class VoiceTranscriptionError {
    public static final int $stable = 8;
    private final Throwable cause;
    private final String debugMessage;
    private final StringProvider userMessage;

    private VoiceTranscriptionError(StringProvider stringProvider, String str, Throwable th) {
        this.userMessage = stringProvider;
        this.debugMessage = str;
        this.cause = th;
    }

    public final Throwable getCause() {
        return this.cause;
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final StringProvider getUserMessage() {
        return this.userMessage;
    }

    public /* synthetic */ VoiceTranscriptionError(StringProvider stringProvider, String str, Throwable th, qq2 qq2Var) {
        this(stringProvider, str, th);
    }

    public /* synthetic */ VoiceTranscriptionError(StringProvider stringProvider, String str, Throwable th, int i, qq2 qq2Var) {
        this(stringProvider, str, (i & 4) != 0 ? null : th, null);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class FileTooLarge extends VoiceTranscriptionError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public FileTooLarge(Throwable th) {
            super(new StringProvider.StringRes(R.string.intercom_file_too_large_to_transcribe, null, 2, 0 == true ? 1 : 0), "Audio file exceeds maximum size limit", th, 0 == true ? 1 : 0);
        }

        public /* synthetic */ FileTooLarge(Throwable th, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FileTooLarge() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class RecordingFailed extends VoiceTranscriptionError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public RecordingFailed(Throwable th) {
            String message;
            super(new StringProvider.StringRes(R.string.intercom_something_went_wrong_try_again, null, 2, 0 == true ? 1 : 0), "Audio recording failed: ".concat((th == null || (message = th.getMessage()) == null) ? "Unknown error" : message), th, 0 == true ? 1 : 0);
        }

        public /* synthetic */ RecordingFailed(Throwable th, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RecordingFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TranscriptionFailed extends VoiceTranscriptionError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public TranscriptionFailed(Throwable th) {
            String message;
            super(new StringProvider.StringRes(R.string.intercom_transcription_failed, null, 2, 0 == true ? 1 : 0), "Transcription failed: ".concat((th == null || (message = th.getMessage()) == null) ? "Unknown error" : message), th, 0 == true ? 1 : 0);
        }

        public /* synthetic */ TranscriptionFailed(Throwable th, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TranscriptionFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
