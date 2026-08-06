package io.intercom.android.sdk.m5.conversation.utils.audio;

import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import defpackage.a0;
import defpackage.a0a;
import defpackage.aa0;
import defpackage.b0a;
import defpackage.bw2;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.el5;
import defpackage.g2b;
import defpackage.i37;
import defpackage.o03;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.qq2;
import defpackage.r02;
import defpackage.t72;
import defpackage.t80;
import defpackage.u72;
import defpackage.v72;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.zz9;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.utilities.IoUtils;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioRecordingManager {
    private static final long AMPLITUDE_MONITORING_INTERVAL_MS = 60;
    private static final int AUDIO_BIT_RATE = 128000;
    private static final String AUDIO_FILE_EXTENSION = "m4a";
    private static final String AUDIO_RECORDINGS_FOLDER = "audio_recordings";
    private static final int AUDIO_SAMPLE_RATE = 44100;
    private static final long FILE_AVAILABILITY_BASE_DELAY_MS = 10;
    private static final int FILE_AVAILABILITY_MAX_RETRIES = 10;
    private static final double MAX_AMPLITUDE_REFERENCE = 32767.0d;
    private final i37<Float> _amplitudeLevel;
    private final i37<RecordingState> _recordingState;
    private final zz9<Float> amplitudeLevel;
    private el5 amplitudeMonitoringJob;
    private final t72 amplitudeScope;
    private final Context context;
    private File currentRecordingFile;
    private MediaRecorder mediaRecorder;
    private final zz9<RecordingState> recordingState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface RecordingResult {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Error implements RecordingResult {
            public static final int $stable = 0;
            private final String message;

            public Error(String str) {
                str.getClass();
                this.message = str;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final Error copy(String str) {
                str.getClass();
                return new Error(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && xj5.a(this.message, ((Error) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return wu0.a(new StringBuilder("Error(message="), this.message, ')');
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Success implements RecordingResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            private Success() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public int hashCode() {
                return 1987294265;
            }

            public String toString() {
                return "Success";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface RecordingState {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Completed implements RecordingState {
            public static final int $stable = 8;
            private final File file;
            private final Uri uri;

            public Completed(Uri uri, File file) {
                uri.getClass();
                file.getClass();
                this.uri = uri;
                this.file = file;
            }

            public static /* synthetic */ Completed copy$default(Completed completed, Uri uri, File file, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = completed.uri;
                }
                if ((i & 2) != 0) {
                    file = completed.file;
                }
                return completed.copy(uri, file);
            }

            public final Uri component1() {
                return this.uri;
            }

            public final File component2() {
                return this.file;
            }

            public final Completed copy(Uri uri, File file) {
                uri.getClass();
                file.getClass();
                return new Completed(uri, file);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Completed)) {
                    return false;
                }
                Completed completed = (Completed) obj;
                return xj5.a(this.uri, completed.uri) && xj5.a(this.file, completed.file);
            }

            public final File getFile() {
                return this.file;
            }

            public final Uri getUri() {
                return this.uri;
            }

            public int hashCode() {
                return this.file.hashCode() + (this.uri.hashCode() * 31);
            }

            public String toString() {
                return "Completed(uri=" + this.uri + ", file=" + this.file + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Error implements RecordingState {
            public static final int $stable = 0;
            private final String message;

            public Error(String str) {
                str.getClass();
                this.message = str;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final Error copy(String str) {
                str.getClass();
                return new Error(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && xj5.a(this.message, ((Error) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return wu0.a(new StringBuilder("Error(message="), this.message, ')');
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Idle implements RecordingState {
            public static final int $stable = 0;
            public static final Idle INSTANCE = new Idle();

            private Idle() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public int hashCode() {
                return -114329640;
            }

            public String toString() {
                return "Idle";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Recording implements RecordingState {
            public static final int $stable = 8;
            private final File file;

            public Recording(File file) {
                file.getClass();
                this.file = file;
            }

            public static /* synthetic */ Recording copy$default(Recording recording, File file, int i, Object obj) {
                if ((i & 1) != 0) {
                    file = recording.file;
                }
                return recording.copy(file);
            }

            public final File component1() {
                return this.file;
            }

            public final Recording copy(File file) {
                file.getClass();
                return new Recording(file);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Recording) && xj5.a(this.file, ((Recording) obj).file);
            }

            public final File getFile() {
                return this.file;
            }

            public int hashCode() {
                return this.file.hashCode();
            }

            public String toString() {
                return "Recording(file=" + this.file + ')';
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface RecordingStopResult {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Error implements RecordingStopResult {
            public static final int $stable = 0;
            private final String message;

            public Error(String str) {
                str.getClass();
                this.message = str;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final Error copy(String str) {
                str.getClass();
                return new Error(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && xj5.a(this.message, ((Error) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return wu0.a(new StringBuilder("Error(message="), this.message, ')');
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Success implements RecordingStopResult {
            public static final int $stable = 8;
            private final File file;
            private final Uri uri;

            public Success(Uri uri, File file) {
                uri.getClass();
                file.getClass();
                this.uri = uri;
                this.file = file;
            }

            public static /* synthetic */ Success copy$default(Success success, Uri uri, File file, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = success.uri;
                }
                if ((i & 2) != 0) {
                    file = success.file;
                }
                return success.copy(uri, file);
            }

            public final Uri component1() {
                return this.uri;
            }

            public final File component2() {
                return this.file;
            }

            public final Success copy(Uri uri, File file) {
                uri.getClass();
                file.getClass();
                return new Success(uri, file);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return xj5.a(this.uri, success.uri) && xj5.a(this.file, success.file);
            }

            public final File getFile() {
                return this.file;
            }

            public final Uri getUri() {
                return this.uri;
            }

            public int hashCode() {
                return this.file.hashCode() + (this.uri.hashCode() * 31);
            }

            public String toString() {
                return "Success(uri=" + this.uri + ", file=" + this.file + ')';
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.utils.audio.AudioRecordingManager$startAmplitudeMonitoring$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.utils.audio.AudioRecordingManager$startAmplitudeMonitoring$1", f = "AudioRecordingManager.kt", l = {346}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ MediaRecorder $recorder;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AudioRecordingManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaRecorder mediaRecorder, AudioRecordingManager audioRecordingManager, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.$recorder = mediaRecorder;
            this.this$0 = audioRecordingManager;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$recorder, this.this$0, r02Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            t72 t72Var;
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                t72Var = (t72) this.L$0;
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t72Var = (t72) this.L$0;
                dv8.b(obj);
            }
            while (u72.e(t72Var)) {
                try {
                    this.this$0._amplitudeLevel.setValue(new Float(this.this$0.normalizeAmplitude(this.$recorder.getMaxAmplitude())));
                } catch (Exception unused) {
                    this.this$0._amplitudeLevel.setValue(new Float(0.0f));
                }
                this.L$0 = t72Var;
                this.label = 1;
                Object objB = bw2.b(60L, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            }
            return g2b.a;
        }
    }

    public AudioRecordingManager(Context context, t72 t72Var) {
        context.getClass();
        t72Var.getClass();
        this.context = context;
        this.amplitudeScope = t72Var;
        a0a a0aVarB = b0a.b(RecordingState.Idle.INSTANCE);
        this._recordingState = a0aVarB;
        this.recordingState = yk2.b(a0aVarB);
        a0a a0aVarB2 = b0a.b(Float.valueOf(0.0f));
        this._amplitudeLevel = a0aVarB2;
        this.amplitudeLevel = yk2.b(a0aVarB2);
    }

    private final void cleanup() {
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (Exception unused) {
            }
            mediaRecorder.release();
        }
        this.mediaRecorder = null;
        File file = this.currentRecordingFile;
        if (file != null) {
            IoUtils.safelyDelete(file);
        }
        this.currentRecordingFile = null;
    }

    private final void configureRecorder(MediaRecorder mediaRecorder, File file) {
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setAudioEncoder(3);
        mediaRecorder.setAudioSamplingRate(44100);
        mediaRecorder.setAudioEncodingBitRate(128000);
        mediaRecorder.setOutputFile(file.getAbsolutePath());
    }

    private final File createAudioFile() throws IOException {
        File externalCacheDir = this.context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = this.context.getCacheDir();
        }
        if (externalCacheDir == null) {
            o03.a("Unable to access cache directories for audio recording");
            return null;
        }
        File file = new File(externalCacheDir, AUDIO_RECORDINGS_FOLDER);
        file.mkdirs();
        return new File(file, UUID.randomUUID() + AudioConstants.AUDIO_FILE_EXTENSION);
    }

    private final MediaRecorder createMediaRecorder() {
        return Build.VERSION.SDK_INT >= 31 ? t80.a(this.context) : new MediaRecorder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float normalizeAmplitude(int i) {
        if (i <= 0) {
            return 0.0f;
        }
        return (float) Math.max(0.0d, ((Math.log10(Math.max(((double) i) / MAX_AMPLITUDE_REFERENCE, 0.001d)) * 20.0d) + 60.0d) / 60.0d);
    }

    private final void startAmplitudeMonitoring(MediaRecorder mediaRecorder) {
        this.amplitudeMonitoringJob = oy0.d(this.amplitudeScope, null, null, new AnonymousClass1(mediaRecorder, this, null), 3);
    }

    private final void stopAmplitudeMonitoring() {
        el5 el5Var = this.amplitudeMonitoringJob;
        if (el5Var != null) {
            el5Var.k(null);
        }
        this.amplitudeMonitoringJob = null;
        this._amplitudeLevel.setValue(Float.valueOf(0.0f));
    }

    private final boolean waitForFileAvailability(File file) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            if (file.exists() && file.length() > 0) {
                return true;
            }
            if (i < 9) {
                Thread.sleep(((long) (1 << i)) * 10);
            }
        }
        return false;
    }

    public final void cancelRecording() {
        stopAmplitudeMonitoring();
        cleanup();
        this._recordingState.setValue(RecordingState.Idle.INSTANCE);
    }

    public final void cleanupCompletedRecording() {
        RecordingState value = this._recordingState.getValue();
        if (value instanceof RecordingState.Completed) {
            IoUtils.safelyDelete(((RecordingState.Completed) value).getFile());
        }
        this._recordingState.setValue(RecordingState.Idle.INSTANCE);
    }

    public final void dispose() {
        stopAmplitudeMonitoring();
        cleanup();
        cleanupCompletedRecording();
        this._recordingState.setValue(RecordingState.Idle.INSTANCE);
    }

    public final zz9<Float> getAmplitudeLevel() {
        return this.amplitudeLevel;
    }

    public final zz9<RecordingState> getRecordingState() {
        return this.recordingState;
    }

    public final RecordingResult startRecording() {
        try {
            if (!xj5.a(this._recordingState.getValue(), RecordingState.Idle.INSTANCE)) {
                return new RecordingResult.Error("Recording already in progress");
            }
            File fileCreateAudioFile = createAudioFile();
            this.currentRecordingFile = fileCreateAudioFile;
            MediaRecorder mediaRecorderCreateMediaRecorder = createMediaRecorder();
            this.mediaRecorder = mediaRecorderCreateMediaRecorder;
            configureRecorder(mediaRecorderCreateMediaRecorder, fileCreateAudioFile);
            mediaRecorderCreateMediaRecorder.prepare();
            mediaRecorderCreateMediaRecorder.start();
            startAmplitudeMonitoring(mediaRecorderCreateMediaRecorder);
            this._recordingState.setValue(new RecordingState.Recording(fileCreateAudioFile));
            return RecordingResult.Success.INSTANCE;
        } catch (IOException e) {
            stopAmplitudeMonitoring();
            cleanup();
            this._recordingState.setValue(new RecordingState.Error("Failed to start recording: " + e.getMessage()));
            return new RecordingResult.Error("Failed to start recording: " + e.getMessage());
        } catch (Exception e2) {
            stopAmplitudeMonitoring();
            cleanup();
            this._recordingState.setValue(new RecordingState.Error(a0.a(e2, new StringBuilder("Unexpected error: "))));
            return new RecordingResult.Error(a0.a(e2, new StringBuilder("Unexpected error: ")));
        }
    }

    public final RecordingStopResult stopRecording() {
        try {
            MediaRecorder mediaRecorder = this.mediaRecorder;
            File file = this.currentRecordingFile;
            if (mediaRecorder != null && file != null) {
                stopAmplitudeMonitoring();
                mediaRecorder.stop();
                mediaRecorder.release();
                this.mediaRecorder = null;
                if (!waitForFileAvailability(file)) {
                    cleanup();
                    this._recordingState.setValue(new RecordingState.Error("Recording file is empty or missing"));
                    return new RecordingStopResult.Error("Recording file is empty or missing");
                }
                Context context = this.context;
                Uri uriForFile = FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file);
                i37<RecordingState> i37Var = this._recordingState;
                uriForFile.getClass();
                i37Var.setValue(new RecordingState.Completed(uriForFile, file));
                return new RecordingStopResult.Success(uriForFile, file);
            }
            this._recordingState.setValue(new RecordingState.Error("No active recording"));
            return new RecordingStopResult.Error("No active recording");
        } catch (Exception e) {
            stopAmplitudeMonitoring();
            cleanup();
            this._recordingState.setValue(new RecordingState.Error(a0.a(e, new StringBuilder("Failed to stop recording: "))));
            return new RecordingStopResult.Error(a0.a(e, new StringBuilder("Failed to stop recording: ")));
        }
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
