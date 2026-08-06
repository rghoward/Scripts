package io.intercom.android.sdk.m5.conversation.utils.audio;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioConstants {
    public static final int $stable = 0;
    public static final int AUDIO_BIT_RATE = 128000;
    public static final int AUDIO_FILE_BUFFER_SIZE = 2048;
    public static final String AUDIO_FILE_EXTENSION = ".m4a";
    public static final String AUDIO_MEDIA_TYPE = "audio/m4a";
    public static final int AUDIO_SAMPLE_RATE = 44100;
    public static final long FILE_AVAILABILITY_BASE_DELAY_MS = 10;
    public static final int FILE_AVAILABILITY_MAX_RETRIES = 10;
    public static final AudioConstants INSTANCE = new AudioConstants();
    public static final int MAX_AUDIO_FILE_SIZE_MB = 10;
    public static final long MAX_RECORDING_DURATION_MS = 300000;
    public static final long MIN_RECORDING_DURATION_MS = 1000;
    public static final String TEMP_AUDIO_FILE_PREFIX = "intercom_voice_";
    public static final long TRANSCRIPTION_TIMEOUT_MS = 30000;

    private AudioConstants() {
    }
}
