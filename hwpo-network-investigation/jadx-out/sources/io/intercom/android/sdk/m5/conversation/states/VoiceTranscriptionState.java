package io.intercom.android.sdk.m5.conversation.states;

import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.errors.VoiceTranscriptionError;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface VoiceTranscriptionState {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Completed implements VoiceTranscriptionState {
        public static final int $stable = 0;
        public static final Completed INSTANCE = new Completed();

        private Completed() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Completed);
        }

        public int hashCode() {
            return -291535589;
        }

        public String toString() {
            return "Completed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error implements VoiceTranscriptionState {
        public static final int $stable = 8;
        private final VoiceTranscriptionError error;

        public Error(VoiceTranscriptionError voiceTranscriptionError) {
            voiceTranscriptionError.getClass();
            this.error = voiceTranscriptionError;
        }

        public static /* synthetic */ Error copy$default(Error error, VoiceTranscriptionError voiceTranscriptionError, int i, Object obj) {
            if ((i & 1) != 0) {
                voiceTranscriptionError = error.error;
            }
            return error.copy(voiceTranscriptionError);
        }

        public final VoiceTranscriptionError component1() {
            return this.error;
        }

        public final Error copy(VoiceTranscriptionError voiceTranscriptionError) {
            voiceTranscriptionError.getClass();
            return new Error(voiceTranscriptionError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && xj5.a(this.error, ((Error) obj).error);
        }

        public final VoiceTranscriptionError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Idle implements VoiceTranscriptionState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public int hashCode() {
            return 1546170116;
        }

        public String toString() {
            return "Idle";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Processing implements VoiceTranscriptionState {
        public static final int $stable = 0;
        public static final Processing INSTANCE = new Processing();

        private Processing() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Processing);
        }

        public int hashCode() {
            return 515734083;
        }

        public String toString() {
            return "Processing";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Recording implements VoiceTranscriptionState {
        public static final int $stable = 0;
        public static final Recording INSTANCE = new Recording();

        private Recording() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Recording);
        }

        public int hashCode() {
            return 2104954049;
        }

        public String toString() {
            return "Recording";
        }
    }
}
